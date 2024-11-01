package threads;

import java.util.Random;

public class Impares implements Runnable {
    public void run() {
        Random rand = new Random();
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Ímpar: " + i);
            try {
                Thread.sleep(rand.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Thread interrompida.");

            }
        }
    }
}
