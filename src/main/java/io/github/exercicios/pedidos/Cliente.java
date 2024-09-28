package io.github.exercicios.pedidos;

public class Cliente {

    private String id;

    private String nome;

    private TipoCliente tipo;

    public Cliente(String id, String nome, TipoCliente tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }
}
