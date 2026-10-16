package br.com.techcorp.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ControleDeAcesso {

    private List<Funcionairo> historicoCatraca;
    private Set<Funcionairo> autorizadosSalaSegura;

    public ControleDeAcesso() {
        this.historicoCatraca = new ArrayList<>();
        this.autorizadosSalaSegura = new HashSet<>();
    }

    public void registrarPassagem(Funcionairo f) {
        historicoCatraca.add(f);
    }
    
    public void concederAcessoSala(Funcionairo f) {
        if (autorizadosSalaSegura.add(f)) {
        System.out.println("Acesso Liberado ao Servidor!");
        } else {
            System.out.println("Aviso: Matrícula já registrada na sala. Acesso não permitido.");
        }
    }
}

