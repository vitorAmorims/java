package com.loiane.Ex02;

public abstract class Contribuinte {
    public TipodePessoa tipodePessoa;
    public float rendaBruta;

    public abstract float calcularImposto();
}
