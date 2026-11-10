import java.util.Random;

public class Ej_3 {
    static void main() {
        Random rand = new Random();
        Thread cocina = new Thread() {
            public void run() {
                System.out.println("Iniciando cocina...");
                try {
                    Thread.sleep(rand.nextInt(1000,3500));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Finalizando cocina...");
            }
        };
        Thread limpieza = new Thread() {
            public void run() {
                System.out.println("Iniciando limpieza...");
                try {
                    Thread.sleep(rand.nextInt(1000,3500));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Finalizando limpieza...");

            }
        };
        Thread tarea = new Thread() {
            public void run() {
                System.out.println("Iniciando tarea...");
                try {
                    Thread.sleep(rand.nextInt(1000,3500));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Finalizando tarea...");
            }
        };
        cocina.start();
        limpieza.start();
        tarea.start();
    }
}
