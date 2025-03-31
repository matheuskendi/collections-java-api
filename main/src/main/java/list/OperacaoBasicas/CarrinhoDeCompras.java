package main.java.list.OperacaoBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItem;

    public CarrinhoDeCompras() {
        this.listaItem =  new ArrayList<>();

    }

    public void adicionarItem(String nome, double preco, int quantidade ) {
        listaItem.add(new Item(nome, preco, quantidade));
    }

    public CarrinhoDeCompras(List<Item> listaItem) {
        this.listaItem = listaItem;
    }

    public void removerItem(String nome){
        List<Item> listaItemRemover = new ArrayList<>();
        for (Item I : listaItem){
            if(I.getNome().equalsIgnoreCase(nome)){
                listaItemRemover.add(I);
            }
        }
        listaItem.removeAll(listaItemRemover);
    }

    public int obterQuantidade(){
        return listaItem.size();
    }

    public void obterDescricaoItens(){
        System.out.println(listaItem);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("Carrinho de compras tem " + carrinhoDeCompras.obterQuantidade() );

        carrinhoDeCompras.adicionarItem("Item 1", 15 , 5);
        carrinhoDeCompras.adicionarItem("Item 2", 23.5, 6);
        carrinhoDeCompras.adicionarItem("Item 3", 16.5, 7);
        carrinhoDeCompras.adicionarItem("Item 1",15 , 5   );
        System.out.println("O numero total de elementos na lista e: " + carrinhoDeCompras.obterQuantidade());

        carrinhoDeCompras.removerItem("Item 1");
        System.out.println("Itens atualizados com sucesso! " + carrinhoDeCompras.obterQuantidade());

        carrinhoDeCompras.obterDescricaoItens();
    }
}
