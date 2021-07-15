package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.ExercicioEstudante;

public class ExercicioEstudanteTest {
    public static void main(String[] args) {
        ExercicioEstudante estudante = new ExercicioEstudante("Vitor", 39, new double[]{5, 7, 11});
        System.out.println(estudante.toString());

    }
}
