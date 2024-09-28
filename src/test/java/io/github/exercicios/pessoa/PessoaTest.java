package io.github.exercicios.pessoa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PessoaTest {

    @DisplayName("Valida se verificação idade está correta")
    @Test
    void testaEhMaiorDeIdade() {
        Pessoa willyan = new Pessoa("1", "Willyan", LocalDate.now());

        assertNotNull(willyan);
        assertFalse(willyan.ehMaiorDeIdade());

        willyan = new Pessoa("1", "Willyan", LocalDate.of(2000, 1, 1));
        assertTrue(willyan.ehMaiorDeIdade());
    }

    @Test
    public void validaSeEhAMesmaPessoa() {
        Pessoa willyan = new Pessoa("1", "Willyan", LocalDate.now());
        Pessoa willyan2 = willyan;

        assertSame(willyan, willyan2);
    }
}