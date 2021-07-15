package com.loiane.orientacaoaobjetos.aula37.test;

import com.loiane.orientacaoaobjetos.aula37.classes.Aluno;
import com.loiane.orientacaoaobjetos.aula37.classes.Endereco;
import com.loiane.orientacaoaobjetos.aula37.classes.Pessoa;
import com.loiane.orientacaoaobjetos.aula37.classes.Professor;

public class aula37Test {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jubileu");
        pessoa.setCpf("30000000000023");
        pessoa.setTelefone("11 998569799");
//        System.out.println(pessoa.toString());
        Aluno aluno = new Aluno();
        aluno.setNome("Vitor");
        aluno.setCpf("30214591834");
        aluno.setTelefone("11 998564832");
        aluno.setMatricula("1234");
        String[] cursos = new String[4];
        double[] notas = {8.5d, 8, 8, 8};
        cursos[0] = "Nodejs";
        cursos[1] = "mysql";
        cursos[2] = "mongoDB";
        cursos[3] = "JAVA";
        aluno.setCursos(cursos);
        aluno.setNotas(notas);
//        System.out.println(aluno.toString());
        Endereco endereco = new Endereco();
        endereco.setRua("Alencar");
        endereco.setBairro("Sacomã");
        endereco.setPessoa(aluno);
//        System.out.println(endereco.toString());
        Professor professor = new Professor();
        professor.setNome("Salomao");
        professor.setCpf("30222222210");
        professor.setTelefone("11 80279050");
        professor.setEspecialidade("Arquitetura de software");
        professor.setSalario(15000d);
        Endereco endprof = new Endereco();
        endprof.setPessoa(professor);
        endprof.setRua("Alencar de araripe");
        endprof.setBairro("Sacoma");
        System.out.println(endprof.toString());
    }
}
