import java.util.*;

public class Tarefa implements Comparable<Tarefa> {
    String titulo;

    public Tarefa(String titulo) {
        this.titulo = titulo;
    }

    public int compareTo(Tarefa outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    public static void main(String[] args) {
        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(new Tarefa("Estudar"));
        tarefas.add(new Tarefa("Almoçar"));
        tarefas.add(new Tarefa("Dormir"));

        Collections.sort(tarefas);

        for (Tarefa t : tarefas) {
            System.out.println(t.titulo);
        }
    }
}
