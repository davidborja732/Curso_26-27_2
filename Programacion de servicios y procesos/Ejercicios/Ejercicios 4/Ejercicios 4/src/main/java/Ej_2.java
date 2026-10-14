public class Ej_2 {

    public static void main(String[] args) {

        int tiempoMax = 10;
        // int tiempoMax = Integer.parseInt(args[0]);

        String[] mensajes = {
                "Inicio del programa",
                "Procesos",
                "Servicios",
                "Multihilo",
                "Sincronización",
                "Fin del programa"
        };

        long inicio = System.currentTimeMillis();

        Thread hilo = new Thread(() -> {

            boolean interrumpido = false;

            for (int i = 0; i < mensajes.length; i++) {

                System.out.println("[" +
                        Thread.currentThread().getName()
                        + "] " + mensajes[i]);

                if (interrumpido) {
                    continue;
                }

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {

                    System.out.println("[" +
                            Thread.currentThread().getName()
                            + "] Interrumpido");

                    interrumpido = true;
                }
            }

        }, "Hilo-Secundario");

        hilo.start();

        for (int i = 0; i < tiempoMax && hilo.isAlive(); i++) {

            System.out.println("["
                    + Thread.currentThread().getName()
                    + "] Hilo principal esperando...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (hilo.isAlive()) {

            System.out.println("["
                    + Thread.currentThread().getName()
                    + "] Tiempo máximo agotado");

            hilo.interrupt();
        }

        try {
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long fin = System.currentTimeMillis();

        System.out.println("["
                + Thread.currentThread().getName()
                + "] Tiempo total: "
                + ((fin - inicio) / 1000.0)
                + " segundos");
    }
}