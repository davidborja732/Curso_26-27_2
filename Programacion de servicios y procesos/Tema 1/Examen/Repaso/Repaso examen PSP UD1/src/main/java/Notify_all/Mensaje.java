package Notify_all;

public class Mensaje {

    private boolean disponible = false;

    public synchronized void esperarMensaje() {

        while (!disponible) {
            try {
                System.out.println(
                        Thread.currentThread().getName()
                                + " esperando..."
                );

                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(
                Thread.currentThread().getName()
                        + " ha sido despertado"
        );
    }

    public synchronized void enviarMensaje() {

        disponible = true;

        System.out.println("Mensaje disponible");

        notifyAll();
    }
}
