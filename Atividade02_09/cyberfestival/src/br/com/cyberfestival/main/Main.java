package br.com.cyberfestival.main;

import br.com.cyberfestival.model.Bilheteria;
import br.com.cyberfestival.model.Ingresso;
import br.com.cyberfestival.model.IngressoInvalidoException;

public class Main {

    public static void main(String[] args) {

        Bilheteria bilheteria = new Bilheteria();

        // cria os 3 ingressos
        Ingresso ingresso1 = new Ingresso("A-01", "VIP", 500.00);
        Ingresso ingresso2 = new Ingresso("A-02", "PISTA", 200.00);
        Ingresso ingresso3 = new Ingresso("A-01", "PISTA", 200.00); // Clone cambista: código A-01 clonado

        // dende os Ingressos 1 e 2
        bilheteria.venderIngresso(ingresso1);
        bilheteria.venderIngresso(ingresso2);

        // tenta vender o Ingresso duplicado
        try {
            bilheteria.venderIngresso(ingresso3);
        } catch (IngressoInvalidoException e) {
            // imprime o alerta 
            System.out.println("ALERTA: " + e.getMessage());
        }

        //  imprime a receita VIP 
    System.out.printf("Receita VIP: %.2f%n", bilheteria.calcularReceitaVIP());    }
}

