package br.com.processamento.lote.dominio.dicionarioretorno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Job de notificação de conclusão de tarefas
 * 
 * @author marcos.buganeme
 *
 */
@Component
public class DicionarioRetornoJobListener extends JobExecutionListenerSupport {

	private static final Logger log = LoggerFactory.getLogger(DicionarioRetornoJobListener.class);

	private final JdbcTemplate jdbcTemplate;
	private final DicionarioRetornoRowMapper rowMapper;

	@Autowired
	public DicionarioRetornoJobListener(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		this.rowMapper = new DicionarioRetornoRowMapper();
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("******* JOB DICIONÁRIO RETORNO CONCLUÍDO *******");

			List<DicionarioRetorno> dicionarios = jdbcTemplate.query("SELECT codigo, descricao FROM dicionario_retorno", rowMapper);

			for (DicionarioRetorno dicionarioRetorno : dicionarios) {
				log.info("Registro <" + dicionarioRetorno + "> foi gravado na base de dados" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			}
		}
	}
}
