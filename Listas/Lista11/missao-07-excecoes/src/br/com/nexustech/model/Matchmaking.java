package br.com.nexustech.model;

import br.com.nexustech.exception.BanidoException;

public class Matchmaking {
    public void encontrarSala(ModoJogo modo, boolean jogadorBanido) throws BanidoException {
        if(jogadorBanido == true) {
            throw new BanidoException();
        } else {
            modo.buscarPartida();
        }
    }
}
