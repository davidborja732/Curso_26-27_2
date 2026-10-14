package Ej_5;


import java.util.Random;

public class Corredor implements Runnable {

    private Clasificacion clasificacion;

    public Corredor(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public void run() {

        Random random = new Random();

        int distancia = 0;

        while (distancia < 20) {

            int avance = random.nextInt(1, 4);

            distancia += avance;

            if (distancia > 20) {
                distancia = 20;
            }

            System.out.println(
                    "[" + Thread.currentThread().getName() + "] "
                            + "Ha avanzado " + avance
                            + " metros. Distancia: "
                            + distancia + "/20");

            try {
                Thread.sleep(random.nextInt(200, 601));
            } catch (InterruptedException e) {
                return;
            }
        }

        int puesto =
                clasificacion.registrarLlegada(
                        Thread.currentThread().getName());

        System.out.println(
                "[" + Thread.currentThread().getName()
                        + "] ¡Ha terminado! Posición: "
                        + puesto);
    }
}
