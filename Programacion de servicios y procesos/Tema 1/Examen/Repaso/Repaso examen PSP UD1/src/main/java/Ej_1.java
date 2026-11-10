public class Ej_1 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hola desde el hilo");
                Thread.sleep(1000); // 1 segundo
            }
        } catch (InterruptedException e) {
            System.out.println("El hilo fue interrumpido");
        }
    }
    public static void main(String[] args) {
        Thread hilo = new Thread(new Ej_1());
        hilo.start();
    }
}