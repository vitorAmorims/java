package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        vetor.adiciona("A");
        vetor.adiciona("G");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        System.out.println(vetor.toString());
        vetor.remove(1);
        System.out.println(vetor.toString());
        int posicao = vetor.busca("E");
        System.out.println("Remover o elemento E do vetor");
        if (posicao >= 0){
            vetor.remove(posicao);
            System.out.println("Elemento removido do vetor");
            System.out.println(vetor.toString());
        } else {
            System.out.println("Elemento não encontrado no vetor");
        }

    }
}
