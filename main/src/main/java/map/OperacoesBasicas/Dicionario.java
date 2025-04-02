package main.java.map.OperacoesBasicas;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra,definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicaoPorNome = null;
        if(!dicionarioMap.isEmpty()){
            definicaoPorNome = dicionarioMap.get(palavra);
        }
        return definicaoPorNome;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Palavra 1","Definicao 1");
        dicionario.adicionarPalavra("Palavra 2","Definicao 2");
        dicionario.adicionarPalavra("Palavra 3","Definicao 3");
        dicionario.adicionarPalavra("Palavra 4","Definicao 4");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Palavra 3");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Palavra 4"));
    }
}
