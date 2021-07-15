package com.loiane.tratamentoDeErroExcecoes.criandoExcecao;

public class Teste {
    public static void main(String[] args) {
        int[] numeros = {10, 2, 0, 1, 4, 0, 8};
        int[] n = {2, 1, 0, 4, 3};
        for (int index = 0; index < numeros.length; index++) {
            try {
                if(numeros[index] % 2 != 0){
                    throw new DivisaoNaoExata(numeros[index], n[index]);
                }
                System.out.println("A divisão de " + numeros[index] + " por " + n[index] + ", e igual: " + numeros[index] / n[index]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
