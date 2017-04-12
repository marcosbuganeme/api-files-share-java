package br.com.processamento.lote.dominio.conciliacaofinanceira.builder;

import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.detalhe.ConciliacaoFinanceiraDadosPagamento;
import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.layout.ConciliacaoFinanceiraLayout;

/**
 * @author marcos.buganeme
 */
public class DadosPagamentoBuilder {

	private ConciliacaoFinanceiraLayout layout;

	public DadosPagamentoBuilder(ConciliacaoFinanceiraLayout layout) {
		this.layout = layout;
	}
	
	public ConciliacaoFinanceiraDadosPagamento build() {
		return layout.getDetalhe1();
	}
}
