package br.com.nexustech.exception;

public class nivelInsuficienteException extends RuntimeException {

  public nivelInsuficienteException() {
    super("Seu nível é muito baixo para essa masmorra!");

  }
}

