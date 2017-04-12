package br.com.processamento.lote.dominio.conciliacaofinanceira.builder;

import br.com.processamento.lote.dominio.conciliacaofinanceira.ConciliacaoFinanceira;
import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe.ConciliacaoFinanceiraDadosCompra;
import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe.ConciliacaoFinanceiraDadosPagamento;
import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.layout.ConciliacaoFinanceiraLayout;

/**
 * @author marcos.buganeme
 */
public class ConciliacaoFinanceiraBuilder {

	private ConciliacaoFinanceiraLayout layout;

	public ConciliacaoFinanceiraBuilder(final ConciliacaoFinanceiraLayout layout) {
		this.layout = layout;
	}

	private ConciliacaoFinanceiraDadosPagamento construirDetalhe1() {
		return null;
	}

	private ConciliacaoFinanceiraDadosCompra construirDetalhe2() {
		return null;
	}

	public ConciliacaoFinanceira build() {
		return null;
	}
}
