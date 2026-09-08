package br.com.techcorp.model;

import java.util.Objects;

public class Funcionairo {
    
    private String matricula;
    private String nome;
    private String cargo;

    public Funcionairo(String matricula, String nome, String cargo) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
    }
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override // --> Substitui um metodo herdado, serve pra pegar erros
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionairo that = (Funcionairo) o;
        return Objects.equals(matricula, that.matricula);
    }

    @Override 
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override 
    public String toString() {
        return "Funcionario {" + 
        "matricula ='" + matricula + '\'' +
        ", nome ='" + nome + '\'' +
        ", cargo ='" + cargo + '\'' +
        "}";
    }


}
