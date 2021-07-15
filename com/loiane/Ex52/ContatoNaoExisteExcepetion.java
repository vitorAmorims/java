package com.loiane.Ex52;

public class ContatoNaoExisteExcepetion extends Exception{
    private String nomeDeContato;

    public ContatoNaoExisteExcepetion(String nomeDeContato){
        this.nomeDeContato = nomeDeContato;
    }

    @Override
    public String getMessage(){
        return "Contato: " + this.nomeDeContato + " não existe na Agenda!";
    }
}
