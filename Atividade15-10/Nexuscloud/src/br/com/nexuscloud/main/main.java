package br.com.nexuscloud.main;

import br.com.nexuscloud.exception.CapacidadeExcedidaException;
import br.com.nexuscloud.model.Cliente;
import br.com.nexuscloud.model.CloudManager;
import br.com.nexuscloud.model.Container;
import br.com.nexuscloud.model.Servidor;

public class main {
    public static void main(String[] args) throws CapacidadeExcedidaException {
     // 1.
        CloudManager manager = new CloudManager();

      // 2.
        Cliente cliente = new Cliente("111.222.333-44", "Wayne Enterprises");

      // 3.
        Servidor servidor = new Servidor("192.168.0.1", 5.50, 16.0);

       // 4.
        manager.registrarCliente(cliente);
        manager.adicionarServidor(cliente, servidor);

       // 5.
        Container c1 = new Container("C-01", "App-01", 10.0);
        Container c2 = new Container("C-02", "App-02", 8.0);

      // 6.

        servidor.ligar();

        servidor.alocarContainer(c1);
        System.out.println("Container C-01 alocado com sucesso.");

        try {
            servidor.alocarContainer(c2);
        } catch (CapacidadeExcedidaException e) {
            System.out.println("Exceção tratada: " + e.getMessage());
        }

        System.out.println("Fatura ativa do cliente: R$ " + manager.calcularFaturaAtiva(cliente));
    }
}