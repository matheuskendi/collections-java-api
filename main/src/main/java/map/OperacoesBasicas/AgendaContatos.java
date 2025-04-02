package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);

        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Matheus", 96757390);
        agendaContatos.adicionarContato("Caio", 1111111111);
        agendaContatos.adicionarContato("Lucas", 1111112511);
        agendaContatos.adicionarContato("Maria", 1112341111);
        agendaContatos.adicionarContato("Julia", 1135411111);
        agendaContatos.adicionarContato("Luana", 1111145611);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Matheus");

        agendaContatos.exibirContatos();

        System.out.println("O numero é : " + agendaContatos.pesquisarPorNome("Caio"));

    }
}
