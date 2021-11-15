package com.github.tetsab;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Miney Mouse");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Mickey Mouse");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);

        cc.depositar(200);
        poupanca.depositar(1000);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Banco bancoHorizonte = new Banco();
        bancoHorizonte.setNome("Banco Horizonte");
        bancoHorizonte.addContaBanco(cc);
        bancoHorizonte.addContaBanco(poupanca);
        bancoHorizonte.listAllClients();
    }
}
