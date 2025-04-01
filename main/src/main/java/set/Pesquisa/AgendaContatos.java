package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributo

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void addicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatosSet) {
            if(c.getNome().equals(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.addicionarContato("Matheus", 123456);
        agendaContatos.addicionarContato("Matheus", 505634);
        agendaContatos.addicionarContato("Jorge", 152144);
        agendaContatos.addicionarContato("Maria", 484561);
        agendaContatos.addicionarContato("Luana", 478465);
        agendaContatos.addicionarContato("João", 746843);
        agendaContatos.addicionarContato("Leticia", 484654);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Matheus"));

        System.out.println("Contato Atualizado : " + agendaContatos.atualizarNumeroContato("Luana", 555566));
    }
}
