package threads;
public class Produtor implements Runnable {
    private Fila fila;

    Produtor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        int item = 0;
        while (true) {
            try {
                fila.produzir(item++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
