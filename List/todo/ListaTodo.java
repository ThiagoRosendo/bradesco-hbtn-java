import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    private List<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        if (!tarefas.stream().anyMatch(p -> p.getIdentificador() == tarefa.getIdentificador()) ) {
            tarefas.add(tarefa);
        } else {
            throw new IllegalArgumentException(
                String.format("Tarefa com identificador %d ja existente na lista", tarefa.getIdentificador()));
        }
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getIdentificador() == identificador) {
                tarefas.get(i).setEstahfeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getIdentificador() == identificador) {
                tarefas.get(i).setEstahfeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for (int i = 0; i < tarefas.size(); i++) {
            tarefas.get(i).setEstahfeita(false);
        }
    }

    public void fazerTodas() {
        for (int i = 0; i < tarefas.size(); i++) {
            tarefas.get(i).setEstahfeita(true);
        }
    }

    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.printf("[%s]  Id: %d - Descricao: %s\n", tarefa.getEstahFeita(), tarefa.getIdentificador(),
                    tarefa.getDescricao());
        }
    }

}
