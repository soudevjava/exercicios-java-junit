package io.github.exercicios;

public class Conta {

    private String numeroConta;

    private Double saldo;

    public Conta(String numeroConta, Double saldo) {

        if(saldo <= 0.0){
            throw new IllegalArgumentException("Conta deve depositar algum valor");
        }

        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }
}
