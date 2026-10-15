package Ej_2;

public class Main {
    static void main() {
        ColaTareas cola = new ColaTareas();

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
        System.out.println("Programa finalizado.");
    }
}
