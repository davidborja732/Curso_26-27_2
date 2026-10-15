package Ej_2;

public class Consumidor implements Runnable {

    private final ColaTareas cola;

    public Consumidor(ColaTareas cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        try {
            while (true) {

                Integer numero = cola.consumir();

                if (numero == null) {
                    break;
                }

                System.out.println(
                            "[" + Thread.currentThread().getName()
                                    + "] Consume: " + numero);



                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}