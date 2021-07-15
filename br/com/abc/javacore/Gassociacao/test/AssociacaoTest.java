package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.Aluno;
import br.com.abc.javacore.Gassociacao.classes.Local;
import br.com.abc.javacore.Gassociacao.classes.Professor;
import br.com.abc.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Vitor", 39);
        Aluno aluno2 = new Aluno("Neusa", 63);

        Professor professor = new Professor("Lucas", "Arquitetura de software");
        Seminario seminario = new Seminario("Como ser um baita programador e ficar rico");
        Local local = new Local("Rua Alencar Araripe", "Sacomã");

        //associacoes
        aluno.setSeminario(seminario);
        System.out.println(aluno.toString());
        aluno2.setSeminario(seminario);
        System.out.println(aluno2.toString());

        seminario.setAlunos(new Aluno[]{aluno, aluno2});
        seminario.setProfessor(professor);
        seminario.setLocal(local);


        Seminario[] seminarioArray = new Seminario[1];
        seminarioArray[0] = seminario;
        professor.setSeminario(seminarioArray);

        professor.print();
        seminario.print();
    }
}

