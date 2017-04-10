package br.com.processamento.lote.configuracao;

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

import br.com.processamento.lote.dominio.atualizacaocliente.AtualizacaoCliente;
import br.com.processamento.lote.dominio.atualizacaocliente.AtualizacaoClienteArquivoTexto;
import br.com.processamento.lote.dominio.atualizacaocliente.AtualizacaoClienteItemProcessor;
import br.com.processamento.lote.dominio.atualizacaocliente.AtualizacaoClienteJobListener;
import br.com.processamento.lote.dominio.dicionarioretorno.DicionarioRetorno;
import br.com.processamento.lote.dominio.dicionarioretorno.DicionarioRetornoArquivoTexto;
import br.com.processamento.lote.dominio.dicionarioretorno.DicionarioRetornoItemProcessor;
import br.com.processamento.lote.dominio.dicionarioretorno.DicionarioRetornoJobListener;
import br.com.processamento.lote.dominio.parametrofaturamento.ParametroFaturamento;
import br.com.processamento.lote.dominio.parametrofaturamento.ParametroFaturamentoArquivoTexto;
import br.com.processamento.lote.dominio.parametrofaturamento.ParametroFaturamentoItemProcessor;
import br.com.processamento.lote.dominio.parametrofaturamento.ParametroFaturamentoJobListener;

/**
 * @author marcos.buganeme
 *
 */
