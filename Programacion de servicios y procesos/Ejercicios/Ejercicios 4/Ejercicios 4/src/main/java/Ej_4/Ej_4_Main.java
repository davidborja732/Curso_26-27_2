package Ej_4;

public class Ej_4_Main {

    public static void main(String[] args) {

        ColaTrabajos cola = new ColaTrabajos();

        Thread p1 = new Thread(
                new Productor(cola),
                "Productor-1");



        Thread c1 = new Thread(
                new Consumidor(cola),
                "Consumidor-1");

        Thread c2 = new Thread(
                new Consumidor(cola),
                "Consumidor-2");

        p1.start();

        c1.start();
        c2.start();

        try {

            p1.join();


            c1.join();
            c2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nPrograma finalizado.");
    }
}