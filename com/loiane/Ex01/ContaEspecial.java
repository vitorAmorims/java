package com.loiane.Ex01;

public class ContaEspecial extends ContaBancaria{
    private float limite;

    public ContaEspecial(String nomeDoCliente, int numConta, float saldo, float limite) {
        super(nomeDoCliente, numConta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(float valor){
        double saldoComLimite = this.getSaldo() + this.getLimite();
        if ((saldoComLimite - valor) >= 0){
            this.setSaldo((this.getSaldo() - valor));
            System.out.println(this.getSaldo());
        } else {
            System.out.println("Sem saldo para saque!!");
        }
//
//        if (this.getSaldo() < retirar){
//            this.setSaldo(this.getSaldo() - retirar);
//            this.setLimite(100f);
//            this.setSaldo(this.getLimite() - 10); //10 reais pelo uso do limite
//            System.out.println("Houve necessidade de aumento no limite em 100 reais.");
//            System.out.println("Descontamos 10 reais pelo uso do limite");
//        }
//        this.setSaldo(this.getSaldo() - retirar);
//        System.out.println("Sacando: "+ retirar);
    }

    @Override
    public String toString() {
        super.toString();
        return "ContaEspecial{" + super.toString() +
                "limite=" + limite +
                '}';
    }
}
