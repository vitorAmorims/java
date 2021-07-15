package com.loiane.Ex02;

public class PessoaFisica extends Contribuinte {

    public PessoaFisica(TipodePessoa tipodePessoa, float rendaBruta) {
        if (tipodePessoa.equals((TipodePessoa.PESSOA_JURIDICA))) {
            System.out.println("Atenção, passar o tipo de conta correto!!");
            return;
        }
        this.rendaBruta = rendaBruta;
        this.tipodePessoa = tipodePessoa;
    }

    @Override
    public float calcularImposto() {
        float valorDoImposto;
        if (this.rendaBruta >= 0 && this.rendaBruta <= 1400) {
            return 0;
        } else if (this.rendaBruta > 1400 && this.rendaBruta <= 2100) {
            valorDoImposto = (float) (this.rendaBruta * Aliquota.DEZ.getNumeroAliquota());
            this.rendaBruta = this.rendaBruta + Aliquota.DEZ.getParcelaAReduzir();
            return valorDoImposto;
        } else if (this.rendaBruta > 2100 && this.rendaBruta <= 2800) {
            valorDoImposto = (float) (this.rendaBruta * Aliquota.QUINZE.getNumeroAliquota());
            this.rendaBruta = this.rendaBruta + Aliquota.QUINZE.getParcelaAReduzir();
            return valorDoImposto;
        } else if (this.rendaBruta > 2800 && this.rendaBruta <= 3600) {
            valorDoImposto = (float) (this.rendaBruta * Aliquota.VINTEECINCO.getNumeroAliquota());
            this.rendaBruta = this.rendaBruta + Aliquota.VINTEECINCO.getParcelaAReduzir();
            return valorDoImposto;
        } else {
            valorDoImposto = (float) (this.rendaBruta * Aliquota.TRINTA.getNumeroAliquota());
            this.rendaBruta = this.rendaBruta + Aliquota.TRINTA.getParcelaAReduzir();
            return valorDoImposto;
        }
    }
}