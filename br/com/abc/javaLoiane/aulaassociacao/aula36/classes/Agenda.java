package br.com.abc.javaLoiane.aulaassociacao.aula36.classes;

import br.com.abc.javacore.Gassociacao.classes.Aluno;

import java.util.Arrays;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Agenda(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        if (contatos == null || this.getNome() == null) {
            System.out.println("Não existe contato inserido na agenda");
        } else {
            System.out.println("Relatório de agenda");
            System.out.println("Nome da agenda.....: " + this.getNome());
            for (Contato c : contatos) {
                System.out.println("Nome: " + c.getNome() + ", email: " + c.getEmail() + ", telefone: " + c.getTelefone());
            }
        }

    }
}
