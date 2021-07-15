package com.loiane.Ex01;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Vitor", 10, 20000f, "01/07/2021");
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("Lucas", 1044, 30000f, "31/08/2021");
        ContaEspecial contaCorrente =  new ContaEspecial("Neusa", 111, 400000f, 100f);
//        System.out.println(contaPoupanca);
//        System.out.println(contaPoupanca1);
//        System.out.println(contaCorrente);
//        System.out.println(contaPoupanca);
//        contaPoupanca.sacar(1000f);
//        contaPoupanca.sacar(1000f);
//        contaPoupanca.sacar(1000f);
//        contaPoupanca.sacar(17001f);
//        contaPoupanca.depositar(5000f);
//        contaPoupanca.calcularNovoSaldo(0.1f);
        contaCorrente.sacar(400100f);
        System.out.println(contaCorrente);
    }
}
