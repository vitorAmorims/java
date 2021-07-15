package com.loiane.Ex02;

public class PessoaJuridica extends Contribuinte{

    public PessoaJuridica(TipodePessoa tipodePessoa, float rendaBruta) {
        if (tipodePessoa.equals((TipodePessoa.PESSOA_FISICA))){
            System.out.println("Atenção, passar o tipo de conta correto!!");
            return;
        }
        this.tipodePessoa = tipodePessoa;
        this.rendaBruta = rendaBruta;
    }

    @Override
    public float calcularImposto() {
        float imposto = (float) (this.rendaBruta * 0.1);
        return imposto;
    }

    @Override
    public String toString() {
        return "{" +
                "tipodePessoa=" + tipodePessoa +
                ", rendaBruta=" + rendaBruta +
                ", Imposto=" + calcularImposto() +
                '}';
    }
}
