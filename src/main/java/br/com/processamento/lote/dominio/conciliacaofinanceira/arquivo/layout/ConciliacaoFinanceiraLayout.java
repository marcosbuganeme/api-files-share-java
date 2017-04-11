package br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.layout;

import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe.ConciliacaoFinanceiraDadosCompra;
import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe.ConciliacaoFinanceiraDadosPagamento;
import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.header.ConciliacaoFinanceiraHeader;
import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.trailler.ConciliacaoFinanceiraTrailler;
import br.com.processamento.lote.dominio.shared.Layout;

/**
 * @author marcos.buganeme
 */
public interface ConciliacaoFinanceiraLayout extends Layout {

  /**
   * @return dados do cabeçalho
   */
  ConciliacaoFinanceiraHeader getHeader();

  /**
   * @return dados do detalhe 1 - dados do pagamento
   */
  ConciliacaoFinanceiraDadosPagamento getDetalhe1();

  /**
   * @return dados do detalhe2 - dados da compra
   */
  ConciliacaoFinanceiraDadosCompra getDetalhe2();

  /**
   * @return dados do trailler - fim do arquivo
   */
  ConciliacaoFinanceiraTrailler getTrailler();
}
