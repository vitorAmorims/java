package com.loiane.Ex52;

public class AgendaCheiaException extends Exception{

    @Override
    public String getMessage(){
        return "Agenda está cheia, impossivel adicionar o contato!!";
    }
}
