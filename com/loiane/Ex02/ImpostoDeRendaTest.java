package com.loiane.Ex02;

public class ImpostoDeRendaTest {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica(TipodePessoa.PESSOA_FISICA, 1500f);
        PessoaJuridica pessoaJuridica = new PessoaJuridica(TipodePessoa.PESSOA_JURIDICA, 1400f);
        System.out.println(pessoaFisica.calcularImposto());

    }
}
