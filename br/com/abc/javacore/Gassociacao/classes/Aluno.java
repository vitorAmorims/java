package br.com.abc.javacore.Gassociacao.classes;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        if (seminario != null){
            return "Aluno{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", seminario=" + seminario.getTitulo().toString() +
                    '}';
        } else {
            return "Aluno{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", seminario = Ainda não cadastrado em nenhum seminario" +
                    '}';
        }

    }
}
