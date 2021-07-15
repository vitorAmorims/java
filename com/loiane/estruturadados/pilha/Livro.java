package com.loiane.estruturadados.pilha;

public class Livro {
    private String nome;
    private int isbn;
    private int ano;
    private String autor;

    public Livro(String nome, int isbn, int ano, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.ano = ano;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", isbn=" + isbn +
                ", ano=" + ano +
                ", autor='" + autor + '\'' +
                '}';
    }
}
