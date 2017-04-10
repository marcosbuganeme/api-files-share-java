package br.com.processamento.lote.dominio.dicionarioretorno;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author marcos
 *
 */
public class DicionarioRowMapper implements RowMapper<DicionarioRetorno> {

	@Override
	public DicionarioRetorno mapRow(ResultSet rs, int row) throws SQLException {
		return new DicionarioRetorno(rs.getString(1), rs.getString(2));
	}
}
