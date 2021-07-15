package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(230);
        Carro car = new Carro("Tiguan RS", 290);
        Carro car1 = new Carro("Corolla", 278);
        Carro.setVelocidadeLimite(210);
        System.out.println(car.toString());
        System.out.println(car1.toString());

    }
}
