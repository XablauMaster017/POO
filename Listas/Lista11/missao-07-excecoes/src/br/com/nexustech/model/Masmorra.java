package br.com.nexustech.model;

import br.com.nexustech.exception.nivelInsuficienteException;

public class Masmorra {

    public void entrar(int nivelJogador){
        if(nivelJogador < 50) {
            throw new nivelInsuficienteException();

        } else {
            System.out.println("Adentrando a Masmorra!");
        }
    }
}
