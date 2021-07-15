package com.loiane.Ex03;

public class Urso extends Mamifero{

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
    public boolean equals(Object obj) {
        if (getClass() == obj.getClass()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Urso{" +
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
