package com.loiane.estruturadados.pilha;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> par = new Stack<>();
        Stack<Integer> impar = new Stack<>();
        for (int index = 0; index < 10; index++) {
            System.out.println("Digite um numero: ");
            int numero = scan.nextInt();
            if (numero == 0) {
                if (!par.isEmpty()) {
                    System.out.println("Desempilhando elemento da pilha par: " + par.peek());
                    par.pop();
                } else {
                    System.out.println("Pilha está vazia");
                }
                if (!impar.isEmpty()) {
                    System.out.println("Desempilhando elemento da pilha impar: " + impar.peek());
                    impar.pop();
                } else {
                    System.out.println("Pilha está vazia");
                }
            }
            if (numero % 2 == 0) {
                par.push(numero);
            }
            impar.push(numero);
        }
        if (par.isEmpty()) {
            System.out.println("Pilha par está vazia");
        } else {
            while (!par.isEmpty()) {
                System.out.println("Desempilhando um elemento da pilha par: " + par.pop());
            }
        }
        if (impar.isEmpty()) {
            System.out.println("Pilha impar está vazia");
        } else {
            while (!impar.isEmpty()) {
                System.out.println("Desempilhando um elemento da pilha impar: " + impar.pop());
            }
        }
    }
}
