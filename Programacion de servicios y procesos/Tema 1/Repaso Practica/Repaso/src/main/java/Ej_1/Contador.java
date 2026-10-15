package Ej_1;

public class Contador implements Runnable {
    int contador = 0;
    @Override
    public void run() {
        for (int contador = 1; contador <= 5; contador++) {

            System.out.println(
                    Thread.currentThread().getName()
                            + ": " + contador);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
