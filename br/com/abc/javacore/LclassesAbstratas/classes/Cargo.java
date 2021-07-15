package br.com.abc.javacore.LclassesAbstratas.classes;

public enum Cargo {
    GERENTE(1, "Gerente"), VENDEDOR(2, "Vendedor"), ATENDENTE(3, "Atendente");
    private int tipo;
    private String funcao;

    Cargo(int tipo, String funcao) {
        this.tipo = tipo;
        this.funcao = funcao;
    }

    public int getTipo() {
        return tipo;
    }

    public String getFuncao() {
        return funcao;
    }
}
