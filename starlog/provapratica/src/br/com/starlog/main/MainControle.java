package br.com.starlog.main;

import br.com.starlog.exception.CapacidadeExcedidaException;
import br.com.starlog.model.BaseLancamento;
import br.com.starlog.model.Carga;
import br.com.starlog.model.ModuloCarga;

public class MainControle {

    public static void main(String[] args) throws Exception {

// ----------------------------------- P01 ---------------------------------------------------------------------------
        Carga c1 = new Carga("ORB-101-SP", "CRIOGENICA", 2.5, 450.00);
        Carga c2 = new Carga("ORB-102-SP", "PADRAO", 8.0, 120.00);
        Carga c3 = new Carga("ORB-103-SP", "CRIOGENICA", 12.0, 850.00);
        Carga c4 = new Carga("ORB-104-SP", "BIOLOGICA", 15.0, 300.00);
        System.out.println(c1);
        System.out.println(c4);

// ----------------------------------- P02 ---------------------------------------------------------------------------
        ModuloCarga modulo = new ModuloCarga("MOD-ALFA-01", 3);
        BaseLancamento base = new BaseLancamento();
        base.cadastrarModulo(modulo);
        System.out.println("Modulo '" + modulo.getCodigoModulo()
                + "' cadastrado na base com capacidade de "
                + modulo.getCapacidadeMaxima() + " cargas.");

// ----------------------------------- P03 ---------------------------------------------------------------------------
        try {
            modulo.carregarCarga(c1);
            System.out.println("Carga " + c1.getCodigoRastreio() + " carregada no modulo com sucesso.");
            modulo.carregarCarga(c2);
            System.out.println("Carga " + c2.getCodigoRastreio() + " carregada no modulo com sucesso.");
            modulo.carregarCarga(c3);
            System.out.println("Carga " + c3.getCodigoRastreio() + " carregada no modulo com sucesso.");
        } catch (CapacidadeExcedidaException e) {
            System.out.println("Excecao capturada: " + e.getMessage());
        }

// ----------------------------------- P04 ---------------------------------------------------------------------------
        try {
            modulo.carregarCarga(c4);
            System.out.println("Carga " + c4.getCodigoRastreio() + " carregada no modulo com sucesso.");
        } catch (CapacidadeExcedidaException e) {
            System.out.println("Excecao capturada: " + e.getMessage());
        }

// ----------------------------------- P05 ---------------------------------------------------------------------------
        ModuloCarga localizado = base.buscarModulo("MOD-ALFA-01");
        System.out.println("Modulo localizado na base: " + localizado.getCodigoModulo());

// ----------------------------------- P06 ---------------------------------------------------------------------------
        System.out.println("Seguro total do modulo: R$" + modulo.calcularSeguroTotal());

// ----------------------------------- P07 ---------------------------------------------------------------------------
        System.out.println("Cargas CRIOGENICA: " + modulo.contarCargasPorCategoria("CRIOGENICA"));

// ----------------------------------- P08 ---------------------------------------------------------------------------
        System.out.println("Seguro de cargas criticas (CRIOGENICA > 5kg): R$"
            + modulo.calcularSeguroCargasPesadas("CRIOGENICA", 5.0));

// ----------------------------------- P09 ---------------------------------------------------------------------------
        //Erro de sintax, não compilou
    }
}
