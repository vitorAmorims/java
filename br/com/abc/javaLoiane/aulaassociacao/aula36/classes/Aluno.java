package br.com.abc.javaLoiane.aulaassociacao.aula36.classes;

import java.util.Arrays;

public class Aluno {
    private String name;
    private String matricula;
    private double[] notas = new double[4];
    private double media;
    private double soma = 0;
    private String status;

    public Aluno(){

    }

    public Aluno(String name, String matricula) {
        this.name = name;
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double mediaAluno() {
        for (double n : notas) {
            soma += n;
        }
        return media = soma / notas.length;
    }

//    public double mediaGeral(){
//        for(double n: notas){
//            somaGeral += n;
//        }
//        return mediaGeral = somaGeral / 5;
//    }
    public String imprimeStatus(){
        if(media >= 7d){
            return this.status = "Aprovado";
        } else {
            return this.status = "Reprovado";
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", matricula='" + matricula + '\'' +
                ", notas= " + Arrays.toString(notas) +
                ", media= " + this.mediaAluno() +
                ", Status= " + this.imprimeStatus() +
                '}';
    }
}
