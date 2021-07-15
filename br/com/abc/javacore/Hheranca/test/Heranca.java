package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class Heranca {
    public static void main(String[] args) {
        Pessoa person = new Pessoa("Vitor", 39);
        Endereco address = new Endereco("Rua Alencar Araripe", "Sacomã");
        Funcionario employee = new Funcionario("Vitor", 39, 15000d, "12345");

        person.setEndereco(address);
        employee.setEndereco(address);

        System.out.println(person.toString());
        System.out.println(employee.toString());
    }

}
