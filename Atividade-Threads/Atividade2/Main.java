package threads;

public class Main {
    public static void main(String[] args) {
        // Criar as threads para pares e ímpares
        Thread threadPares = new Thread(new Pares());
        Thread threadImpares = new Thread(new Impares());

        // Iniciar as threads
        threadPares.start();
        threadImpares.start();
    }
}
