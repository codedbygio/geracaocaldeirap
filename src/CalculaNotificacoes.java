public static int calculaNotificacoes(int totalIteracoes) {
    int notificacoes = 0;
    for (int i = 1; i <= totalIteracoes; i++) {
        notificacoes += (i % 2 == 0) ? 2 : 1;
    }
    return notificacoes;
}

public static void main(String[] args) {
    int total = calculaNotificacoes(5);
    System.out.println("Total de notificações: " + total);
}
