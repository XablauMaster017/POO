package br.com.cyberfestival.model;

// Herda de RuntimeException => Unchecked
public class IngressoInvalidoException extends RuntimeException {

    public IngressoInvalidoException() {
        // Mensagem repassada à superclasse
        super("Erro de Segurança: Ingresso já validado ou código duplicado!");
    }
}
