package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        System.out.println("Status da adição no vetor: " + vetor.adiciona("Vitor"));
        System.out.println("Status da adição no vetor: " + vetor.adiciona("Lucas"));
        System.out.println("Status da adição no vetor: " + vetor.adiciona("Neusa"));

//        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
    }
}
