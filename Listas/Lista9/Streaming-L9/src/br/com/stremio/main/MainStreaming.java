package br.com.stremio.main;

import br.com.stremio.model.Usuario;
import br.com.stremio.model.Video;


public class MainStreaming {
    public static void main(String[] args) throws Exception {
    
        Usuario n1 = new Usuario("Frederico", "Xerecanation@main.com", true);
        Video primeiro = new Video(120,"A volta dos que não foram");
        Video segundo = new Video(-45, "Rambo VIV");

        System.out.println(n1.toString());
        System.out.println(primeiro.toString());
        System.out.println(segundo.toString());
    }
}
