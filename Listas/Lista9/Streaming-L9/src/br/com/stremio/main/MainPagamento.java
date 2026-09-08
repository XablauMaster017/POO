package br.com.stremio.main;

import br.com.stremio.model.*;

public class MainPagamento {
public static void main(String[] args) throws Exception {
    
    ProcessadorPagamento processador = new ProcessadorPagamento();

    Pagamento pagamentoPix = new PagamentoPix();
    Pagamento pagamentoCartao = new PagamentoCartao();

    processador.finalizarCompra(120.0, pagamentoPix);
    processador.finalizarCompra(315.1, pagamentoCartao);
    processador.finalizarCompra(70.0, new PagamentoPix());
}
}
