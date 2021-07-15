package com.loiane.estruturadados.fila;

public class Paciente {
    private String nome;
    private int prioridade;
    private int idade;

    public Paciente(String nome, int prioridade, int idade) {
        this.nome = nome;
        this.prioridade = prioridade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                ", idade=" + idade +
                '}';
    }
}
