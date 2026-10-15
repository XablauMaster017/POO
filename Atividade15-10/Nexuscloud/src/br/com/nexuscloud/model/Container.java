package br.com.nexuscloud.model;

import java.util.Objects;

public class Container {

    private String id;
    private String nomeApp;
    private double ramNecessaria;
    

    public Container(String id, String nomeApp, double ramNecessaria) {
        this.id = id;
        this.nomeApp = nomeApp;
        this.ramNecessaria = ramNecessaria;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeApp() {
        return nomeApp;
    }
    public void setNomeApp(String nomeApp) {
        this.nomeApp = nomeApp;
    }
    public double getRamNecessaria() {
        return ramNecessaria;
    }
    public void setRamNecessaria(double ramNecessaria) {
        this.ramNecessaria = ramNecessaria;
    }

            @Override
    public boolean equals(Object o) {
        if (this == o) return true;             
        if (o == null || getClass() != o.getClass()) return false; 
        Container outro = (Container) o;            
        return Objects.equals(this.id, outro.id); 
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
