package br.com.technexus.main;  
    
import br.com.technexus.model.Loja;
import br.com.technexus.model.Produto;

public class App {

    public static void main(String[] args) throws Exception {

    Loja loja = new Loja();
        loja.cadastrar(new Produto("FIFA", "Games", 200.50));
        loja.cadastrar(new Produto("COD", "Games", 250.25));
        loja.cadastrar(new Produto("BF4", "Games", 330.90));
        loja.cadastrar(new Produto("Programador Pragmatico", "Livros", 185.40));
        loja.cadastrar(new Produto("Noites Brancas", "Livros", 120.35));
        loja.cadastrar(new Produto("Teclado", "Hardware", 440.99));

        System.out.println(loja.buscarPorCategoria("Games"));
        System.out.println(loja.calcularPatrimonioTotal());
        System.out.println(loja.calcularTotalPorCategoria("Livros"));
    }


}
