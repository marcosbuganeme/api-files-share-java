package br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.header;

import br.com.processamento.lote.dominio.shared.Header;

/**
 * @author marcos.buganeme
 */
public interface ConciliacaoFinanceiraHeader extends Header {

  /**
   * @return nome do parceiro vinculado ao arquivo de conciliacao financeira
   */
  String getNomeDoParceiro();

  /**
   * @return 220 posições com espaços em branco
   */
  String getFiller();
}
