package com.loiane.estruturadados.fila;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<Paciente> filaComPrioridade = new PriorityQueue<>(
                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente p1, Paciente p2) {
                        if (p1.getPrioridade() > p2.getPrioridade()){
                            if (p1.getIdade() < p2.getIdade())
                            return 1;
                        } else if(p1.getPrioridade() < p2.getPrioridade()){
                            if (p1.getIdade() < p2.getIdade())
                            return -1;
                        }
                        return 0;
                    }
                }
        );
        filaComPrioridade.add(new Paciente("Neusa", 2, 38));
        filaComPrioridade.add(new Paciente("Vitor", 2, 39));
        filaComPrioridade.add(new Paciente("Lucas", 1, 17));
        filaComPrioridade.add(new Paciente("Silvia", 3, 33));
        System.out.println(filaComPrioridade);
    }

}
