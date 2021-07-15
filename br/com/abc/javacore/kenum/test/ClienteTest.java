package br.com.abc.javacore.kenum.test;

import br.com.abc.javacore.kenum.classes.Cliente;
import br.com.abc.javacore.kenum.classes.TipoDeConta;
import br.com.abc.javacore.kenum.classes.TipoDeMoeda;
import br.com.abc.javacore.kenum.classes.TipoDePagamento;

public class ClienteTest {
    public static void main(String[] args) {
//        Cliente cliente = new Cliente("Vitor", 2);
//        System.out.println(cliente.toString());

//        hipotese - criar um cliente com um tipo que não existe
//        Cliente cliente1 = new Cliente("Vitor", 3);
//        System.out.println(cliente1.toString());
//        Cliente{nome='Vitor', tipo=Pessoa Juridica

        // com enum, estabelecemos 100% de coesão ao criar objeto cliente
//        Cliente cliente2 = new Cliente("Vitor", TipoDeConta.PESSOA_JURIDICA);
//        System.out.println(cliente2.toString());

        // imagine que você precisa passar o número inteiro relacionado a conta para o BD
        // e agora??

        Cliente cliente2 = new Cliente("Vitor", TipoDeConta.PESSOA_JURIDICA, TipoDePagamento.AVISTA, TipoDeMoeda.DINHEIRO);
        System.out.println(cliente2.toString());
    }
}
