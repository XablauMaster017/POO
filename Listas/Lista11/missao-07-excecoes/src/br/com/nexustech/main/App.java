package br.com.nexustech.main;

import br.com.nexustech.model.Jogador;

public class App {


    public static void main(String[] args) {
        String[] inventario = new String[3];
        int kills = 15;
        int deaths = 0;


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
