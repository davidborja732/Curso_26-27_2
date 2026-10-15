package Ej_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<String> Clasificacion=new ArrayList<>();
        Coche coche = new Coche("Fiat");
        Coche coche2 = new Coche("Seat");
        Coche coche3 = new Coche("MG");
        Thread t1=new Thread(new Acciones(coche,Clasificacion));
        Thread t2=new Thread(new Acciones(coche2,Clasificacion));
        Thread t3=new Thread(new Acciones(coche3,Clasificacion));
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Carrera finalizada");
        int contador=0;
        for (String texto:Clasificacion){
            contador++;
            System.out.println(contador+"-"+texto);
        }
    }
}
