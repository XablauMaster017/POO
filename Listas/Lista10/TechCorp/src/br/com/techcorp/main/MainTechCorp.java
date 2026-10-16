package br.com.techcorp.main;

import br.com.techcorp.model.ControleDeAcesso;
import br.com.techcorp.model.Funcionairo;

public class MainTechCorp {
    public static void main(String[] args) throws Exception {
       
        ControleDeAcesso controle = new ControleDeAcesso();

        Funcionairo f1 = new Funcionairo("T-001","Alice", "Analista");
        Funcionairo f2 = new Funcionairo("T-001","Alice ecilA", "Analista");

        controle.registrarPassagem(f1);
        controle.registrarPassagem(f2);

        controle.concederAcessoSala(f1);
        controle.concederAcessoSala(f2);
        
    }
}
