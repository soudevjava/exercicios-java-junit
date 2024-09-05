package io.github.exercicios.pedidos;

public class ServicoPedido {

    public double calcularPrecoTotal(Pedido pedido) {
        double total = 0.0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }

        if (pedido.isClienteVip()) {
            total *= 0.8; // Agora 20% de desconto para clientes VIP
        }

        return total;
    }
}
