package com.loiane.Ex01;

public class ContaPoupanca extends ContaBancaria{
    private String diaRendimento;

    public ContaPoupanca(String nomeDoCliente, int numConta, float saldo, String diaRendimento) {
        super(nomeDoCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public String getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(String diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaDeRendimento){
        float aumentoDeSaldo = this.getSaldo() + (this.getSaldo() * taxaDeRendimento);
        this.setSaldo(aumentoDeSaldo);
        System.out.println(this.getSaldo());
    }

    @Override
    public String toString() {
        super.toString();
        return "ContaPoupanca{\n" + super.toString() +
                "\ndiaRendimento='" + diaRendimento + '\'' +
                '}';
    }
}
