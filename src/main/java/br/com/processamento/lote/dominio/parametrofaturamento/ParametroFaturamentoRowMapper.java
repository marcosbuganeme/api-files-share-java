package br.com.processamento.lote.dominio.parametrofaturamento;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author marcos
 *
 */
public class ParametroFaturamentoRowMapper implements RowMapper<ParametroFaturamento> {

	@Override
	public ParametroFaturamento mapRow(ResultSet rs, int row) throws SQLException {
		return new ParametroFaturamento(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17));
	}
}
