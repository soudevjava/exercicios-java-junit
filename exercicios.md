# Proposta de Exercícios Diversificados para Praticar JUnit

## 1. Classe Calculadora

**Métodos:**
- `soma(int a, int b)`
- `subtrai(int a, int b)`
- `multiplica(int a, int b)`
- `divide(int a, int b)` (lança uma exceção se b for 0)

**Cenários de Teste:**
- Verifique se a soma de dois números positivos é correta.
- Teste a subtração de números negativos.
- Valide se a multiplicação com zero retorna zero.
- Teste se a divisão por zero lança a exceção correta.
- Teste o comportamento de operações com números grandes.

---

## 2. Classe ContaBancaria

**Métodos:**
- `depositar(double valor)`
- `sacar(double valor)` (lança exceção se saldo insuficiente)
- `consultarSaldo()`

**Cenários de Teste:**
- Verifique se o saldo é atualizado corretamente após um depósito.
- Teste o comportamento ao tentar sacar mais do que o saldo disponível.
- Valide o saldo após uma sequência de depósitos e saques.
- Teste a exceção ao tentar sacar um valor maior que o saldo.

---

## 3. Classe Pedido

**Métodos:**
- `adicionarItem(Item item)`
- `removerItem(Item item)`
- `calcularTotal()`

**Cenários de Teste:**
- Verifique se o total do pedido é calculado corretamente após adicionar e remover itens.
- Teste a remoção de um item que não está no pedido (deve manter o pedido inalterado).
- Valide o cálculo do total quando o pedido está vazio.
- Teste o cálculo do total com descontos aplicados (se aplicável).

---

## 4. Classe ConversorDeTemperatura

**Métodos:**
- `celsiusParaFahrenheit(double celsius)`
- `fahrenheitParaCelsius(double fahrenheit)`

**Cenários de Teste:**
- Teste a conversão de 0°C para Fahrenheit.
- Verifique a conversão de 32°F para Celsius.
- Teste a precisão da conversão com valores decimais.
- Valide o comportamento com valores negativos.

---

## 5. Classe GerenciadorDeTarefas

**Métodos:**
- `adicionarTarefa(Tarefa tarefa)`
- `removerTarefa(String nomeTarefa)`
- `marcarComoConcluida(String nomeTarefa)`
- `obterTarefasPendentes()`

**Cenários de Teste:**
- Verifique se a tarefa é adicionada corretamente.
- Teste a remoção de uma tarefa inexistente (a lista deve permanecer inalterada).
- Valide se a marcação de uma tarefa como concluída funciona corretamente.
- Teste a obtenção de tarefas pendentes após várias adições e remoções.

---

## 6. Classe ValidadorEmail

**Método:**
- `validar(String email)` (retorna true se o email for válido, false caso contrário)

**Cenários de Teste:**
- Teste emails válidos como `usuario@dominio.com`.
- Verifique emails inválidos como `usuario@.com` ou `@dominio.com`.
- Teste o comportamento com entradas vazias ou nulas.
- Valide o email com caracteres especiais permitidos.

---

## 7. Classe Produto

**Métodos:**
- `aplicarDesconto(double percentual)`
- `getPreco()`

**Cenários de Teste:**
- Verifique se o preço é atualizado corretamente após a aplicação de um desconto.
- Teste a aplicação de um desconto de 100% (preço deve ser zero).
- Valide o comportamento ao aplicar um desconto negativo (deve lançar exceção).
- Teste a aplicação de um desconto em sequência (ex: dois descontos de 10%).

---

## 8. Classe AgendaContato

**Métodos:**
- `adicionarContato(Contato contato)`
- `removerContato(String nome)`
- `buscarContato(String nome)`

**Cenários de Teste:**
- Verifique se um contato é adicionado corretamente.
- Teste a remoção de um contato e verifique se ele não pode mais ser encontrado.
- Valide o comportamento ao buscar um contato inexistente.
- Teste a busca por contatos com o mesmo nome (caso o sistema permita duplicatas).

---

## 9. Classe Carro

**Métodos:**
- `acelerar(int incremento)`
- `frear(int decremento)`
- `getVelocidadeAtual()`

**Cenários de Teste:**
- Teste se a velocidade aumenta corretamente após uma aceleração.
- Verifique o comportamento ao frear até a velocidade zero.
- Valide se a velocidade não pode ser negativa após uma frenagem excessiva.
- Teste a aceleração em uma velocidade já no limite (se houver limite).

---

## 10. Classe GeradorSenha

**Métodos:**
- `gerarSenha(int comprimento)` (gera uma senha aleatória de comprimento específico)

**Cenários de Teste:**
- Teste a geração de uma senha com comprimento mínimo.
- Verifique a geração de uma senha com caracteres especiais.
- Valide se a senha gerada tem o comprimento correto.
- Teste a geração de várias senhas e verifique se todas são diferentes (teste de aleatoriedade).

---

Esses exercícios cobrem diferentes aspectos do JUnit, como uso de assertivas, testes com exceções, mockagem, e boas práticas de teste. Você pode organizá-los em níveis de dificuldade, começando pelos mais simples e gradualmente introduzindo conceitos mais complexos. Cada exercício pode ter uma breve descrição do problema, a assinatura dos métodos a serem testados, e os cenários de teste a serem implementados.
