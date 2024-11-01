package threads;

public class Contador {
    int valor = 0;
    public synchronized void incrementar() {
        valor++;
    }
}
