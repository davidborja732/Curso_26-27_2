package Ej_2;

import java.util.LinkedList;
import java.util.Queue;

public class ColaTareas {
    private final Queue<Integer> cola = new LinkedList<>();
    private final int capacidad = 3;

    private int productoresTerminados = 0;
    private final int totalProductores = 1;

    public synchronized void producir(int tarea)
            throws InterruptedException {

        while (cola.size() == capacidad) {
            wait();
        }

        cola.add(tarea);
        notifyAll();
    }


    public synchronized Integer consumir()
            throws InterruptedException {

        while (cola.isEmpty()) {
            if (productoresTerminados == totalProductores) {
                return null;
            }
            wait();
        }

        int numero = cola.poll();
        notifyAll();
        return numero;
    }

    public synchronized void productorFinalizado() {
        productoresTerminados++;
        notifyAll();
    }
}
