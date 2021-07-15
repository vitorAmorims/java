package com.loiane.Ex52;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoDoMenu(scan);

            if (opcao == 1) { //Consultar o contato
                consultarOcontato(scan, agenda);
            } else if (opcao == 2) { //Adicionar o contato
                adicionarOcontato(scan, agenda);
            } else if (opcao == 3) { //Sair
                System.exit(0);
            }
        }
    }

    public static void adicionarOcontato(Scanner scan, Agenda agenda) {
        System.out.println("Criando um contato, entre com as informações");
        String nome = leInformacao(scan, "Digite o nome do contato");
        String telefone = leInformacao(scan, "Digite o telefone do contato");
        String email = leInformacao(scan, "Digite o email do contato");

        Contato contato = new Contato();

        contato.setNome(nome);
        contato.setEmail(email);
        contato.setTelefone(telefone);

        try {
            System.out.println("Adcionando contato na agenda");
            agenda.adicionarContato(contato);
            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void consultarOcontato(Scanner scan, Agenda agenda) {
        String nome = leInformacao(scan, "Digite o nome do contato a ser pesquisado");
        try {
            if (agenda.consultaContato(nome)) {
                System.out.println(agenda.consultaContato(nome));
            }
        } catch (ContatoNaoExisteExcepetion e) {
            System.out.println(e.getMessage());
        }
    }

    public static String leInformacao(Scanner scan, String msg) {
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoDoMenu(Scanner scan) {
        boolean entradaValida = false;
        int opcao = 3;
        while (!entradaValida) {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Consultar o contato");
            System.out.println("2 - Adicionar o contato");
            System.out.println("3 - Sair");
            try {

                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada invalida");
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida, digite novamente!\n");
            }
        }
        return opcao;
    }
}
