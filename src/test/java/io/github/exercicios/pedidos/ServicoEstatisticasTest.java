package io.github.exercicios.pedidos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ServicoEstatisticasTest {

    @Test
    public void deve_totalizar_corretamente_os_pedidos() {

        Cliente cliente = new Cliente("1", "Willyan", TipoCliente.VIP);

        List<Item> itens = List.of(

                new Item(1, "Livro Java Como Programar", 200.00),
                new Item(2, "Livro Arquitetura de software Java", 200.00)

        );

        Pedido pedido = new Pedido(cliente, itens);

        Assertions.assertEquals(320.0, new ServicoEstatisticas().calcularTotalVendas(List.of(pedido)));
    }
}
