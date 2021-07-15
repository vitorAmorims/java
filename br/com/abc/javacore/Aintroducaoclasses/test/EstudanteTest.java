package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Vitor", 39, "1212");
        estudante.setNome("Lucas");
        estudante.setIdade(17);
        System.out.println(estudante.toString());

    }
}
