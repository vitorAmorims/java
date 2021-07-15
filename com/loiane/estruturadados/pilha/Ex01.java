package com.loiane.estruturadados.pilha;

import java.util.Scanner;
import java.util.Stack;

public class Ex01 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<Integer>();
        Scanner scan = new Scanner(System.in);
        int numero;
        for (int index = 0; index < 10; index++) {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) {
                pilha.push(numero);
            } else {
                if (pilha.isEmpty()) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Removendo o elemento da pilha: "+ pilha.peek());
                    pilha.pop();
                }
            }
        }
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando um elemento da pilha: " + pilha.pop());
        }
    }
}
