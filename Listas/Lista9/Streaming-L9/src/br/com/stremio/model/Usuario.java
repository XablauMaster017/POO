package br.com.stremio.model;

import java.util.Objects;

public class Usuario {

    private String nome;
    private String email;
    private boolean ativo;

    public static final String NOME_PLATAFORMA = "JavaFlix";
    private static int totalUsuarios;
    
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
        totalUsuarios++;
    }

    public static int getTotalUsuarios() {
        return totalUsuarios;
    }
    public static void setTotalUsuarios(int totalUsuarios) {
        Usuario.totalUsuarios = totalUsuarios;
    }
    @Override 
    public String toString() {
        return "Usuário: [" + nome + "] | " +
        "E-mail: [" + email + "] | " +
        "Ativo: [" + ativo + "]";
    }

    @Override 
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Usuario that = (Usuario) obj;
    return Objects.equals(email, that.email);
    }
}
