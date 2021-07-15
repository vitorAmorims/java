package com.loiane.Fatorial;

public class Fatorial {
    public static void main(String[] args) {
        resultadoCalculoFatorial(5);
    }

    public static void resultadoCalculoFatorial(int numero) {
        System.out.println("Fatorial: " + numero + ", é igual: " + calcularFatorial(numero));
        System.out.println("Fatorial Recursivo: " + numero + ", é igual: " + calcularFatorialR(numero));
    }

    public static int calcularFatorial(int numero) {
        int n = 1;
        int soma = 1;
        for (int i = numero; i >= n; i--) {
            soma *= i;
        }
        return soma;
    }

    public static int calcularFatorialR(int numero) {
        if (numero == 0) {
            return 1;
        }
        int soma = numero-- * calcularFatorialR(numero);
        return soma;
    }
}
