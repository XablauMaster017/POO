package br.com.nexuscloud.exception;

public class ServidorOfflineException extends RuntimeException{
    public ServidorOfflineException() {
        super("Erro: Não é possível alocar containers em um servidor desligado.");
    }
}
