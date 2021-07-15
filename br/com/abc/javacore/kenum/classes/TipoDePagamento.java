package br.com.abc.javacore.kenum.classes;

public enum TipoDePagamento {
    AVISTA(1, "A vista!!"),
    APRAZO(2, "A prazo");
    private int numeroTipoDePagamento;
    private String formaDePagamento;

    TipoDePagamento(int numeroTipoDePagamento, String formaDePagamento){
        this.numeroTipoDePagamento = numeroTipoDePagamento;
        this.formaDePagamento = formaDePagamento;
    }

    public int getNumeroTipoDePagamento() {
        return numeroTipoDePagamento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }
}
