package Ej_2;

import java.util.Random;

public class Productor implements Runnable {

    private final ColaTareas cola;

    public Productor(ColaTareas cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        int contador = 0;
        Random random = new Random();

        try {

            for (int i = 0; i < 10; i++) {



                cola.producir(contador++);

                System.out.println(
                        "[" + Thread.currentThread().getName()
                                + "] Produce: " + contador);

                Thread.sleep(500);
            }

            cola.productorFinalizado();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}