package br.com.processamento.lote.dominio.parametrofaturamento;

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
public class ParametroFaturamentoJobListener extends JobExecutionListenerSupport {

	private static final Logger log = LoggerFactory.getLogger(ParametroFaturamentoJobListener.class);

	private final JdbcTemplate jdbcTemplate;
	private final ParametroFaturamentoRowMapper rowMapper;

	@Autowired
	public ParametroFaturamentoJobListener(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		this.rowMapper = new ParametroFaturamentoRowMapper();
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("******* JOB PARAMETRO FATURAMENTO CONCLUÍDO *******");

			List<ParametroFaturamento> parametros = jdbcTemplate.query("SELECT condicaoFinanciamento, dataFaturamento, dataVencimento, plano, coeficiente, taxa, diasPagamento, filial, tipoPessoa, tipoCliente, tipoOperacao, diasPrimeiroVencimento, taxaAntecipacao, codigoEmpresa, taxaCancelamento, taxaProrrogacao, tipoCondicao, quantidadeDiasProximoVencimento from parametro_faturamento", rowMapper);
			
//			for (ParametroFaturamento parametroFaturamento : parametros) {
//				log.info("Registro <" + parametroFaturamento + "> foi gravado na base de dados" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//			}
		}
	}
}
