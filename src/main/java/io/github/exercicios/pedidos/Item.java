package io.github.exercicios.pedidos;

public class Item {

    private Integer id;

    private String descricao;

    private Double preco;

    public Item(Integer id, String descricao, Double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }
}