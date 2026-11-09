package Ej_4;

import java.util.LinkedList;
import java.util.Queue;

public class ColaTrabajos {

    private final Queue<Integer> cola = new LinkedList<>();
    private final int capacidad = 5;

    private int productoresTerminados = 0;
    private final int totalProductores = 2;

    public synchronized void producir(int numero)
            throws InterruptedException {

        while (cola.size() == capacidad) {
            wait();
        }

        cola.add(numero);

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