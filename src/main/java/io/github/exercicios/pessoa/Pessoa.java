package io.github.exercicios.pessoa;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Pessoa {

    private String id;

    private String nome;

    private LocalDate nascimento;

    public Pessoa(String id, String nome, LocalDate nascimento) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public boolean ehMaiorDeIdade() {
        return ChronoUnit.YEARS.between(this.nascimento, LocalDate.now()) >= 18;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
