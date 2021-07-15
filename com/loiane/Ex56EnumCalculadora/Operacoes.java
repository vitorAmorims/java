package com.loiane.Ex56EnumCalculadora;

public enum Operacoes {
    ADICAO("+"){
        @Override
        public double executarOperacao(double x, double y){
            return x + y;
        }
    }, SUBTRACAO("-"){
        @Override
        public double executarOperacao(double x, double y){
            return x - y;
        }
    }, DIVISAO("/"){
        @Override
        public double executarOperacao(double x, double y){
            return x / y;
        }
    }, MULTIPLICACAO("*"){
        @Override
        public double executarOperacao(double x, double y){
            return x * y;
        }
    };

    private String operador;

    Operacoes(String operador) {
        this.operador = operador;
    }

    public String getOperador() {
        return operador;
    }

    @Override
    public String toString() {
        return this.getOperador();
    }

    public abstract double executarOperacao(double x, double y);
}
