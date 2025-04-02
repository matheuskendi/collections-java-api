package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produtos> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long id, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(id, new Produtos(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produtos p : estoqueProdutosMap.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produtos obterProdutoMaisCaro(){
        Produtos produtoMaisCaro = null;
        double precoMaisCaro = Double.MIN_VALUE;
            if (!estoqueProdutosMap.isEmpty()){
                for (Produtos p : estoqueProdutosMap.values()){
                  if(p.getPreco() > precoMaisCaro){
                    produtoMaisCaro = p;
                    precoMaisCaro = p.getPreco(); //Atualiza o preço mais caro
                  }
                }
            }

        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();



        estoque.adicionarProduto(1L, "Produto A", 20, 25d);
        estoque.adicionarProduto(2L, "Produto B", 5, 15d);
        estoque.adicionarProduto(3L, "Produto C", 11, 10d);
        estoque.adicionarProduto(4L, "Produto D", 14, 30d);
        estoque.adicionarProduto(5L, "Produto E", 12, 22d);


        estoque.exibirProdutos();

        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println(estoque.obterProdutoMaisCaro());
    }

}
