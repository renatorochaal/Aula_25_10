package com.example.aula_25_10;

import java.io.Serializable;

public class Aluno implements Serializable {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
