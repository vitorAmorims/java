package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aul07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("A");
        vetor.adiciona("C");
        vetor.adiciona("E");
        System.out.println(vetor.toString());
        vetor.adiciona(1, "B");
        System.out.println(vetor.toString());
        vetor.adiciona(3,"D");
        System.out.println(vetor.toString());
    }
}
