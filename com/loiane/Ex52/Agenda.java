package com.loiane.Ex52;

import java.util.Arrays;

public class Agenda {
    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {
        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                break;
            }
            if (cheia) {
                throw new AgendaCheiaException();
            }
        }
    }

    public boolean consultaContato(String nome) throws ContatoNaoExisteExcepetion {
        for (Contato c : contatos) {
            if (c != null) {
                if (c.getNome().equalsIgnoreCase(nome)) {
//                    System.out.println(c);
                    return true;
                }
            }
        }
        throw new ContatoNaoExisteExcepetion(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos) {
            if (c != null) {
                s += c.toString() + "\n";
            }
        }
        return s;
    }
}
