package Ej_5;

public class Ej_5_Main {

    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();

        Clasificacion clasificacion = new Clasificacion();

        Thread c1 = new Thread(
                new Corredor(clasificacion),
                "Corredor-1");

        Thread c2 = new Thread(
                new Corredor(clasificacion),
                "Corredor-2");

        Thread c3 = new Thread(
                new Corredor(clasificacion),
                "Corredor-3");

        Thread c4 = new Thread(
                new Corredor(clasificacion),
                "Corredor-4");

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        try {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clasificacion.mostrarClasificacion();

        long fin = System.currentTimeMillis();

        System.out.println(
                "\nTiempo total: "
                        + ((fin - inicio) / 1000.0)
                        + " segundos");
    }
}