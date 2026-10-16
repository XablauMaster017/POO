package br.com.nexuscloud.model;

import br.com.nexuscloud.exception.CapacidadeExcedidaException;
import br.com.nexuscloud.exception.ServidorOfflineException;
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

    public double calcularRamEmUso() {
        return this.containers.stream()
        .mapToDouble(c -> c.getRamNecessaria())
        .sum();
    }

    public void alocarContainer(Container c) throws CapacidadeExcedidaException {
            if (!statusLigado) {
                throw new ServidorOfflineException();
            } else if (calcularRamEmUso() + c.getRamNecessaria() > ramTotal) {
                throw new CapacidadeExcedidaException(this.ip);
            } else {
                containers.add(c);
            }
            
    }
}
