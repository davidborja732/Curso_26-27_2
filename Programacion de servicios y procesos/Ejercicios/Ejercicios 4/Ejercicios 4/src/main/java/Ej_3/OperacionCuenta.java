package Ej_3;

import java.util.Random;

public class OperacionCuenta implements Runnable {

    private Cuenta cuenta;
    private boolean ingreso;

    public OperacionCuenta(Cuenta cuenta, boolean ingreso) {
        this.cuenta = cuenta;
        this.ingreso = ingreso;
    }

    @Override
    public void run() {

        Random random = new Random();

        for(int i = 0; i < 5; i++) {

            double cantidad = random.nextInt(100) + 1;

            if(ingreso) {
                cuenta.ingresar(cantidad);
            } else {
                cuenta.retirar(cantidad);
            }
        }
    }
}