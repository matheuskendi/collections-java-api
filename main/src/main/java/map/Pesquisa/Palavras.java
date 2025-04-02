package main.java.map.Pesquisa;

public class Palavras {
    //Atributos

    private String palavra;

    private int quantidade;

    public Palavras(String palavra, int quantidade) {
        this.palavra = palavra;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public String toString() {
        return "Palavras{" +
                "palavra='" + palavra + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
