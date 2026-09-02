package br.com.cyberfestival.model;

import java.util.HashMap;
import java.util.Map;

public class Bilheteria {

    // RN03: banco de dados em memória. Chave = codigoId do ingresso.
    public Map<String, Ingresso> ingressosVendidos = new HashMap<>();

    // RN03: venda de ingresso
    public void venderIngresso(Ingresso ingresso) {
        // Se o mapa já contém a chave (codigoId), o ingresso é duplicado (cambista).
        if (ingressosVendidos.containsKey(ingresso.getCodigoId())) {
            throw new IngressoInvalidoException();
        }
        // Caso contrário, adiciona no mapa.
        ingressosVendidos.put(ingresso.getCodigoId(), ingresso);
    }

    // RN04: contabilidade usando APENAS Streams (proibido for e if)
    public double calcularReceitaVIP() {
        return ingressosVendidos.values().stream()
                .filter(ingresso -> "VIP".equals(ingresso.getTipo())) // deixa passar só "VIP"
                .mapToDouble(Ingresso::getValor)                       // extrai o valor
                .sum();                                                // retorna a soma total
    }
}
