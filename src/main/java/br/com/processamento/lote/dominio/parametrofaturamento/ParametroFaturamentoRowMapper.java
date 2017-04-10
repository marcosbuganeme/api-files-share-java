package br.com.processamento.lote.dominio.parametrofaturamento;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author marcos.buganeme
 */
public class ParametroFaturamentoRowMapper implements RowMapper<ParametroFaturamento> {

  @Override
  public ParametroFaturamento mapRow(ResultSet resultSet, int row) throws SQLException {
    return new ParametroFaturamento(camposObrigatoriosMapeados(resultSet));
  }

  private List<String> camposObrigatoriosMapeados(ResultSet rs) throws SQLException {
    List<String> campos = new ArrayList<>();

    campos.add(rs.getString("condicaoFinanciamento"));
    campos.add(rs.getString("dataFaturamento"));
    campos.add(rs.getString("dataVencimento"));
    campos.add(rs.getString("plano"));
    campos.add(rs.getString("coeficiente"));
    campos.add(rs.getString("taxa"));
    campos.add(rs.getString("diasPagamento"));
    campos.add(rs.getString("filial"));
    campos.add(rs.getString("tipoPessoa"));
    campos.add(rs.getString("tipoCliente"));
    campos.add(rs.getString("tipoOperacao"));
    campos.add(rs.getString("diasPrimeiroVencimento"));
    campos.add(rs.getString("taxaAntecipacao"));
    campos.add(rs.getString("codigoEmpresa"));
    campos.add(rs.getString("taxaCancelamento"));
    campos.add(rs.getString("taxaProrrogacao"));
    campos.add(rs.getString("tipoCondicao"));
    campos.add(rs.getString("quantidadeDiasProximoVencimento"));

    return campos;
  }
}
