package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String , Palavras> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, int quantidade) {
        contagemMap.put(palavra, new Palavras(palavra, quantidade));
    }

    public void removerPalavra(String palavra){
        if(!contagemMap.isEmpty()){
            contagemMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemMap);
    }

    public Palavras encontrarPalavraMaisFrequente(){
        Palavras palavrasMaisUsada = null;
        int contagemMaisUsada = Integer.MIN_VALUE;

            if (!contagemMap.isEmpty()){
                for(Palavras p : contagemMap.values()){
                    if(p.getQuantidade() > contagemMaisUsada){
                        palavrasMaisUsada = p;
                        contagemMaisUsada = p.getQuantidade();
                    }
                }
            }
            return palavrasMaisUsada;
    }

    public static void main(String[] args) {
        ContagemPalavras palavras = new ContagemPalavras();

        palavras.adicionarPalavra("Palavra 1", 5);
        palavras.adicionarPalavra("Palavra 2", 2);
        palavras.adicionarPalavra("Palavra 3", 4);
        palavras.adicionarPalavra("Palavra 4", 10);

        palavras.exibirContagemPalavras();

        System.out.println(palavras.encontrarPalavraMaisFrequente());

        palavras.exibirContagemPalavras();

        palavras.removerPalavra("Palavra 1");

        palavras.exibirContagemPalavras();


    }
}
