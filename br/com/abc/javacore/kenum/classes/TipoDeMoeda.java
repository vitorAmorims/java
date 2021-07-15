package br.com.abc.javacore.kenum.classes;

public enum TipoDeMoeda {
    DINHEIRO(1, "Dinheiro"),
    CHEQUE(2, "Cheque") {
        public String DinheiroNaConta() {
            return "Verificar data para compensar";
        }
    },
    CARTAO(3, "Cartão") {
        public String DinheiroNaConta() {
            return "Dia + 1";
        }
    },
    BITCOIN(4, "Bitcoin");

    private int moeda;
    private String nome;

    TipoDeMoeda(int moeda, String nome) {
        this.moeda = moeda;
        this.nome = nome;
    }

    public int getMoeda() {
        return moeda;
    }

    public String getNome() {
        return nome;
    }

    public String DinheiroNaConta() {
        return "Mesmo Dia";
    }
}
