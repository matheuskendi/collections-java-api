package main.java.map.Ordenacao;

import java.time.LocalDate;

public class Evento {
    //Atributos
    private String nome;

    private String atracao;

    public Evento(LocalDate data, String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
