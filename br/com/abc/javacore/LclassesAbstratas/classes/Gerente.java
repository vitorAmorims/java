package br.com.abc.javacore.LclassesAbstratas.classes;

public class Gerente extends Funcionario {
    public Gerente(String nome, Cargo cargo, double salario) {
        super(nome, cargo, salario);
        if (salario > 6000){
            this.salario = 6000d;
        }
    }

    @Override
    public void AumentoDeSalario() {
        this.salario = this.getSalario() + (this.getSalario() * 0.2);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", cargo=" + cargo +
                ", NumeroDoCargo=" + cargo.getTipo() +
                ", salario=" + salario +
                '}';
    }
}
