class Usuarios {
    String nome;
    int idade;

    public Usuarios(String n, int i) {
        nome = n;
        idade = i;
    }
}

public class Cadastrousuario {
    public static void main(String[] args) {
        Usuarios u = new Usuarios("Giovanna", 22);
        System.out.println("Nome: " + u.nome);
        System.out.println("Idade: " + u.idade);
    }
}
