package Ej_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Acciones implements Runnable{
    List<String> Clasificacion = new ArrayList<>();
    Coche coche;
    public Acciones (Coche coche,List<String> Clasificacion) {
        this.coche = coche;
        this.Clasificacion = Clasificacion;
    }
    Random random = new Random();
    @Override
    public void run() {
        while (coche.getDistancia()<100) {
            int distancarecorrida=random.nextInt(1,11);
            coche.setDistancia(coche.getDistancia()+distancarecorrida);
            if (coche.getDistancia()>100){
                coche.setDistancia(100);
            }
            System.out.println(coche.getNombre()+" avanza "+distancarecorrida+" lleva "+coche.getDistancia()+"/100");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        Clasificacion.add(coche.getNombre());
        System.out.println(coche.getNombre()+" ha terminado la carrera");
    }
}
