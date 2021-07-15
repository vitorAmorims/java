package br.com.abc.javacore.Aintroducaoclasses.classes;

public class Estudante {
    public String nome;
    public int idade;
    public String matricula;

    public Estudante(String nome, int idade, String matricula) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setMatricula(matricula);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
