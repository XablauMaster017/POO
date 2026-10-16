package br.com.stremio.main;

import br.com.stremio.model.Usuario;

public class MainMemoria {
    public static void main(String[] args) throws Exception {
    
        Usuario u1 = new Usuario("Augusto", "meuemail@gmail.com", true);
        Usuario u2 = new Usuario("Bamerindo", "meuemail@gmail.com", true);

        if (u1.equals(u2)) {
            System.out.println("E-mail já cadastrado");
        } else {
            System.out.println("Boa");
        }

        System.out.println("Nome da Plataforma: " + Usuario.NOME_PLATAFORMA);
        System.out.println("Qtd Usuarios: [" + Usuario.getTotalUsuarios() + "]");

    }
}
