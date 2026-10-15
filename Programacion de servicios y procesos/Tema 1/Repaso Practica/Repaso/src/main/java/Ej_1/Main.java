package Ej_1;

public class Main {
    static void main() {
        Thread t1 = new Thread(new Contador());
        Thread t2 = new Thread(new Contador());
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Programa finalizado");
    }
}
