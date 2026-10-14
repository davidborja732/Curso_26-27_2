package Ej_5;

import java.util.ArrayList;
import java.util.List;

public class Clasificacion {

    private int posicion = 1;
    private List<String> podio = new ArrayList<>();

    public synchronized int registrarLlegada(String corredor) {

        int puesto = posicion;

        podio.add(puesto + "º - " + corredor);

        posicion++;

        return puesto;
    }

    public void mostrarClasificacion() {

        System.out.println("\nCLASIFICACIÓN FINAL");

        for (String corredor : podio) {
            System.out.println(corredor);
        }
    }
}
