package br.com.nexuscloud.exception;

public class CapacidadeExcedidaException extends Exception{
    public CapacidadeExcedidaException(String ip) {
        super("Falha Crítica: Memória RAM insuficiente no servidor [" + ip + "].");
    }
}