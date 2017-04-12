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

import br.com.processamento.lote.dominio.dicionarioretorno.DicionarioRetorno;
import br.com.processamento.lote.dominio.dicionarioretorno.DicionarioRetornoArquivoTexto;
import br.com.processamento.lote.dominio.dicionarioretorno.DicionarioRetornoItemProcessor;
import br.com.processamento.lote.dominio.dicionarioretorno.DicionarioRetornoJobListener;

/**
 * @author marcos.buganeme
 */
@Configuration
@EnableBatchProcessing(modular = true)
public class DicionarioRetornoReader {

  private static final Resource RESOURCE = new ClassPathResource("DR9920161117.TXT");
  private static final String[] CAMPOS = new String[] { "codigo", "descricao", "filler" };
  private static final Range[] DELIMITADORES = {new Range(1, 3), new Range(4, 258), new Range(259, 300)};
  private static final String INSERT_SQL = "INSERT INTO dicionario_retorno (codigo, descricao) VALUES (:codigo, :descricao)";

  @Autowired private DataSource dataSource;
  @Autowired private JobBuilderFactory jobBuilderFactory;
  @Autowired private StepBuilderFactory stepBuilderFactory;

  @Bean
  public FlatFileItemReader<DicionarioRetornoArquivoTexto> dicionarioRetornoFlatFileItemReader() {
      final FlatFileItemReader<DicionarioRetornoArquivoTexto> reader = new FlatFileItemReader<DicionarioRetornoArquivoTexto>();
      reader.setResource(RESOURCE);
      reader.setLineMapper(new DefaultLineMapper<DicionarioRetornoArquivoTexto>() {{
          setLineTokenizer(new FixedLengthTokenizer() {{
            setNames(CAMPOS);
            setColumns(DELIMITADORES);
          }});
          setFieldSetMapper(new BeanWrapperFieldSetMapper<DicionarioRetornoArquivoTexto>() {{
              setTargetType(DicionarioRetornoArquivoTexto.class);
          }});
      }});
      return reader;
  }

  @Bean
  public DicionarioRetornoItemProcessor dicionarioRetornoItemProcessor() {
      return new DicionarioRetornoItemProcessor();
  }

  @Bean
  public JdbcBatchItemWriter<DicionarioRetorno> dicionarioRetornoJdbcBatchItemWriter() {
      JdbcBatchItemWriter<DicionarioRetorno> writer = new JdbcBatchItemWriter<DicionarioRetorno>();
      writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<DicionarioRetorno>());
      writer.setSql(INSERT_SQL);
      writer.setDataSource(dataSource);
      return writer;
  }

  @Bean
  public Step dicionarioRetornoStep() {
      return stepBuilderFactory.get("dicionarioRetornoStep")
              .<DicionarioRetornoArquivoTexto, DicionarioRetorno> chunk(10)
              .reader(dicionarioRetornoFlatFileItemReader())
              .processor(dicionarioRetornoItemProcessor())
              .writer(dicionarioRetornoJdbcBatchItemWriter())
              .build();
  }

  @Bean
  public Job dicionarioRetornoJob(DicionarioRetornoJobListener listener) {
    return jobBuilderFactory.get("dicionarioRetornoJob")
              .incrementer(new RunIdIncrementer())
              .listener(listener)
              .flow(dicionarioRetornoStep())
              .end()
              .build();
  }
}
