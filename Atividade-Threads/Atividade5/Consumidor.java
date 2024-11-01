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
                fila.consumir();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
