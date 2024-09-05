package io.github.exercicios.pedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Item> itens;

    private Cliente cliente;

    public Pedido(Cliente cliente, Item item) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.itens.add(item);
    }

    public Pedido(Cliente cliente, List<Item> itens) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.itens.addAll(itens);
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public void removerItem(Item item) {
        this.itens.remove(item);
    }

    public boolean isClienteVip() {
        return this.cliente.getTipo() == TipoCliente.VIP;
    }
}
