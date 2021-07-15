package br.com.abc.javacore.kenum.classes;

public enum TipoDeConta {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa juridica");

    private int tipoDeContaCliente;
    private String nome;

    TipoDeConta(int tipoDeContaCliente, String nome) {
        this.tipoDeContaCliente = tipoDeContaCliente;
        this.nome = nome;
    }

    public int getTipoDeContaCliente() {
        return tipoDeContaCliente;
    }

    public String getNome() {
        return nome;
    }
}
