package Ej_1;

import java.util.Random;

public class Descargador implements Runnable {
    String nombre;
    GestorDescargas gestorDescargas;
    public Descargador(String nombre, GestorDescargas gestorDescargas) {
        this.nombre = nombre;
        this.gestorDescargas = gestorDescargas;
    }

    @Override
    public void run() {
        Random random = new Random();
        gestorDescargas.registrarDescarga(nombre);
        try {
            Thread.sleep(random.nextInt(500,1501));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (!Thread.currentThread().isInterrupted()) {
            System.out.println(Thread.currentThread().getName()+" finalizado");
        }
    }
}
