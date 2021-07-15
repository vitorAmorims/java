package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Carro {
    private String name;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    public Carro(String name, double velocidadeMaxima) {
        this.name = name;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "name='" + name + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadeLimite=" + velocidadeLimite +
                '}';
    }
}
