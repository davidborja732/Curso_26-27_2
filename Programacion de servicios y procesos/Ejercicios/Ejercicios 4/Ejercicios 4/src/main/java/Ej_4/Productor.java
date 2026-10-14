package Ej_4;

import java.util.Random;

public class Productor implements Runnable {

    private final ColaTrabajos cola;

    public Productor(ColaTrabajos cola) {
        this.cola = cola;
    }

    @Override
    public void run() {

        Random random = new Random();

        try {

            for (int i = 0; i < 10; i++) {

                int numero = random.nextInt(100);

                cola.producir(numero);

                System.out.println(
                        "[" + Thread.currentThread().getName()
                                + "] Produce: " + numero);

                Thread.sleep(500);
            }

            cola.productorFinalizado();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}