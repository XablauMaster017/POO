package br.com.starlog.model;

import java.util.Objects;

public class Carga {

    private final String codigoRastreio;
    private String categoria;
    private double pesoKg;
    private double valorSeguro;

    public Carga(String codigoRastreio, String categoria, double pesoKg, double valorSeguro) throws Exception {
        if (codigoRastreio == null || codigoRastreio.trim().isEmpty()) {
            throw new Exception("Codigo de rastreio da carga não pode ser nulo ou vazío.");
        }
        this.codigoRastreio = codigoRastreio;
        this.categoria = categoria;
        this.pesoKg = pesoKg;
        this.valorSeguro = valorSeguro;
    }

    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

//-------------------------- Identidade Semantica (RN03) -----------------------
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        Carga outra = (Carga) obj;
        return codigoRastreio.equals(outra.codigoRastreio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoRastreio);
    }

//------------------- Sobreescrevendo a função toString() [RN02] --------------------------------
    @Override
    public String toString() {
        return 
        "Carga[rastreio=" + codigoRastreio +
        ", categoria=" + categoria + ", peso=" + pesoKg + "kg," + 
        " seguro=" + valorSeguro + "]";
    }
}
