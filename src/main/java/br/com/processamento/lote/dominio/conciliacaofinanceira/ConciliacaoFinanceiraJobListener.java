package br.com.processamento.lote.dominio.conciliacaofinanceira;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author marcos.buganeme
 *
 */
public class ConciliacaoFinanceiraJobListener extends JobExecutionListenerSupport {

	private static final Logger log = LoggerFactory.getLogger(ConciliacaoFinanceiraJobListener.class);
	

	private final JdbcTemplate jdbcTemplate;
	private final ConciliacaoFinanceiraRowMapper rowMapper;

	@Autowired
	public ConciliacaoFinanceiraJobListener(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		this.rowMapper = new ConciliacaoFinanceiraRowMapper();
	}

}
