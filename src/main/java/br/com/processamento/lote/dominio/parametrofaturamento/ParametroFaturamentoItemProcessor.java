package br.com.processamento.lote.dominio.parametrofaturamento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Responsável por transformar o objeto de domínio
 * @author marcos.buganeme
 */
public class ParametroFaturamentoItemProcessor implements ItemProcessor<ParametroFaturamentoArquivoTexto, ParametroFaturamento> {

  private static final Logger log = LoggerFactory.getLogger(ParametroFaturamentoItemProcessor.class);

  @Override
  public ParametroFaturamento process(final ParametroFaturamentoArquivoTexto arquivoTexto) throws Exception {
    log.info("Convertendo (" + arquivoTexto + ")");
    return criaParametroFaturamento(arquivoTexto);
  }

  private ParametroFaturamento criaParametroFaturamento(ParametroFaturamentoArquivoTexto arquivoTexto) {
    return new ParametroFaturamento(arquivoTexto.getCondicaoFinanciamento(),
                                    arquivoTexto.getDataFaturamento(), arquivoTexto.getDataVencimento(),
                                    arquivoTexto.getPlano(), arquivoTexto.getCoeficiente(), 
                                    arquivoTexto.getTaxa(), arquivoTexto.getDiasPagamento(),
                                    arquivoTexto.getFilial(), arquivoTexto.getTipoPessoa(),
                                    arquivoTexto.getTipoCliente(), arquivoTexto.getTipoOperacao(),
                                    arquivoTexto.getDiasPrimeiroVencimento(), arquivoTexto.getTaxaAntecipacao(),
                                    arquivoTexto.getCodigoEmpresa(), arquivoTexto.getTaxaCancelamento(),
                                    arquivoTexto.getTaxaProrrogacao(), arquivoTexto.getTipoCondicao(),
                                    arquivoTexto.getQuantidadeDiasProximoVencimento());
  }
}
