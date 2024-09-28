package io.github.exercicios.repository;

import io.github.exercicios.pessoa.Pessoa;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

public class PessoaRepositorioImplTest {

    private static PessoaRepositorioImpl repositorio = new PessoaRepositorioImpl();

    @BeforeEach
    void configuraRepositorioAntesDoTeste() {
        repositorio.limpar();
    }

    @AfterAll
    static void desligarConexaoComBancoDeDados() {
        repositorio.desligaConexaoBanco();
    }

    @Test
    public void verifica_se_insere(){
        repositorio.adicionaPessoa(new Pessoa("1", "Will", LocalDate.of(1990, 4, 20)));

        Assertions.assertEquals(1, repositorio.buscarTodasPessoas().size());
    }

    @Test
    public void quando_inserir_pessoa_deve_ser_encontrado_pela_busca_id(){
        Pessoa will = new Pessoa("1", "Will", LocalDate.of(1990, 4, 20));
        repositorio.adicionaPessoa(will);

        Optional<Pessoa> pessoaOptional = repositorio.buscaPorId(will.getId());
        Assertions.assertTrue(pessoaOptional.isPresent());
    }
}
