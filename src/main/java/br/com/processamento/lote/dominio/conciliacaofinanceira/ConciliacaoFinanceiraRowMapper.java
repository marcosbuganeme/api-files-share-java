package br.com.processamento.lote.dominio.conciliacaofinanceira;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author marcos.buganeme
 */
public class ConciliacaoFinanceiraRowMapper implements RowMapper<ConciliacaoFinanceira> {

	@Override
	public ConciliacaoFinanceira mapRow(ResultSet rs, int rowNum) throws SQLException {
		return null;
	}
}
