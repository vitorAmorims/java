package com.loiane.orientacaoaobjetos.aula37.classes;

public class Professor extends Pessoa{
    private double salario;
    private String especialidade;

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
