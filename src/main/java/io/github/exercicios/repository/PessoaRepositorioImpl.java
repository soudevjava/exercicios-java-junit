package io.github.exercicios.repository;

import io.github.exercicios.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PessoaRepositorioImpl {

    private List<Pessoa> pessoas;

    public PessoaRepositorioImpl() {
        this.pessoas = new ArrayList<>();
    }

    public void limpar() {
        this.pessoas.clear();
    }

    public void adicionaPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public List<Pessoa> buscarTodasPessoas() {
        return this.pessoas;
    }

    public Optional<Pessoa> buscaPorId(String id){
         return this.pessoas.stream().filter(pessoa -> pessoa.getId().equals(id)).findFirst();
    }

    public void desligaConexaoBanco() {
        System.out.println("Desligou");
    }
}
