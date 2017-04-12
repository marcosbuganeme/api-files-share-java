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

import br.com.processamento.lote.dominio.conciliacaofinanceira.ConciliacaoFinanceira;
import br.com.processamento.lote.dominio.conciliacaofinanceira.ConciliacaoFinanceiraItemProcessor;
import br.com.processamento.lote.dominio.conciliacaofinanceira.ConciliacaoFinanceiraJobListener;
import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.layout.ConciliacaoFinanceiraLayout;

/**
 * @author marcos.buganeme
 */
@Configuration
@EnableBatchProcessing(modular = true)
public class ConciliacaoFinanceiraReader {

	private static final String[] CAMPOS = { "codigo", "descricao", "filler" };
	private static final Resource RESOURCE = new ClassPathResource("PG9920160829.txt");
	private static final Range[] DELIMITADORES = { new Range(1, 3), new Range(4, 258), new Range(259, 300) };
	private static final String INSERT_SQL = "";

	@Autowired private DataSource dataSource;
	@Autowired private JobBuilderFactory jobBuilderFactory;
	@Autowired private StepBuilderFactory stepBuilderFactory;

	@Bean
	public FlatFileItemReader<ConciliacaoFinanceiraLayout> conciliacaoFinanceiraFlatFileItemReader() {
		FlatFileItemReader<ConciliacaoFinanceiraLayout> reader = new FlatFileItemReader<ConciliacaoFinanceiraLayout>();

		reader.setResource(RESOURCE);
		reader.setLineMapper(new DefaultLineMapper<ConciliacaoFinanceiraLayout>() {
			{
				setLineTokenizer(new FixedLengthTokenizer() {
					{
						setNames(CAMPOS);
						setColumns(DELIMITADORES);
					}
				});
				setFieldSetMapper(new BeanWrapperFieldSetMapper<ConciliacaoFinanceiraLayout>() {
					{
						setTargetType(ConciliacaoFinanceiraLayout.class);
					}
				});
			}
		});
		return reader;
	}

	@Bean
	public ConciliacaoFinanceiraItemProcessor conciliacaoFinanceiraItemProcessor() {
		return new ConciliacaoFinanceiraItemProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<ConciliacaoFinanceira> conciliacaoFinanceiraJdbcBatchItemWriter() {
		JdbcBatchItemWriter<ConciliacaoFinanceira> writer = new JdbcBatchItemWriter<ConciliacaoFinanceira>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<ConciliacaoFinanceira>());
		writer.setSql(INSERT_SQL);
		writer.setDataSource(dataSource);
		return writer;
	}

	@Bean
	public Step conciliacaoFinanceiraStep() {
		return stepBuilderFactory.get("conciliacaoFinanceiraStep")
				.<ConciliacaoFinanceiraLayout, ConciliacaoFinanceira>chunk(10)
				.reader(conciliacaoFinanceiraFlatFileItemReader())
				.processor(conciliacaoFinanceiraItemProcessor())
				.writer(conciliacaoFinanceiraJdbcBatchItemWriter())
				.build();
	}

	@Bean
	public Job conciliacaoFinanceiraJob(ConciliacaoFinanceiraJobListener listener) {
		return jobBuilderFactory.get("conciliacaoFinanceiraJob")
				.incrementer(new RunIdIncrementer())
				.listener(listener)
				.flow(conciliacaoFinanceiraStep()).end().build();
	}
}
