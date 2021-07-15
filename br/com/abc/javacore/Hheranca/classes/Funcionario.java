package br.com.abc.javacore.Hheranca.classes;

public class Funcionario extends Pessoa {
    private double salario;
    private String matricula;

    public Funcionario(String nome, int idade, double salario, String matricula) {
        super(nome, idade);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void imprime() {
        System.out.println("Nome do funcionário: " + this.getNome());
        System.out.println("Idade..............: " + this.getIdade());
        System.out.println("Matricula..........: " + this.getMatricula());
        System.out.println("Salario............: " + this.getSalario());
        System.out.println("Endereco...........: " + this.getEndereco().getRua() + ", Bairro: " + this.getEndereco().getBairro());
    }

    @Override
    public String toString() {
        super.toString();
        return "Funcionario{" + super.toString() +
                ", salario=" + salario +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
