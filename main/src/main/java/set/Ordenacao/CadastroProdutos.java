package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Atributo
    public Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto( String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));

        }

    static class ComparatorPorPreco implements Comparator<Produto> {

        @Override
        public int compare(Produto p1, Produto p2) {
            return 0;
        }

    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

        return produtosPorNome;
    }

    public  Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>( new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto( "Produto 3",1L, 15d, 25);
        cadastroProdutos.adicionarProduto( "Produto 0",2L, 20d, 15);
        cadastroProdutos.adicionarProduto( "Produto 4",1L, 10d, 35);
        cadastroProdutos.adicionarProduto( "Produto 9",3L, 30d, 20);
        cadastroProdutos.adicionarProduto( "Produto 6",4L, 05d, 30);

        //System.out.println(cadastroProdutos.produtoSet);

        //System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}