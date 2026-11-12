package pregunta_Examen_2;

import java.util.Random;

public class Restaurante {

    public static int TOTAL_PEDIDOS;

    private static int contadorPedidos = 1;

    public static synchronized int obtenerSiguientePedido() {

        if (contadorPedidos > TOTAL_PEDIDOS) {
            return -1;
        }

        return contadorPedidos++;
    }

    public static void main(String[] args) {

        Random random = new Random();

        TOTAL_PEDIDOS = random.nextInt(21) + 20;

        System.out.println("==============================");
        System.out.println("SIMULACIÓN RESTAURANTE");
        System.out.println("==============================");
        System.out.println("Pedidos totales: " + TOTAL_PEDIDOS);
        System.out.println("Cocineros: 3");
        System.out.println("Camareros: 2");
        System.out.println();

        ZonaRecogida zona = new ZonaRecogida();

        Thread c1 = new Thread(
                new Cocinero("Cocinero-1", zona));

        Thread c2 = new Thread(
                new Cocinero("Cocinero-2", zona));

        Thread c3 = new Thread(
                new Cocinero("Cocinero-3", zona));

        Thread camarero1 = new Thread(
                new Camarero("Camarero-1", zona));

        Thread camarero2 = new Thread(
                new Camarero("Camarero-2", zona));

        c1.start();
        c2.start();
        c3.start();

        camarero1.start();
        camarero2.start();

        try {
            c1.join();
            c2.join();
            c3.join();

            camarero1.join();
            camarero2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        zona.mostrarEstadisticas();
    }
}
