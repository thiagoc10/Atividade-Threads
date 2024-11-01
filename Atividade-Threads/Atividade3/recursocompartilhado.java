public class recursocompartilhado {
    private boolean aux = true;  // Inicia com a vez dos ímpares

    public synchronized void par(int i) throws InterruptedException {
        while (aux) {
            wait();
        }
        System.out.println(i);
        aux = true;
        notify();
    }
    public synchronized void impar(int i) throws InterruptedException {
        while (!aux) {
            wait();
        }
        System.out.println(i);
        aux = false;
        notify();
    }
}
