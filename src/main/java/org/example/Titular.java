package org.example;

import java.util.Objects;
/*
nome
cpf
 */

public class Titular {
     private String nome;
     private String cpf;

    //construtor
    public Titular(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    /* nao pode ser alterado
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
     */
}
