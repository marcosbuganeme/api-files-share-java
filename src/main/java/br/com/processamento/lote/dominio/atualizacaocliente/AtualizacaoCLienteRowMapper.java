package br.com.processamento.lote.dominio.atualizacaocliente;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author marcos.buganeme
 */
public class AtualizacaoCLienteRowMapper implements RowMapper<AtualizacaoCliente> {

  @Override
  public AtualizacaoCliente mapRow(ResultSet rs, int rowNum) throws SQLException {
    return criarAtualizacaoCliente(rs);
  }

  private AtualizacaoCliente criarAtualizacaoCliente(ResultSet rs) {
    return new AtualizacaoCliente();
  }
}
