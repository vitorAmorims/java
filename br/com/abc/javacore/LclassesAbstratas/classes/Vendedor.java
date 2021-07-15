package br.com.abc.javacore.LclassesAbstratas.classes;

public class Vendedor extends Funcionario{
    private double totalDeVendas;

    public Vendedor(String nome, Cargo cargo, double salario, double totalDeVendas) {
        super(nome, cargo, salario);
        this.totalDeVendas = totalDeVendas;
    }

    public double getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    @Override
    public void AumentoDeSalario() {
        this.salario = this.getSalario() + (this.getTotalDeVendas() * 0.05);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", cargo=" + cargo +
                ", numero do cargo=" + cargo.getTipo() +
                ", salario=" + salario +
                ", totalDeVendas=" + totalDeVendas +
                '}';
    }
}