@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public DataSource dataSource;

    /**
     * Configuração de dicionário de retorno
     * */

    @Bean
    public FlatFileItemReader<DicionarioRetornoArquivoTexto> dicionarioRetornoFlatFileItemReader() {
        FlatFileItemReader<DicionarioRetornoArquivoTexto> reader = new FlatFileItemReader<DicionarioRetornoArquivoTexto>();
        Range[] delimitadores = {new Range(1, 3), new Range(4, 258), new Range(259, 300)};
        reader.setResource(new ClassPathResource("DR9920161117.TXT"));
        reader.setLineMapper(new DefaultLineMapper<DicionarioRetornoArquivoTexto>() {{
            setLineTokenizer(new FixedLengthTokenizer() {{
            	setColumns(delimitadores);
                setNames(new String[] { "codigo", "descricao", "filler" });
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
        writer.setSql("INSERT INTO dicionario_retorno (codigo, descricao) VALUES (:codigo, :descricao)");
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

    /**
     * Fim da configuração de dicionário de retorno
     * */
    
    /**
     * Início configuração de parametros de faturamento
     * */
    @Bean
    public FlatFileItemReader<ParametroFaturamentoArquivoTexto> parametroFaturamentoFlatFileItemReader() {
        FlatFileItemReader<ParametroFaturamentoArquivoTexto> reader = new FlatFileItemReader<ParametroFaturamentoArquivoTexto>();
        final Range[] delimitadores = {new Range(1, 9), new Range(10, 17), new Range(18, 25), new Range(26, 27), new Range(28, 37), new Range(38, 46), new Range(47, 52), new Range(53, 54), new Range(55, 58), new Range(59, 59), new Range(60, 64), new Range(65, 65), new Range(66, 70), new Range(71, 79), new Range(80, 81), new Range(82, 87), new Range(88, 93), new Range(94, 94), new Range(95, 99), new Range(100, 102)};
        final String[] camposMapeadosEmSql = { "condicaoFinanciamento", "dataFaturamento", "dataVencimento", "plano", "coeficiente", "taxa", "fillerUm", "diasPagamento", "filial", "tipoPessoa", "tipoCliente","tipoOperacao", "diasPrimeiroVencimento", "taxaAntecipacao", "codigoEmpresa", "taxaCancelamento", "taxaProrrogacao", "tipoCondicao", "quantidadeDiasProximoVencimento", "fillerDois" };

        reader.setResource(new ClassPathResource("PFAT9920170117.TXT"));
        reader.setLineMapper(new DefaultLineMapper<ParametroFaturamentoArquivoTexto>() {{
            setLineTokenizer(new FixedLengthTokenizer() {{
              setColumns(delimitadores);
                setNames(camposMapeadosEmSql);
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
        writer.setSql("INSERT INTO parametro_faturamento (condicaoFinanciamento, dataFaturamento, dataVencimento, plano, coeficiente, taxa, diasPagamento, filial, tipoPessoa, tipoCliente, tipoOperacao, diasPrimeiroVencimento, taxaAntecipacao, codigoEmpresa, taxaCancelamento, taxaProrrogacao, tipoCondicao, quantidadeDiasProximoVencimento) values (:condicaoFinanciamento, :dataFaturamento, :dataVencimento, :plano, :coeficiente, :taxa, :diasPagamento, :filial, :tipoPessoa, :tipoCliente, :tipoOperacao, :diasPrimeiroVencimento, :taxaAntecipacao, :codigoEmpresa, :taxaCancelamento, :taxaProrrogacao, :tipoCondicao, :quantidadeDiasProximoVencimento)");
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

    /**
     * Fim da configuração de parametros de faturamento
     * */

    /**
     * Início configuração de atualização de cliente
     * */

    @Bean
    public FlatFileItemReader<AtualizacaoClienteArquivoTexto> atualizacaoClienteFlatFileItemReader() {
        FlatFileItemReader<AtualizacaoClienteArquivoTexto> reader = new FlatFileItemReader<AtualizacaoClienteArquivoTexto>();
        final Range[] delimitadores = {new Range(1, 9), new Range(10, 17), new Range(18, 25), new Range(26, 27), new Range(28, 37), new Range(38, 46), new Range(47, 52), new Range(53, 54), new Range(55, 58), new Range(59, 59), new Range(60, 64), new Range(65, 65), new Range(66, 70), new Range(71, 79), new Range(80, 81), new Range(82, 87), new Range(88, 93), new Range(94, 94), new Range(95, 99), new Range(100, 102)};
        final String[] camposMapeadosEmSql = { "condicaoFinanciamento", "dataFaturamento", "dataVencimento", "plano", "coeficiente", "taxa", "fillerUm", "diasPagamento", "filial", "tipoPessoa", "tipoCliente","tipoOperacao", "diasPrimeiroVencimento", "taxaAntecipacao", "codigoEmpresa", "taxaCancelamento", "taxaProrrogacao", "tipoCondicao", "quantidadeDiasProximoVencimento", "fillerDois" };

        reader.setResource(new ClassPathResource("PFAT9920170117.TXT"));
        reader.setLineMapper(new DefaultLineMapper<AtualizacaoClienteArquivoTexto>() {{
            setLineTokenizer(new FixedLengthTokenizer() {{
              setColumns(delimitadores);
                setNames(camposMapeadosEmSql);
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<AtualizacaoClienteArquivoTexto>() {{
                setTargetType(AtualizacaoClienteArquivoTexto.class);
            }});
        }});
        return reader;
    }

    @Bean
    public AtualizacaoClienteItemProcessor atualizacaoClienteItemProcessor() {
        return new AtualizacaoClienteItemProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<AtualizacaoCliente> atualizacaoClienteJdbcBatchItemWriter() {
        JdbcBatchItemWriter<AtualizacaoCliente> writer = new JdbcBatchItemWriter<AtualizacaoCliente>();
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<AtualizacaoCliente>());
        writer.setSql("INSERT INTO atualizacao_cliente (condicaoFinanciamento, dataFaturamento, dataVencimento, plano, coeficiente, taxa, diasPagamento, filial, tipoPessoa, tipoCliente, tipoOperacao, diasPrimeiroVencimento, taxaAntecipacao, codigoEmpresa, taxaCancelamento, taxaProrrogacao, tipoCondicao, quantidadeDiasProximoVencimento) values (:condicaoFinanciamento, :dataFaturamento, :dataVencimento, :plano, :coeficiente, :taxa, :diasPagamento, :filial, :tipoPessoa, :tipoCliente, :tipoOperacao, :diasPrimeiroVencimento, :taxaAntecipacao, :codigoEmpresa, :taxaCancelamento, :taxaProrrogacao, :tipoCondicao, :quantidadeDiasProximoVencimento)");
        writer.setDataSource(dataSource);
        return writer;
    }

    @Bean
    public Job atualizacaoClienteJob(AtualizacaoClienteJobListener listener) {
      return jobBuilderFactory.get("atualizacaoClienteJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(parametroFaturamentoStep())
                .end()
                .build();
    }

    @Bean
    public Step atualizacaoClienteStep() {
        return stepBuilderFactory.get("atualizacaoClienteStep")
                .<ParametroFaturamentoArquivoTexto, ParametroFaturamento> chunk(10)
                .reader(parametroFaturamentoFlatFileItemReader())
                .processor(parametroFaturamentoItemProcessor())
                .writer(parametroFaturamentoJdbcBatchItemWriter())
                .build();
    }

    /**
     * Fim da configuração de atualização de cliente
     * */
}
