package br.com.abc.javacore.Bintroducaometodos.classes;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ExercicioEstudante {
    protected String nome;
    protected int idade;
    protected double[] notas = new double[3];
    protected double media;
    protected String status;

    public ExercicioEstudante(String nome, int idade, double[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double obterMedia() {
        double soma = 0d;
        for (double n : notas) {
            soma += n;
        }
        return media = soma / notas.length;
    }

    public String situacao(){
        if(media > 6.0){
           return this.status = "Aprovado";
        } else {
            return this.status = "Reprovado";
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return "ExercicioEstudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", notas=" + Arrays.toString(notas) +
                ", obteve média: " + df.format(this.obterMedia()) + ", Status: " + this.situacao() +'}';
    }
}
