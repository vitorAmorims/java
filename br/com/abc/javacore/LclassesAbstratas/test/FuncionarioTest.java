package br.com.abc.javacore.LclassesAbstratas.test;

import br.com.abc.javacore.LclassesAbstratas.classes.Cargo;
import br.com.abc.javacore.LclassesAbstratas.classes.Gerente;
import br.com.abc.javacore.LclassesAbstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Vitor", Cargo.GERENTE, 10000d);
        gerente.AumentoDeSalario();
        System.out.println(gerente);

        Vendedor vendedor = new Vendedor("Lucas", Cargo.VENDEDOR, 5000d, 10000d);
        vendedor.AumentoDeSalario();
        System.out.println(vendedor);
    }
}
