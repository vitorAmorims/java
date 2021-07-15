package com.loiane.tratamentoDeErroExcecoes.trycatch;

public class Excecao {
//    public static void main(String[] args) {
//        System.out.println("Será impresso na tela");
//        int[] numeros = new int[4];
//        numeros[4] = 10;
//        /*
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//        * */
//        System.out.println("não será impresso na tela");
//    }

    public static void main(String[] args) {
        try{
            System.out.println("Será impresso na tela");
            int[] numeros = new int[4];
            numeros[4] = 10;
            System.out.println("Não será impresso");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Você está tentado acessar indice inexistente");
        }
        System.out.println("Fim do programa");
    }
}
