package br.com.processamento.lote.dominio.dicionarioretorno;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author marcos.buganeme
 */
public class DicionarioRetornoRowMapper implements RowMapper<DicionarioRetorno> {

  @Override
  public DicionarioRetorno mapRow(ResultSet rs, int row) throws SQLException {
    return criarDicionarioRetorno(rs);
  }

  private DicionarioRetorno criarDicionarioRetorno(ResultSet rs) throws SQLException {
    return new DicionarioRetorno(rs.getString("codigo"), rs.getString("descricao"));
  }
}
