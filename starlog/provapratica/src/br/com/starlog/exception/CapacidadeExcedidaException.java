package br.com.starlog.exception;

public class CapacidadeExcedidaException extends Exception {

    private static String codigoModulo;
    private static String capacidadeMaxima;

    public CapacidadeExcedidaException(String mensagem) {
        super("Modulo" + codigoModulo + "atingiu a capacidade maxima de" + capacidadeMaxima + "cargas.");
    }
}