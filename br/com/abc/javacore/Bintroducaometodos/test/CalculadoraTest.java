package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somarDoisNumeros(1,4));

        //estou atribuindo o retorno do método + 1 para variavel x
        int x = calc.somarDoisNumeros(10,5) + 1;

        System.out.println(x);

    }

}
