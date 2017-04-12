package br.com.processamento.lote.dominio.conciliacaofinanceira;

import org.springframework.batch.item.ItemProcessor;

import br.com.processamento.lote.dominio.conciliacaofinanceira.arquivo.layout.ConciliacaoFinanceiraLayout;

/**
 * @author marcos
 *
 */
public class ConciliacaoFinanceiraItemProcessor implements ItemProcessor<ConciliacaoFinanceiraLayout, ConciliacaoFinanceira> {

	@Override
	public ConciliacaoFinanceira process(ConciliacaoFinanceiraLayout layout) throws Exception {
		return transformaLayoutEmConciliacaoFinanceira(layout);
	}

	private ConciliacaoFinanceira transformaLayoutEmConciliacaoFinanceira(ConciliacaoFinanceiraLayout layout) {
		return new ConciliacaoFinanceira(layout.getDetalhe1().getTipoRegistro(),
				layout.getDetalhe1().getCodigoEmpresa(), layout.getDetalhe1().getCodigoLoja(),
				layout.getDetalhe1().getDataPagamento(), layout.getDetalhe1().getBordero(),
				layout.getDetalhe1().getSinal(), layout.getDetalhe1().getValorLancamento(),
				layout.getDetalhe1().getNomeCredito(), layout.getDetalhe1().getNumeroBanco(),
				layout.getDetalhe1().getNumeroAgencia(), layout.getDetalhe1().getNumeroConta(),
				layout.getDetalhe1().getHistorico(), layout.getDetalhe1().getEvento(),
				layout.getDetalhe2().getTipoRegistro(), layout.getDetalhe2().getCnpj(),
				layout.getDetalhe2().getNumeroCartao(), layout.getDetalhe2().getNumeroTransacao(), 
				layout.getDetalhe2().getQuantidadeTotalParcelas(), layout.getDetalhe2().getNumeroParcela(),
				layout.getDetalhe2().getValorCompra(), layout.getDetalhe2().getValorParcela(), 
				layout.getDetalhe2().getPagamentoAntecipado(), layout.getDetalhe2().getDataVencimentoParcela(), 
				layout.getDetalhe2().getBordero(), layout.getDetalhe2().getValorDoLancamento(), 
				layout.getDetalhe2().getValorDoDesconto(), layout.getDetalhe2().getDataDoPagamento(), 
				layout.getDetalhe2().getConfirmacaoPagamento(), layout.getDetalhe2().getValorDosImpostos());
	}
}
