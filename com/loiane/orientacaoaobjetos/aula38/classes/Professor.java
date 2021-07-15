package com.loiane.orientacaoaobjetos.aula38.classes;

public class Professor extends Pessoa {
    private double salario;
    private String especialidade;

    public Professor(String nome, String telefone, String cpf, double salario, String especialidade) {
        super(nome, telefone, cpf);
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        super.toString();
        return "Professor{" + super.toString() +
                "salario=" + salario +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
