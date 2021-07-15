package com.loiane.estruturadados.pilha;

import java.util.Scanner;
import java.util.Stack;

public class Ex03 {
    public static void main(String[] args) {
        Stack<Livro> livros = new Stack<Livro>();

        for (int index = 0; index < 6; index++) {
            Scanner scan = new Scanner(System.in);
            Scanner scanInt = new Scanner(System.in);

            System.out.println("Digite o nome do livro: ");
            String nome = scan.next();
            System.out.println("Digite o numero isbn: ");
            int isbn = scanInt.nextInt();
            System.out.println("Digite o ano do lançamento do livro: ");
            int ano = scanInt.nextInt();
            System.out.println("Digite o autor do livro: ");
            String autor = scan.next();
            Livro livro = new Livro(nome, isbn, ano, autor);
            livros.push(livro);
            System.out.println(livro);
        }
        System.out.println(livros);
        System.out.println("tamanho da pilha: "+ livros.size());
        System.out.println("ver o último elemento da pilha: "+ livros.peek());
        System.out.println("Remover o ultimo livro da pilha: "+ livros.pop());
        System.out.println(livros);
        Livro livro = new Livro("Teste de livro", 123, 2021, "Vitor");
        livros.push(livro);
        System.out.println(livros);
    }
}
