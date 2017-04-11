package br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.trailler;

import br.com.processamento.lote.dominio.shared.Trailler;

/**
 * @author marcos.buganeme
 */
public interface ConciliacaoFinanceiraTrailler extends Trailler {

  /**
   * @return quantidade de registros do tipo de detalhe 1 - Dados do Pagamento
   */
  Integer getTotalDetalhe1();

  /**
   * @return quantidade de registros do tipo de detalhe 2 - Dados da Compra
   */
  Integer getTotalDetalhe2();

  /**
   * @return 269 posições com espaços em branco
   */
  String getFiller();
}
