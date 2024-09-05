package io.github.exercicios.pedidos;

import java.util.List;

public class ServicoEstatisticas {

    private ServicoPedido servicoPedido;

    public ServicoEstatisticas() {
        this.servicoPedido = new ServicoPedido();
    }

    public double calcularTotalVendas(List<Pedido> pedidos) {
        double totalVendas = 0.0;
        for (Pedido pedido : pedidos) {
            totalVendas += servicoPedido.calcularPrecoTotal(pedido);
        }
        return totalVendas;
    }
}
