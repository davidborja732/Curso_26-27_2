package Ejercicio_1;

import java.util.Random;

public class Main {
    static void main() {
        Random random=new Random();
        Lavadero lavadero=new Lavadero();
        lavadero.setNumero_puestos(random.nextInt(1,5));

        lavadero.Estadisticas_finales();
    }
}
