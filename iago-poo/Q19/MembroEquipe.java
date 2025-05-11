package Q19;

import java.util.ArrayList;

public class MembroEquipe {
    private String nome;
    private Papel papel;
    private ArrayList<Tarefa> tarefas;

    public MembroEquipe(String nome, Papel papel) {
        this.nome = nome;
        this.papel = papel;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public String listarTarefas() {
        if (tarefas.isEmpty()) return nome + " não possui tarefas.";
        StringBuilder sb = new StringBuilder(nome + " - " + papel.executarPapel() + "\nTarefas:\n");
        for (Tarefa t : tarefas) {
            sb.append("- ").append(t.realizarTarefa()).append("\n");
        }
        return sb.toString();
    }
}
