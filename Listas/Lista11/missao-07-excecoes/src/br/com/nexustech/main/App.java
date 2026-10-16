package br.com.nexustech.main;

import br.com.nexustech.exception.BanidoException;
import br.com.nexustech.exception.nivelInsuficienteException;
import br.com.nexustech.model.Jogador;
import br.com.nexustech.model.Masmorra;
import br.com.nexustech.model.Matchmaking;
import br.com.nexustech.model.ModoCasual;
import br.com.nexustech.model.ModoCompetitivo;
import br.com.nexustech.model.ModoJogo;

public class App {

    public static void main(String[] args) {
        String[] inventario = new String[3];
        int kills = 15;
        int deaths = 0;
        Matchmaking matchmaking = new Matchmaking();
        ModoJogo casual = new ModoCasual();
        ModoJogo competitivo = new ModoCompetitivo();
        

        try {
            matchmaking.encontrarSala(casual, true);
        } catch (BanidoException e) {
            System.out.println(e.getMessage());
        }


        try {
            conectarServidor();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fechando as portas do bordel");
        }

    Jogador jogador = new Jogador();

    if(jogador != null) {
        System.out.println("Nome:" + jogador.getNome());
    } else {
        System.out.println("Jogador Desconectado!");
    }
        

        try{
            inventario[5] = "Espada";
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Inválido");

        }

        Masmorra masmorra = new Masmorra();
        try {
            masmorra.entrar(20);
        } catch(nivelInsuficienteException e) {
           System.out.println(e.getMessage()); 
        }




        try{
    System.out.println(kills/deaths);
}   catch (ArithmeticException e ) {
    System.out.println("Taxa K/D: Jogador Invicto!");
        }



    }
    public static void conectarServidor() throws Exception {
        throw new Exception("Servidor Caiu!");
    }
}
