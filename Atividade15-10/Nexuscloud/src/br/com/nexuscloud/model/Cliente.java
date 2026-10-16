package br.com.nexuscloud.model;

import java.util.Objects;

public class Cliente {

    private String cpf;
    private String nome;

    
    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;             
        if (o == null || getClass() != o.getClass()) return false; 
        Cliente outro = (Cliente) o;            
        return Objects.equals(this.cpf, outro.cpf); 
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }


}
