package br.com.abc.javaLoiane.aulaassociacao.aula36.classes;

import java.util.Arrays;

public class Curso {
    private String name;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso(String name, String horario) {
        this.name = name;
        this.horario = horario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
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

    private double somaGeral = 0;
    private double mediaGeral = 0;

    public double mediaGeral() {
        for (Aluno al : alunos) {
            for (double n : al.getNotas()) {
                somaGeral += n;
            }
        }
        return mediaGeral = somaGeral / 20;
    }

    @Override
    public String toString() {
        System.out.println("Relatório do curso");
        String info;
        info = "Curso{";
        info += "name='" + name + '\'';
        info += ", horario='" + horario + '\'';
        info += ", professor=" + professor;
        info += ", alunos=" + Arrays.toString(alunos);
        for (Aluno al : alunos) {
            info += al.mediaAluno();
        }
        info += ", Média Geral da Turma: " + this.mediaGeral();
        info += '}';
        return info;
    }
}
