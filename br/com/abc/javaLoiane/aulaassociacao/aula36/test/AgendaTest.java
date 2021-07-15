package br.com.abc.javaLoiane.aulaassociacao.aula36.test;

import br.com.abc.javaLoiane.aulaassociacao.aula36.classes.Agenda;
import br.com.abc.javaLoiane.aulaassociacao.aula36.classes.Contato;

import java.util.Scanner;

public class AgendaTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome da agenda");
        Agenda agenda = new Agenda(scan.next());

        Contato[] contatos = new Contato[3];

        int i = 0;
        while(i < 3){
            System.out.println("Digite nome, telefone e email");
            contatos[i] = new Contato(scan.next(), scan.next(), scan.next());
            System.out.println();
            i++;
        }
        for(Contato c: contatos){
            System.out.println(c.toString());
        }
        agenda.setContatos(contatos);
        if (agenda != null){
            agenda.imprime();
        }
    }
}
