package com.loiane.Ex03;

public abstract class Animal {
    public String nome;
    public float comprimento;
    public int numeroDePatas;
    public String cor;
    public String ambiente;
    public float velocidadeMaxima;
    public String alimento;
    public String movimenta;
    public String som;

    public abstract String comer();
    public abstract String movimentar();
    public abstract String emitirSom();
}
