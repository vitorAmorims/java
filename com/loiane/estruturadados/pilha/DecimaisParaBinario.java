package com.loiane.estruturadados.pilha;

import java.util.Stack;

public class DecimaisParaBinario {
    public static void main(String[] args) {
        imprimeResultadoBinario(10);
        imprimeResultadoBinario(4);
        imprimeResultadoEmQualquerBase(10, 16);
        imprimeResultadoEmQualquerBase(4, 16);
    }

    public static void imprimeResultadoBinario(int numero) {
        System.out.println(numero + " em binario é " + decimalParaBinario(numero));
    }

    public static void imprimeResultadoEmQualquerBase(int numero, int base) {
        System.out.println(numero + " na base: " + base + " é " + decimalParaQualquerBase(numero, base));
    }

    public static String decimalParaBinario(int numero) {
        Stack<Integer> pilha = new Stack<>();
        String numeroBinario = "";
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }

        while (!pilha.isEmpty()) {
            numeroBinario += pilha.pop();
        }
        return numeroBinario;
    }

    public static String decimalParaQualquerBase(int numero, int base) {
        Stack<Integer> pilha = new Stack<>();
        String numeroBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }

        while (!pilha.isEmpty()) {
            numeroBase += bases.charAt(pilha.pop());
        }
        return numeroBase;
    }
}
