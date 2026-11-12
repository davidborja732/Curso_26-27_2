package Notify_all;

public class Main {

    public static void main(String[] args)
            throws InterruptedException {

        Mensaje mensaje = new Mensaje();

        Thread h1 = new Thread(
                () -> mensaje.esperarMensaje(),
                "Hilo-1");

        Thread h2 = new Thread(
                () -> mensaje.esperarMensaje(),
                "Hilo-2");

        Thread h3 = new Thread(
                () -> mensaje.esperarMensaje(),
                "Hilo-3");

        h1.start();
        h2.start();
        h3.start();

        Thread.sleep(3000);

        mensaje.enviarMensaje();
    }
}