package Pregunta_Examen_1;

import java.util.Random;

public class SimulacionLavadero {

    public static void main(String[] args) {

        Random random = new Random();

        int numPuestos = random.nextInt(4) + 2;
        int numCoches = random.nextInt(11) + 10;
        int tiempoBase = random.nextInt(2000) + 1000;

        System.out.println("=================================");
        System.out.println("SIMULACIÓN DE LAVADERO");
        System.out.println("=================================");
        System.out.println("Puestos abiertos: " + numPuestos);
        System.out.println("Coches participantes: " + numCoches);
        System.out.println("Tiempo base lavado: " + tiempoBase + " ms");
        System.out.println();

        Lavadero lavadero =
                new Lavadero(numPuestos, numCoches);

        Coche[] coches = new Coche[numCoches];

        for (int i = 0; i < numCoches; i++) {

            int tiempoLavado =
                    tiempoBase + random.nextInt(2000);

            coches[i] = new Coche(
                    "Coche-" + (i + 1),
                    lavadero,
                    tiempoLavado);

            coches[i].start();

            try {
                Thread.sleep(random.nextInt(700));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Coche coche : coches) {

            try {
                coche.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        lavadero.mostrarEstadisticas();
    }
}
