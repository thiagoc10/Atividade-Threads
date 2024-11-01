public class Impares implements Runnable {
    recursocompartilhado recurso;
    int i = 1;  // Começa com o primeiro número ímpar
    Impares(recursocompartilhado recurso) {
        this.recurso = recurso;
    }

    @Override
public void run() {
try {
    while (i <= 19) {
        recurso.impar(i);
        i += 2;
            }
        }
catch (InterruptedException e) {
        }
    }
}
