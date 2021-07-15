package com.loiane.Ex03;

public class Tubarao extends Peixe{

    @Override
    public String comer() {
        return this.alimento;
    }

    @Override
    public String movimentar() {
        return this.movimenta;
    }

    @Override
    public String emitirSom() {
        return this.som;
    }

    @Override
    public String toString() {
        return "Tubarao{" +
                "nome='" + nome + '\'' +
                ", comprimento=" + comprimento +
                ", numeroDePatas=" + numeroDePatas +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", alimento='" + alimento + '\'' +
                ", movimenta='" + movimenta + '\'' +
                ", som='" + som + '\'' +
                '}';
    }
}
