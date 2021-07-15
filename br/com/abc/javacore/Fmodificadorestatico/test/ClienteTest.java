package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        Cliente cli3 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas");
        System.out.print(Cliente.getParcelas().length);
    }
}
