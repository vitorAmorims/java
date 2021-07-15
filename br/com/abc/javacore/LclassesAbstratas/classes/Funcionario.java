package br.com.abc.javacore.LclassesAbstratas.classes;

public abstract class Funcionario {
    protected String nome;
    public Cargo cargo;
    protected double salario;
    public abstract void AumentoDeSalario();

    public Funcionario(String nome, Cargo cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
