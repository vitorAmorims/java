package br.com.abc.javacore.kenum.classes;

public class Cliente {
    private String nome;
    private TipoDeConta tipoCliente;
    private TipoDePagamento tipoDePagamento;
    private TipoDeMoeda tipoDeMoeda;

    public Cliente(String nome, TipoDeConta tipoCliente, TipoDePagamento tipoDePagamento, TipoDeMoeda tipoDeMoeda) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoDePagamento = tipoDePagamento;
        this.tipoDeMoeda = tipoDeMoeda;
    }

    public TipoDeMoeda getTipoDeMoeda() {
        return tipoDeMoeda;
    }

    public void setTipoDeMoeda(TipoDeMoeda tipoDeMoeda) {
        this.tipoDeMoeda = tipoDeMoeda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoDeConta getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoDeConta tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoDePagamento getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(TipoDePagamento tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "\nnome='" + nome + '\'' +
                "\n, tipo=" + tipoCliente.getNome() +
                "\n, numeroTipoDeCliente=" + tipoCliente.getTipoDeContaCliente() +
                "\n, pagamento=" + tipoDePagamento.getFormaDePagamento() +
                "\n, numeroTipoDePagamento=" + tipoDePagamento.getNumeroTipoDePagamento() +
                "\n, tipoDeMoeda=" + tipoDeMoeda.getNome() +
                "\n, numeroTipodeMoeda=" + tipoDeMoeda.getMoeda() +
                "\n, Situacao do dinheiro na conta=" + tipoDeMoeda.DinheiroNaConta() +
                '}';
    }
}
