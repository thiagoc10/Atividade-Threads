public class Main {
    public static void main(String[] args) {
        recursocompartilhado recurso = new recursocompartilhado();
        Thread threadPar = new Thread(new Pares(recurso));
        Thread threadImpar = new Thread(new Impares(recurso));
        threadPar.start();
        threadImpar.start();
    }
}
