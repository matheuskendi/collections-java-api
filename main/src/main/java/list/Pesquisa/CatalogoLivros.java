package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributo
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();

    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal ) {
        List<Livro> pesquisaPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if(l.getAnoPublicado() >= anoInicial && l.getAnoPublicado() <= anoFinal) {
                    pesquisaPorIntervaloAnos.add(l);
                }
            }
        }
        return pesquisaPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2024);

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2024));
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

    }
}

