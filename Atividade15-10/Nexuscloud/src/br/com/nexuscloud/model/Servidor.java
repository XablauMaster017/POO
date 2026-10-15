package br.com.nexuscloud.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Servidor {

    private String ip;
    private double precoPorHora;
    private double ramTotal;
    private boolean statusLigado;
    private List<Container> containers = new ArrayList<>();
    
    public Servidor(String ip, double precoPorHora, double ramTotal) {
        this.ip = ip;
        this.precoPorHora = precoPorHora;
        this.ramTotal = ramTotal;
    }

    public String getIp() {
        return ip;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public double getRamTotal() {
        return ramTotal;
    }

    public void setRamTotal(double ramTotal) {
        this.ramTotal = ramTotal;
    }

    public boolean isStatusLigado() {
        return statusLigado;
    }

    public void setStatusLigado(boolean statusLigado) {
        this.statusLigado = statusLigado;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;             
        if (o == null || getClass() != o.getClass()) return false; 
        Servidor outro = (Servidor) o;            
        return Objects.equals(this.ip, outro.ip); 
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ip);
    }


}
