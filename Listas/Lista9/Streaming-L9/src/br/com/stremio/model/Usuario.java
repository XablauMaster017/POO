package br.com.stremio.model;

public class Usuario {

    private String nome;
    private String email;
    private boolean ativo;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public Usuario(String nome, String email, boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
    }
    
    @Override 
    public String toString() {
        return "Usuário: [" + nome + "] | " +
        "E-mail: [" + email + "] | " +
        "Ativo: [" + ativo + "]";
    }

}
