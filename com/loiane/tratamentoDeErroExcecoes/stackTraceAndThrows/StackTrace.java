package com.loiane.tratamentoDeErroExcecoes.stackTraceAndThrows;

public class StackTrace {
    public static void main(String[] args) {
        int[] numeros = {10, 2, 0, 1, 3, 0};
        int[] n = {2, 1, 0, 4};

        for (int index = 0; index < numeros.length; index++) {
            try {
                System.out.println("A divisão de " + numeros[index] + " por " + n[index] + ", e igual: " + numeros[index] / n[index]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
