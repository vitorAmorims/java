package com.loiane.orientacaoaobjetos.aula37.classes;

import java.util.Arrays;

public class Aluno extends Pessoa{
    private String matricula;
    private String[] cursos;
    private double[] notas;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        super.toString();
        return "Aluno{" + super.toString() +
                "matricula='" + matricula + '\'' +
                ", cursos=" + Arrays.toString(cursos) +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
