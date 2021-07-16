package com.loiane.garbage_colector.aula66;

import com.loiane.Ex52.Contato;

public class ColetorLixo {
    public static void obterMemoria(){
        final int MB = 1024 * 1024; // by para mb
        Runtime runtime = Runtime.getRuntime(); //padrão singleton
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
    }
    public static void main(String[] args) {
        Contato[] contatos = new Contato[1000000];
        Contato contato;

        for (int i = 0; i < contatos.length; i++) {
            contato = new Contato();
            contato.setNome("Vi" + i);
            contato.setEmail("vi" + i + "@gma.com");
            contato.setTelefone("1234-123" + i);
            contatos[i] = contato;
        }
        System.out.println("contatos criados");
        obterMemoria();
        contatos = null;

        Runtime.getRuntime().runFinalization();

        Runtime.getRuntime().gc();

        System.out.println("contatos removidos da memória");
        obterMemoria();
    }
}
