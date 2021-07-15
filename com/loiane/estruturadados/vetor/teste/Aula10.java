package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Contato;
import com.loiane.estruturadados.vetor.VetorObject;

public class Aula10 {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(3);
        Contato c1 = new Contato("vitor", "11 998569799", "Rua Alencar Ariripe");
        Contato c2 = new Contato("Lucas", "11 998569799", "Rua Alencar Ariripe");
        Contato c3 = new Contato("Neusa", "11 998569799", "Rua Silvestro Silvestre");
        Contato c4 = new Contato("vitor", "11 998569799", "Rua Alencar Ariripe");
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
//        System.out.println(vetor);
//        int pos = vetor.busca();
//        if (pos >=0){
//            System.out.println("contato está no vetor");
//        } else {
//            System.out.println("contato NÂO está no vetor");
//        }
    }

}
