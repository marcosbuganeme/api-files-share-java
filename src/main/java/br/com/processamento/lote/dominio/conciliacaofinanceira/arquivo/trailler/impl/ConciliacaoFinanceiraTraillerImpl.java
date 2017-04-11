package br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.trailler.impl;

import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.trailler.ConciliacaoFinanceiraTrailler;

/**
 * @author marcos.buganeme
 */
public class ConciliacaoFinanceiraTraillerImpl implements ConciliacaoFinanceiraTrailler {

  private Integer tipoDoRegistro;
  private Integer totalDeRegistros;
  private Integer totalTipoDetalhe1;
  private Integer totalTipoDetalhe2;
  private String filler;

  public ConciliacaoFinanceiraTraillerImpl(Integer tipoDoRegistro, Integer totalDeRegistros,
      Integer totalTipoDetalhe1, Integer totalTipoDetalhe2, String filler) {
    super();
    this.tipoDoRegistro = tipoDoRegistro;
    this.totalDeRegistros = totalDeRegistros;
    this.totalTipoDetalhe1 = totalTipoDetalhe1;
    this.totalTipoDetalhe2 = totalTipoDetalhe2;
    this.filler = filler;
  }

  @Override
  public Integer getTipoDoRegistro() {
    return tipoDoRegistro;
  }

  @Override
  public Integer getTotalDeRegistros() {
    return totalDeRegistros;
  }

  @Override
  public Integer getTotalDetalhe1() {
    return totalTipoDetalhe1;
  }

  @Override
  public Integer getTotalDetalhe2() {
    return totalTipoDetalhe2;
  }

  @Override
  public String getFiller() {
    return filler;
  }
}
