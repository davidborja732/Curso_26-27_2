package Pregunta_Examen_1;

public class Lavadero {

    private Puesto[] puestos;

    private int cochesAtendidos = 0;
    private int cochesTotales;
    private long tiempoTotalLavado = 0;

    public Lavadero(int numPuestos, int cochesTotales) {

        this.cochesTotales = cochesTotales;

        puestos = new Puesto[numPuestos];

        for (int i = 0; i < numPuestos; i++) {
            puestos[i] = new Puesto(i + 1);
        }
    }

    public void lavarCoche(String nombre, int tiempoLavado) {

        Puesto puestoLibre = null;

        synchronized (this) {

            try {

                while ((puestoLibre = buscarPuestoLibre()) == null) {

                    System.out.println(nombre
                            + " espera porque no hay puestos disponibles.");

                    wait();
                }

                puestoLibre.setOcupado(true);

                System.out.println(nombre
                        + " entra en el puesto "
                        + puestoLibre.getId());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(tiempoLavado);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {

            puestoLibre.setOcupado(false);

            cochesAtendidos++;
            tiempoTotalLavado += tiempoLavado;

            System.out.println(nombre
                    + " sale del puesto "
                    + puestoLibre.getId()
                    + " tras "
                    + tiempoLavado
                    + " ms.");

            notifyAll();
        }
    }

    private Puesto buscarPuestoLibre() {

        for (Puesto p : puestos) {
            if (!p.isOcupado()) {
                return p;
            }
        }

        return null;
    }

    public void mostrarEstadisticas() {

        System.out.println("\n==============");
        System.out.println("ESTADÍSTICAS");
        System.out.println("==============");

        System.out.println("Puestos disponibles: " + puestos.length);
        System.out.println("Coches simulados: " + cochesTotales);
        System.out.println("Coches atendidos: " + cochesAtendidos);

        if (cochesAtendidos > 0) {
            System.out.println(
                    "Tiempo medio de lavado: "
                            + (tiempoTotalLavado / cochesAtendidos)
                            + " ms");
        }
    }
}

