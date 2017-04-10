package br.com.processamento.lote.dominio.parametrofaturamento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Responsável por transformar o objeto de domínio
 * 
 * @author marcos.buganeme
 *
 */
public class ParametroFaturamentoItemProcessor implements ItemProcessor<ParametroFaturamento, ParametroFaturamento> {

	private static final Logger log = LoggerFactory.getLogger(ParametroFaturamentoItemProcessor.class);

	@Override
	public ParametroFaturamento process(final ParametroFaturamento parametroFaturamento) throws Exception {
		log.info("Convertendo (" + parametroFaturamento + ")");

		return new ParametroFaturamento(parametroFaturamento.getCondicaoFinanciamento(),
				parametroFaturamento.getDataFaturamento(), parametroFaturamento.getDataVencimento(),
				parametroFaturamento.getPlano(), parametroFaturamento.getCoeficiente(), parametroFaturamento.getTaxa(),
				parametroFaturamento.getDiasPagamento(), parametroFaturamento.getTipoPessoa(),
				parametroFaturamento.getTipoCliente(), parametroFaturamento.getTipoOperacao(),
				parametroFaturamento.getDiasPrimeiroVencimento(), parametroFaturamento.getTaxaAntecipacao(),
				parametroFaturamento.getCodigoEmpresa(), parametroFaturamento.getTaxaCancelamento(),
				parametroFaturamento.getTaxaProrrogacao(), parametroFaturamento.getTipoCondicao(),
				parametroFaturamento.getQuantidadeDiasProximoVencimento());
	}
}
