package src.br.com.oficina.model;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
  
  private Map<String, Integer> itens = new HashMap<>();

  public int consultarQuantidade(String sku) {
    return itens.getOrDefault(sku, 0);
  }

public void darEntrada(String sku, int quantidade) {
  int saldoAtual = consultarQuantidade(sku);
  itens.put(sku, saldoAtual + quantidade);
}

public boolean darBaixa(String sku, int quantidade) {
int saldoAtual = consultarQuantidade(sku);
if (saldoAtual >= quantidade) {
  itens.put(sku, saldoAtual - quantidade);
  return true;
}
return false;
}
}
