import java.util.Random;

public class Ej_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Haciendo tareas");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Tarea " + i);
                    try {
                        Thread.sleep(rand.nextInt(1000,5000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Tareas finalizadas");
                System.out.println("hilo "+Thread.currentThread().getName()+" finalizado");
            }

        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
