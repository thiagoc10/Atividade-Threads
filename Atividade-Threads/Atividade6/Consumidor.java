package threads;
public class Consumidor implements Runnable {
    private Fila fila;

    Consumidor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int i = fila.consumir();
                System.out.println("Consumido: " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
