package com.loiane.estruturadados.Arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Vitor", "11 998569799", "vtamorims@gmail.com");
        Contato contato2 = new Contato("Lucas", "11 998560033", "lucas@gmail.com");

        ArrayList<Contato> contatos = new ArrayList<>();
        contatos.add(contato1);
        contatos.add(contato2);

        contatos.forEach(c -> System.out.println(c));

    }
}
