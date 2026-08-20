package src.br.com.oficina.model;

public class Peca {
  private String nome;
  private String codigoSkus;
  private double preco;
  
  public Peca(String nome, String codigoSkus, double preco) {
    this.nome = nome;
    this.codigoSkus = codigoSkus;
    this.preco = preco;

  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCodigoSkus() {
    return codigoSkus;
  }

  public void setCodigoSkus(String codigoSkus) {
    this.codigoSkus = codigoSkus;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

}
