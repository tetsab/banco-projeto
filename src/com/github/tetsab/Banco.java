package com.github.tetsab;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void listAllClients() {
        System.out.println(String.format("\n======= Usuários do Banco: %s ======", this.nome));
        for(Conta conta: contas){
            System.out.println(conta.getCliente().getNome());
        }
        System.out.println("=================================================");
    }

    public void addContaBanco(Conta conta) { this.contas.add(conta); }
}
