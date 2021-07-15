package com.loiane.tratamentoDeErroExcecoes.stackTraceAndThrows;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {
        System.out.println("Digite um numero double");
        try {
            double numero = leNumero();
            System.out.println("O numero digitado é: " + numero);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double numero = scan.nextDouble();
        return numero;
    }
}
