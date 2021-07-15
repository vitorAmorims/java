package com.loiane.Ex56EnumCalculadora;

public class Calculadora {
    public static void main(String[] args) {

        double x = 2.0;
        double y = 3.0;

//        for(Operacoes op: Operacoes.values()){
//            System.out.println(op.toString());
//        }
        for(Operacoes op: Operacoes.values()){
            System.out.print(x + " ");
            System.out.print(op.getOperador() + " ");
            System.out.print(y + " = ");
            System.out.println(op.executarOperacao(x,y));
        }
    }
}
