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

import br.com.processamento.lote.dominio.dicionarioretorno.DicionarioRetorno;
import br.com.processamento.lote.dominio.dicionarioretorno.DicionarioRetornoItemProcessor;
import br.com.processamento.lote.dominio.dicionarioretorno.DicionarioRetornoJobListener;

/**
 * @author marcos.buganeme
 *
 */
@Configuration
@EnableBatchProcessing
public class DicionarioRetornoBatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public DataSource dataSource;

    @Bean
    public FlatFileItemReader<DicionarioRetorno> reader() {
        FlatFileItemReader<DicionarioRetorno> reader = new FlatFileItemReader<DicionarioRetorno>();
        Range[] delimitadores = {new Range(1, 3), new Range(4, 300)};
        reader.setResource(new ClassPathResource("DR9920161117.TXT"));
        reader.setLineMapper(new DefaultLineMapper<DicionarioRetorno>() {{
            setLineTokenizer(new FixedLengthTokenizer() {{
            	setColumns(delimitadores);
                setNames(new String[] { "codigo", "descricao" });
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<DicionarioRetorno>() {{
                setTargetType(DicionarioRetorno.class);
            }});
        }});
        return reader;
    }

    @Bean
    public DicionarioRetornoItemProcessor dicionarioRetornoProcessor() {
        return new DicionarioRetornoItemProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<DicionarioRetorno> writer() {
        JdbcBatchItemWriter<DicionarioRetorno> writer = new JdbcBatchItemWriter<DicionarioRetorno>();
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<DicionarioRetorno>());
        writer.setSql("INSERT INTO dicionario_retorno (codigo, descricao) VALUES (:codigo, :descricao)");
        writer.setDataSource(dataSource);
        return writer;
    }

    @Bean
    public Job jobDicionarioRetorno(DicionarioRetornoJobListener listener) {
    	return jobBuilderFactory.get("jobdicionarioretorno")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(stepDicionarioRetorno())
                .end()
                .build();
    }

    @Bean
    public Step stepDicionarioRetorno() {
        return stepBuilderFactory.get("stepDicionarioRetorno")
                .<DicionarioRetorno, DicionarioRetorno> chunk(10)
                .reader(reader())
                .processor(dicionarioRetornoProcessor())
                .writer(writer())
                .build();
    }
}
