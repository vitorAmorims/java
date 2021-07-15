package com.loiane.Ex01;

public class ContaBancaria {
    private String nomeDoCliente;
    private int numConta;
    private float saldo;

    public ContaBancaria(String nomeDoCliente, int numConta, float saldo) {
        this.nomeDoCliente = nomeDoCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacar(float retirar){
        if ((this.saldo - retirar) < 0){
            System.out.println("Operacao não podera ser realizada!!");
        } else {
            this.saldo = this.saldo - retirar;
        }
        System.out.println("saldo atual: " + this.getSaldo());
    }
    public void depositar(float valor){
        this.saldo = this.saldo + valor;
        System.out.println("Deposito realizado de: "+ valor);
        System.out.println(this.getSaldo());
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeDoCliente='" + nomeDoCliente + '\'' +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
