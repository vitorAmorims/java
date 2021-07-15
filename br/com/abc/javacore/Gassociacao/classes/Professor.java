package br.com.abc.javacore.Gassociacao.classes;

import java.util.Arrays;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminarios;
    }

    public void setSeminario(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void print(){
        if (seminarios != null){
            System.out.println("--------Relatório do professor------------");
            System.out.println("Nome do professor: " + this.getNome());
            System.out.println("Especialidade: "+ this.getEspecialidade());
            System.out.print("Seminários participantes: ");
            for(Seminario sem:seminarios){
                System.out.println(sem.getTitulo()+ " ");
            }
        } else {
            System.out.println("--------Relatório do professor------------");
            System.out.println("Por favor inserir ao menos um seminário!");
        }

    }

}
