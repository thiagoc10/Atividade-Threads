package threads;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new Incrementador(contador), "Thread " + (i + 1));
            threads[i].start();
        }
        for (int i = 0; i < 5; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Valor final do contador: " + contador.valor);
    }
}


