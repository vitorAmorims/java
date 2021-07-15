package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro car = new Carro ("Volkswagem", "Tiguan RS", 2020, 320f);
        System.out.println(car.toString());
    }
}
