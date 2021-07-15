package com.loiane.orientacaoaobjetos.aula38.classes;

public class Endereco {
    private String rua;
    private String bairro;
    private Pessoa pessoa;

    public Endereco(String rua, String bairro, Pessoa pessoa) {
        this.rua = rua;
        this.bairro = bairro;
        this.pessoa = pessoa;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
