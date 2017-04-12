package br.com.processamento.lote.dominio.atualizacaocliente;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/**
 * @author marcos.buganeme
 */
@Component
public class AtualizacaoClienteItemProcessor implements ItemProcessor<AtualizacaoClienteArquivoTexto, AtualizacaoCliente> {

  @Override
  public AtualizacaoCliente process(AtualizacaoClienteArquivoTexto arquivoTexto) throws Exception {
    return criarAtualizacaoCliente(arquivoTexto);
  }

  private AtualizacaoCliente criarAtualizacaoCliente(AtualizacaoClienteArquivoTexto arquivoTexto) {
    return new AtualizacaoCliente(arquivoTexto.getTipoRegistroDetalheDadosPagamento(), arquivoTexto.getCodigoEmpresa(), arquivoTexto.getCodigoLoja(), 
      arquivoTexto.getDataPagamentoDadosPagamento(), arquivoTexto.getBorderoDadosPagamento(), arquivoTexto.getSinal(), arquivoTexto.getValorLancamentoDadosPagamento(), 
      arquivoTexto.getNomeCredito(), arquivoTexto.getAgencia(), arquivoTexto.getConta(), arquivoTexto.getHistorico(), arquivoTexto.getEvento(), 
      arquivoTexto.getTipoRegistroDetalheDadosCompra(), arquivoTexto.getCnpj(), arquivoTexto.getNumeroCartao(), arquivoTexto.getNumeroTransacao(), 
      arquivoTexto.getQuantidadeTotalParcelas(), arquivoTexto.getNumeroParcela(), arquivoTexto.getValorCompra(), arquivoTexto.getValorParcela(), 
      arquivoTexto.getPagamentoAntecipado(), arquivoTexto.getDataVencimentoParcela(), arquivoTexto.getBorderoDadosCompra(), arquivoTexto.getValorLancamentoDadosCompra(), 
      arquivoTexto.getValorDesconto(), arquivoTexto.getDataPagamentoDadosCompra(), arquivoTexto.getConfirmacaoPagamento(), arquivoTexto.getValorImpostos());
  }
}
