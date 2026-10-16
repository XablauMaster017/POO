package br.com.starlog.model;

import br.com.starlog.exception.CapacidadeExcedidaException;
import java.util.ArrayList;
import java.util.List;


public class ModuloCarga {

    private String codigoModulo;
    private int capacidadeMaxima;
    private List<Carga> cargas = new ArrayList<>();

    public ModuloCarga(String codigoModulo, int capacidadeMaxima) {
        this.codigoModulo = codigoModulo;
        this.capacidadeMaxima = capacidadeMaxima;
    }
//------------------ Getters -----------------------------------
    public String getCodigoModulo() {
        return codigoModulo;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    //----------------------------- Verificar Exceção (RN02) -------------------------------------------------
    public void carregarCarga(Carga carga) throws CapacidadeExcedidaException {
        if (cargas.size() >= capacidadeMaxima) {
            throw new CapacidadeExcedidaException(
                    "Modulo '" + codigoModulo + "' atingiu a capacidade maxima de "
                            + capacidadeMaxima + " cargas.");
        }
        cargas.add(carga);
    }

//-------------------------- Processamento Declarativo (RN05) ------------------------------------
    public double calcularSeguroTotal() {
        return cargas.stream()
                .mapToDouble(Carga::getValorSeguro)
                .sum();
    }

    public long contarCargasPorCategoria(String categoria) {
        return cargas.stream()
                .filter(c -> c.getCategoria().equals(categoria))
                .count();
    }

    public double calcularSeguroCargasPesadas(String categoria, double pesoMinimo) {
        return cargas.stream()
                .filter(c -> c.getCategoria().equals(categoria))
                .filter(c -> c.getPesoKg() > pesoMinimo)
                .mapToDouble(Carga::getValorSeguro)
                .sum();
    }
//---------------------------------------------------------------------------------------------------



}
