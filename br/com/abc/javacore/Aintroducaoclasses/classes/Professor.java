package br.com.abc.javacore.Aintroducaoclasses.classes;

public class Professor {
    public String nome;
    public double salario;
    public int idade;
    public String matricula;

    public Professor(String nome, double salario, int idade, String matricula){
        this.setNome(nome);
        this.setIdade(idade);
        this.setMatricula(matricula);
        this.setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
