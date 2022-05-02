package com.unipe.TE;

public class ContaCorrente {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (saldo < valor)
            System.out.println("Saldo insuficiente!");
        else
            this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
}
