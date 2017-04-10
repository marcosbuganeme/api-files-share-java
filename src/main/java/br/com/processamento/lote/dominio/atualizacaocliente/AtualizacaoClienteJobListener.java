package br.com.processamento.lote.dominio.atualizacaocliente;

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
 * @author marcos.buganeme
 */
@Component
public class AtualizacaoClienteJobListener extends JobExecutionListenerSupport {

  private static final Logger log = LoggerFactory.getLogger(AtualizacaoClienteJobListener.class);

  private final JdbcTemplate jdbcTemplate;
  private AtualizacaoCLienteRowMapper rowMapper;

  @Autowired
  public AtualizacaoClienteJobListener(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
    this.rowMapper = new AtualizacaoCLienteRowMapper();
  }

  @Override
  public void afterJob(JobExecution jobExecution) {
    if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
      log.info("******* JOB ATUALIZAÇÃO CLIENTE CONCLUÍDO *******");

      List<AtualizacaoCliente> atualizacoesClientes = jdbcTemplate.query("SELECT  FROM atualizacao_cliente", rowMapper);

      for (AtualizacaoCliente atualizacaoCliente : atualizacoesClientes) {
        log.info("Registro <" + atualizacaoCliente + "> foi gravado na base de dados");
      }

    }
  }
}
