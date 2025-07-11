class Livro {
    String titulo;
    boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public String status() {
        if (emprestado) {
            return "Indisponível";
        } else {
            return "Disponível";
        }
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.titulo = "Java para Iniciantes";
        System.out.println(l.status());  // Deve imprimir "Disponível"
        l.emprestar();
        System.out.println(l.status());  // Deve imprimir "Indisponível"
    }
}
