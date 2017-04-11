package br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.layout.impl;

import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe.ConciliacaoFinanceiraDadosCompra;
import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe.ConciliacaoFinanceiraDadosPagamento;
import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.header.ConciliacaoFinanceiraHeader;
import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.layout.ConciliacaoFinanceiraLayout;
import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.trailler.ConciliacaoFinanceiraTrailler;

/**
 * Classe que representa o arquivo completo PG - Conciliação financeira
 * @author marcos.buganeme
 */
public class ConciliacaoFinanceiraLayoutImpl implements ConciliacaoFinanceiraLayout {

  private ConciliacaoFinanceiraHeader header;
  private ConciliacaoFinanceiraDadosPagamento detalhe1;
  private ConciliacaoFinanceiraDadosCompra detalhe2;
  private ConciliacaoFinanceiraTrailler trailler;

  public ConciliacaoFinanceiraLayoutImpl(ConciliacaoFinanceiraHeader header,
      ConciliacaoFinanceiraDadosPagamento detalhe1, ConciliacaoFinanceiraDadosCompra detalhe2,
      ConciliacaoFinanceiraTrailler trailler) {
    super();
    this.header = header;
    this.detalhe1 = detalhe1;
    this.detalhe2 = detalhe2;
    this.trailler = trailler;
  }

  @Override
  public ConciliacaoFinanceiraHeader getHeader() {
    return header;
  }

  @Override
  public ConciliacaoFinanceiraDadosPagamento getDetalhe1() {
    return detalhe1;
  }

  @Override
  public ConciliacaoFinanceiraDadosCompra getDetalhe2() {
    return detalhe2;
  }

  @Override
  public ConciliacaoFinanceiraTrailler getTrailler() {
    return trailler;
  }
}
