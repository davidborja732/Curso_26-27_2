import java.util.Random;

public class Ej_2 {
    static void main() {
        Random rand = new Random();
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(rand.nextInt(1000,2000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };
        Thread t2 = new Thread() {
            public void run() {
                String[] lista = new String[]{"a", "b", "c","d","f","g","h","i","j","k"};
                for (int i = 0; i <= 9; i++) {
                    System.out.println(lista[i]);
                    try {
                        Thread.sleep(rand.nextInt(1000,2000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };
        t1.start();
        t2.start();
    }
}
