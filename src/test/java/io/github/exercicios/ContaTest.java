package io.github.exercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ContaTest {

    @Disabled("Não terminei de criar o teste")
    @Test
    void verificaSeContaEhCriadaCorretamente() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Conta("12345-6", 0.0));
    }
}
