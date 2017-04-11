package br.com.processamento.lote.configuracao.componentes;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.FixedLengthTokenizer;
import org.springframework.batch.item.file.transform.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import br.com.processamento.lote.dominio.parametrofaturamento.ParametroFaturamento;
import br.com.processamento.lote.dominio.parametrofaturamento.ParametroFaturamentoArquivoTexto;
import br.com.processamento.lote.dominio.parametrofaturamento.ParametroFaturamentoItemProcessor;
import br.com.processamento.lote.dominio.parametrofaturamento.ParametroFaturamentoJobListener;

/**
 * @author marcos.buganeme
 */
@Component
@Configuration
@EnableBatchProcessing(modular = true)
public class ParametroFaturamentoReader {

  private static final Resource RESOURCE = new ClassPathResource("PFAT9920170117.TXT");
  private static final String[] CAMPOS = { "condicaoFinanciamento", "dataFaturamento", "dataVencimento", "plano", "coeficiente", "taxa", "fillerUm", "diasPagamento", "filial", "tipoPessoa", "tipoCliente","tipoOperacao", "diasPrimeiroVencimento", "taxaAntecipacao", "codigoEmpresa", "taxaCancelamento", "taxaProrrogacao", "tipoCondicao", "quantidadeDiasProximoVencimento", "fillerDois" };
  private static final Range[] DELIMITADORES = {new Range(1, 9), new Range(10, 17), new Range(18, 25), new Range(26, 27), new Range(28, 37), new Range(38, 46), new Range(47, 52), new Range(53, 54), new Range(55, 58), new Range(59, 59), new Range(60, 64), new Range(65, 65), new Range(66, 70), new Range(71, 79), new Range(80, 81), new Range(82, 87), new Range(88, 93), new Range(94, 94), new Range(95, 99), new Range(100, 102)};
  private static final String INSERT_SQL = "INSERT INTO parametro_faturamento (condicaoFinanciamento, dataFaturamento, dataVencimento, plano, coeficiente, taxa, diasPagamento, filial, tipoPessoa, tipoCliente, tipoOperacao, diasPrimeiroVencimento, taxaAntecipacao, codigoEmpresa, taxaCancelamento, taxaProrrogacao, tipoCondicao, quantidadeDiasProximoVencimento) values (:condicaoFinanciamento, :dataFaturamento, :dataVencimento, :plano, :coeficiente, :taxa, :diasPagamento, :filial, :tipoPessoa, :tipoCliente, :tipoOperacao, :diasPrimeiroVencimento, :taxaAntecipacao, :codigoEmpresa, :taxaCancelamento, :taxaProrrogacao, :tipoCondicao, :quantidadeDiasProximoVencimento)";

  @Autowired private DataSource dataSource;
  @Autowired private JobBuilderFactory jobBuilderFactory;
  @Autowired private StepBuilderFactory stepBuilderFactory;

  @Bean
  public FlatFileItemReader<ParametroFaturamentoArquivoTexto> parametroFaturamentoFlatFileItemReader() {
      FlatFileItemReader<ParametroFaturamentoArquivoTexto> reader = new FlatFileItemReader<ParametroFaturamentoArquivoTexto>();

      reader.setResource(RESOURCE);
      reader.setLineMapper(new DefaultLineMapper<ParametroFaturamentoArquivoTexto>() {{
          setLineTokenizer(new FixedLengthTokenizer() {{
            setNames(CAMPOS);
            setColumns(DELIMITADORES);
          }});
          setFieldSetMapper(new BeanWrapperFieldSetMapper<ParametroFaturamentoArquivoTexto>() {{
              setTargetType(ParametroFaturamentoArquivoTexto.class);
          }});
      }});
      return reader;
  }

  @Bean
  public ParametroFaturamentoItemProcessor parametroFaturamentoItemProcessor() {
      return new ParametroFaturamentoItemProcessor();
  }

  @Bean
  public JdbcBatchItemWriter<ParametroFaturamento> parametroFaturamentoJdbcBatchItemWriter() {
      JdbcBatchItemWriter<ParametroFaturamento> writer = new JdbcBatchItemWriter<ParametroFaturamento>();
      writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<ParametroFaturamento>());
      writer.setSql(INSERT_SQL);
      writer.setDataSource(dataSource);
      return writer;
  }

  @Bean
  public Job parametroFaturamentoJob(ParametroFaturamentoJobListener listener) {
    return jobBuilderFactory.get("parametroFaturamentoJob")
              .incrementer(new RunIdIncrementer())
              .listener(listener)
              .flow(parametroFaturamentoStep())
              .end()
              .build();
  }

  @Bean
  public Step parametroFaturamentoStep() {
      return stepBuilderFactory.get("parametroFaturamentoStep")
              .<ParametroFaturamentoArquivoTexto, ParametroFaturamento> chunk(10)
              .reader(parametroFaturamentoFlatFileItemReader())
              .processor(parametroFaturamentoItemProcessor())
              .writer(parametroFaturamentoJdbcBatchItemWriter())
              .build();
  }
}
