package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class VetorObject {
    private Object[] elementos;
    private int tamanho;

    public VetorObject(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean adiciona(Object elemento) {
        this.aumentarTamanhoDoVetor();
        if (this.tamanho < this.elementos.length) {
            elementos[this.tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, Object elemento) {
        if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posicao inválida!!");
        }
        this.aumentarTamanhoDoVetor();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    private void aumentarTamanhoDoVetor() {
        if (this.getTamanho() == this.elementos.length) {
            Object[] novoVetor = new Object[this.elementos.length * 2];
            for (int index = 0; index < this.tamanho; index++) {
                novoVetor[index] = this.elementos[index];
            }
            this.elementos = novoVetor;
        }
    }

    //    A  G  D  E  F -> posicao a ser removida 1
    //    0  1  2  3  4 -> tamanho 5
    // vetor[1] = vetor[2]
    // tamanho -1
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posicao inválida!!");
        }
        for (int index = posicao; index <= this.tamanho - 1; index++) {
            this.elementos[index] = this.elementos[index + 1];
        }
        this.tamanho--;
    }

    public int tamanho() {
        return this.getTamanho();
    }

    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posicao inválida!!");
        }
        return this.elementos[posicao];
    }

    public int busca(Object elemento) {
        for (int i = 0; i < this.getTamanho(); i++) {
            if ((this.elementos[i].equals(elemento))) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }
}
