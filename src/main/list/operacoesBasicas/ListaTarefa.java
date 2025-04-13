package main.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefas;

    public ListaTarefa() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionaTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> listaARemover = new ArrayList<>();
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                listaARemover.add(tarefa);
            }
        }
        listaTarefas.removeAll(listaARemover);
    }

    public Integer obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricaoTarefa(){
        for (Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa.getDescricao());
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
       listaTarefa.adicionaTarefa("descricao");
       listaTarefa.adicionaTarefa("descricao 2");
       listaTarefa.adicionaTarefa("descricao 2");
       listaTarefa.adicionaTarefa("descricao 3");
       listaTarefa.adicionaTarefa("descricao 4");

       listaTarefa.obterDescricaoTarefa();
        System.out.println("------");
        listaTarefa.removerTarefa("descricao 2");
        listaTarefa.obterDescricaoTarefa();


    }
}
