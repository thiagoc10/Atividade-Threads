package threads;
public class Main {

    public static void main(String[] args) {
        Fila filaCompartilhada = new Fila();
        Thread produtor = new Thread(new Produtor(filaCompartilhada));
        Thread consumidor = new Thread(new Consumidor(filaCompartilhada));

        produtor.start();
        consumidor.start();
    }
}
