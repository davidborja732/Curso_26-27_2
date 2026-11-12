package Pregunta_Examen_1;

public class Coche extends Thread {

    private Lavadero lavadero;
    private int tiempoLavado;

    public Coche(String nombre,
                 Lavadero lavadero,
                 int tiempoLavado) {

        super(nombre);

        this.lavadero = lavadero;
        this.tiempoLavado = tiempoLavado;
    }

    @Override
    public void run() {

        System.out.println(getName()
                + " llega al lavadero.");

        lavadero.lavarCoche(
                getName(),
                tiempoLavado);
    }
}
