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

import br.com.processamento.lote.dominio.dicionarioretorno.DicionarioRetornoJobListener;
import br.com.processamento.lote.dominio.parametrofaturamento.ParametroFaturamento;
import br.com.processamento.lote.dominio.parametrofaturamento.ParametroFaturamentoItemProcessor;

/**
 * @author marcos.buganeme
 *
 */
@Configuration
@EnableBatchProcessing
public class ParametroFaturamentoBatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public DataSource dataSource;

    @Bean
    public FlatFileItemReader<ParametroFaturamento> reader() {
        FlatFileItemReader<ParametroFaturamento> reader = new FlatFileItemReader<ParametroFaturamento>();
        Range[] delimitadores = {new Range(1, 9), new Range(10, 17), new Range(18, 25), new Range(26, 27), new Range(28, 37), new Range(38, 46), new Range(47, 52), new Range(53, 54), new Range(55, 58), new Range(59, 59), new Range(60, 64), new Range(65, 65), new Range(66, 70), new Range(71, 79), new Range(80, 81), new Range(82, 87), new Range(88, 93), new Range(94, 94), new Range(95, 99), new Range(100, 102)};
        reader.setResource(new ClassPathResource("PFAT9920160825.TXT"));
        reader.setLineMapper(new DefaultLineMapper<ParametroFaturamento>() {{
            setLineTokenizer(new FixedLengthTokenizer() {{
            	setColumns(delimitadores);
                setNames(new String[] { "condicaoFinanciamento", "dataFaturamento", "dataVencimento", "plano", "coeficiente", "taxa", "fillerUm", "diasPagamento", "tipoPessoa", "tipoCliente","tipoOperacao", "diasPrimeiroVencimento", "taxaAntecipacao", "codigoEmpresa", "taxaCancelamento", "taxaProrrogacao", "tipoCondicao", "quantidadeDiasProximoVencimento", "fillerDois" });
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<ParametroFaturamento>() {{
                setTargetType(ParametroFaturamento.class);
            }});
        }});
        return reader;
    }

    @Bean
    public ParametroFaturamentoItemProcessor dicionarioRetornoProcessor() {
        return new ParametroFaturamentoItemProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<ParametroFaturamento> writer() {
        JdbcBatchItemWriter<ParametroFaturamento> writer = new JdbcBatchItemWriter<ParametroFaturamento>();
        String sqlInserir = "INSERT INTO parametro_faturamento (condicaoFinanciamento, dataFaturamento, dataVencimento, plano, coeficiente, taxa, diasPagamento, tipoPessoa, tipoCliente, tipoOperacao, diasPrimeiroVencimento, taxaAntecipacao, codigoEmpresa, taxaCancelamento, taxaProrrogacao, tipoCondicao, quantidadeDiasProximoVencimento) values (:condicao_financiamento, :data_faturamento, :data_vencimento, :plano, :coeficiente, :taxa, :dias_pagamento, :tipo_pessoa, :tipo_cliente, :tipo_operacao, :dias_primeiro_vencimento, :taxa_antecipacao, :codigo_empresa, :taxa_cancelamento, :taxa_prorrogacao, :tipo_condicao, :quantidade_dias_proximo_vencimento)";
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<ParametroFaturamento>());
        writer.setSql(sqlInserir);
        writer.setDataSource(dataSource);
        return writer;
    }

    @Bean
    public Job jobDicionarioRetorno(DicionarioRetornoJobListener listener) {
    	return jobBuilderFactory.get("jobParametroFaturamento")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(stepDicionarioRetorno())
                .end()
                .build();
    }

    @Bean
    public Step stepDicionarioRetorno() {
        return stepBuilderFactory.get("stepParametroFaturamento")
                .<ParametroFaturamento, ParametroFaturamento> chunk(10)
                .reader(reader())
                .processor(dicionarioRetornoProcessor())
                .writer(writer())
                .build();
    }
}
