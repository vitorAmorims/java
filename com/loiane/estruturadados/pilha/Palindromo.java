package com.loiane.estruturadados.pilha;

import java.util.Stack;

public class Palindromo {
    public static void main(String[] args) {
        resultado("ana");
        resultado("ABCD");
        resultado("ABCCBA");
        resultado("Maria");
    }

    public static void resultado(String palavra) {
        System.out.println(palindromo(palavra));
    }

    public static boolean palindromo(String palavra) {
        Stack<Character> pilhaDeletras = new Stack<>();
        for (int index = 0; index < palavra.length(); index++) {
            pilhaDeletras.push(palavra.charAt(index));
        }
        String novaPalavra = "";
        while (!pilhaDeletras.isEmpty()) {
            novaPalavra += pilhaDeletras.pop();
        }
        if (novaPalavra.equals(palavra)) {
            return true;
        }
        return false;
    }
}
