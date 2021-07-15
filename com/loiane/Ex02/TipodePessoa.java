package com.loiane.Ex02;

public enum TipodePessoa {
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica");
    private int numeroTipoDePessoa;
    private String nomeDoTipoDePessoa;
    TipodePessoa(int numeroTipoDePessoa, String nomeDoTipoDePessoa){
        this.nomeDoTipoDePessoa = nomeDoTipoDePessoa;
        this.numeroTipoDePessoa = numeroTipoDePessoa;
    }
}
