package com.github.tetsab;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("\n==== Extrato Conta Poupança ====");
        super.imprimirInfoComum();
        System.out.println("================================");
    }
}
