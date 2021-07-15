package com.loiane.orientacaoaobjetos.aula38.test;

import com.loiane.orientacaoaobjetos.aula38.classes.Aluno;
import com.loiane.orientacaoaobjetos.aula38.classes.Endereco;
import com.loiane.orientacaoaobjetos.aula38.classes.Professor;

public class Aula38Test {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Vitor", "11 9984534034", "3021923912", "123");
        String[] cursos = {"nodeJs", "Java"};
        aluno.setCursos(cursos);
        double[] notas = {9.1, 9.4};
        aluno.setNotas(notas);
        Professor professor = new Professor("Salomao", "11 99823434", "23232323", 15000d, "Arquitetura de software");
        Endereco enderecoAluno = new Endereco("Alencar Araripe", "Sacoma", aluno);
        Endereco enderecoprof = new Endereco("Avenida Paulista", "Vila Mariana", professor);

        System.out.println(aluno.toString());
        System.out.println(professor.toString());
    }
}
