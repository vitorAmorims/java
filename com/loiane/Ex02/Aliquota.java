package com.loiane.Ex02;

public enum Aliquota {
    ZERO(0, 0), DEZ(0.1, 100), QUINZE(0.15, 270), VINTEECINCO(0.25, 500), TRINTA(0.30, 700);
    private double numeroAliquota;
    private int parcelaAReduzir;

    Aliquota(double numeroAliquota, int parcelaAReduzir){
        this.numeroAliquota = numeroAliquota;
        this.parcelaAReduzir = parcelaAReduzir;
    }

    public double getNumeroAliquota() {
        return numeroAliquota;
    }

    public int getParcelaAReduzir() {
        return parcelaAReduzir;
    }
}
