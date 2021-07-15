package br.com.abc.javaLoiane.aulaassociacao.aula36.test;

import br.com.abc.javaLoiane.aulaassociacao.aula36.classes.Aluno;
import br.com.abc.javaLoiane.aulaassociacao.aula36.classes.Curso;
import br.com.abc.javaLoiane.aulaassociacao.aula36.classes.Professor;

import java.util.Scanner;

public class CursoTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        Professor professor = new Professor();
        System.out.println("Digite o nome do professor: ");
        professor.setNome(scanString.next());
        System.out.println("Digite o departamento do professor: ");
        professor.setDepartamento(scanString.next());
        System.out.println("Digite o email do professor: ");
        professor.setEmail(scanString.next());

        System.out.println("------------------------------------------");
        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com o nome do aluno: " + (i + 1));
            String nomeDoAluno = scan.nextLine();
            System.out.println("Entre com a matricula do aluno: ");
            String numeroDaMatricula = scan.nextLine();

            double[] notas = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.println("Entre com a nota: " + (j + 1));
                notas[j] = scanString.nextDouble();
            }
            Aluno aluno = new Aluno();
            aluno.setName(nomeDoAluno);
            aluno.setMatricula(numeroDaMatricula);
            aluno.setNotas(notas);
            alunos[i] = aluno;
        }

        Curso curso = new Curso("Orientacao a objetos", "08:00/12:00");
        curso.setAlunos(alunos);
        curso.setProfessor(professor);


        System.out.println(alunos[0].toString());
        System.out.println(professor.toString());
        System.out.println(curso.toString());
    }
}
