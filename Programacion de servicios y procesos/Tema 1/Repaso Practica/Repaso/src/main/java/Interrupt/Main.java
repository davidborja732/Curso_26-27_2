package Interrupt;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new CuentaAtras());
        t.start();
        try {
            Thread.sleep(7000);
            t.interrupt();
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
