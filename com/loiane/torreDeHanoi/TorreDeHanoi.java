package com.loiane.torreDeHanoi;

import java.util.Stack;

public class TorreDeHanoi {
    public static void main(String[] args) {
        Stack<Integer> origem = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        origem.push(3);
        origem.push(2);
        origem.push(1);

        destino.push(origem.pop());
        auxiliar.push(origem.pop());
        auxiliar.push(destino.pop());
        destino.push(origem.pop());
        origem.push(auxiliar.pop());
        destino.push(auxiliar.pop());
        destino.push(origem.pop());

        System.out.println(destino);

    }
}
