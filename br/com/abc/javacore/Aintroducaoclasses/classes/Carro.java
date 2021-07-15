package br.com.abc.javacore.Aintroducaoclasses.classes;

public class Carro {
    public String marca;
    public String nome;
    public int ano;
    public float velocidadeMaxima;

    public Carro(String marca, String nome, int ano, float velocidadeMaxima) {
        this.marca = marca;
        this.nome = nome;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        if (velocidadeMaxima > 300) {
            this.velocidadeMaxima = velocidadeMaxima;
            System.out.println("Absurdo!!");
        }
    }
}
