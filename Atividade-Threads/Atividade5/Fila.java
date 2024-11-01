package threads;
import java.util.ArrayList;


public class Fila {
    private ArrayList<Integer> fila;
    private final int TAMANHO_MAXIMO = 10;
    Fila() {
        fila = new ArrayList<>();
    }

    public synchronized void produzir(int elemento) throws InterruptedException {
        while (fila.size() == TAMANHO_MAXIMO) {
            wait();
        }
        fila.add(elemento);
        System.out.println("Produzido: " + elemento);
        notifyAll();
    }

    public synchronized int consumir() throws InterruptedException {
        while (fila.isEmpty()) {
            wait();
        }
        int elemento = fila.remove(0);
        System.out.println("Consumido: " + elemento);
        notifyAll();
        return elemento;
    }

    public synchronized boolean estaVazio() {
        return fila.isEmpty();
    }

    public synchronized int tamanho() {
        return fila.size();
    }
}
