package com.loiane.Ex03;

public class TesteEx03 {
    public static void main(String[] args) {
        Tubarao tubarao = new Tubarao();
        tubarao.nome = "Branco";
        tubarao.numeroDePatas = 0;
        tubarao.comprimento = 300f;
        tubarao.velocidadeMaxima = 10f;
        tubarao.ambiente = "mar";
        tubarao.cor = "Cinza e Branco";
        tubarao.alimento = "Peixes";
        tubarao.movimenta = "Nadando";
        tubarao.som = "Não emiti som";
//        System.out.println(tubarao);

        Urso urso = new Urso();
        urso.nome = "Zé Colmeia";
        urso.numeroDePatas = 4;
        urso.comprimento = 200f;
        urso.velocidadeMaxima = 5f;
        urso.ambiente = "Floresta";
        urso.cor = "Cinza escuro";
        urso.alimento = "mel";
        urso.movimenta = "andando ou correndo";
        urso.som = "som de urso";
//        System.out.println(urso);
        Urso urso2 = new Urso();
        urso2.nome = "Polar";
        urso2.numeroDePatas = 4;
        urso2.comprimento = 250f;
        urso2.velocidadeMaxima = 3f;
        urso2.ambiente = "Geleiras";
        urso2.cor = "Branco";
        urso2.alimento = "Peixes";
        urso2.movimenta = "andando ou correndo";
        urso2.som = "som de urso";
        System.out.println(urso2);

        System.out.println(urso.equals(tubarao)); //false
        System.out.println(urso.equals(urso2)); //true





    }
}
