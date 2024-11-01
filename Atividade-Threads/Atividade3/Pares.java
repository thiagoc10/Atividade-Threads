public class Pares implements Runnable {
    recursocompartilhado recurso;
    int i = 2;  // Começa com o primeiro número par
    Pares(recursocompartilhado recurso) {
    this.recurso = recurso;
    }

    @Override
    public void run() {
try {
    while (i <= 20) {
        recurso.par(i);
        i += 2;
            }
        } catch (InterruptedException e) {

        }
    }
}
