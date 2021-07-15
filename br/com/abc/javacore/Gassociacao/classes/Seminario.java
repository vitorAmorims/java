package br.com.abc.javacore.Gassociacao.classes;

import java.util.Arrays;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void print() {
        if (professor == null || local == null || alunos == null) {
            System.out.println("------------Relatório do seminário--------------------");
            System.out.println("Não é possível gerar o relatório de seminário, por favor passe informações.");
        } else {
            System.out.println("------------Relatório do seminário--------------------");
            System.out.println("Titulo: " + this.getTitulo());
            System.out.println("Professor palestrante: " + this.professor.getNome());
            System.out.println("Local: " + this.local.getRua() + ", Bairro: " + this.local.getBairro());
            System.out.println("Alunos participantes: ");
            for (Aluno al : alunos) {
                System.out.println(al.getNome() + ", idade: " + al.getIdade());
            }
        }
    }
}
