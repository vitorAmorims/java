package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula003 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        /* aqui estou inserindo try/catch
        try {
            vetor.adiciona("Vitor");
            vetor.adiciona("Lucas");
            vetor.adiciona("Neusa");
            vetor.adiciona("Rubens");
            vetor.adiciona("Silvia");
            vetor.adiciona("Higor");
        } catch (Exception e) {
            e.printStackTrace();
        }
        */

        System.out.println("Status da adição no vetor: " + vetor.adiciona("Vitor"));
        System.out.println("Status da adição no vetor: " + vetor.adiciona("Lucas"));
        System.out.println("Status da adição no vetor: " + vetor.adiciona("Neusa"));
        System.out.println("Status da adição no vetor: " + vetor.adiciona("Rubens"));
        System.out.println("Status da adição no vetor: " + vetor.adiciona("Silvia"));
        System.out.println("Status da adição no vetor: " + vetor.adiciona("Higor"));


    }
}
