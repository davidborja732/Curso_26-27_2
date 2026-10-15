package Interrupt;

public class CuentaAtras implements Runnable{
    public CuentaAtras(){
    }
    @Override
    public void run() {
        for (int i = 20; i > 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido en 7 segundos");
                return;
            }
        }
    }
}
