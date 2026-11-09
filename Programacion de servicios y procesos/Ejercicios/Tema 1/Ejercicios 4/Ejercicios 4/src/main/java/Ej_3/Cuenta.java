package Ej_3;

public class Cuenta {

    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {

        double saldoAnterior = saldo;

        try {
            Thread.sleep((int)(Math.random() * 401) + 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        saldo += cantidad;

        System.out.println("[" + Thread.currentThread().getName() + "] Ingreso: "
                + cantidad + "€");
        System.out.println("OperacionCuenta anterior: " + saldoAnterior + "€");
        System.out.println("OperacionCuenta posterior: " + saldo + "€");
    }

    public void retirar(double cantidad) {

        double saldoAnterior = saldo;

        try {
            Thread.sleep((int)(Math.random() * 401) + 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        saldo -= cantidad;

        System.out.println("[" + Thread.currentThread().getName() + "] Retirada: "
                + cantidad + "€");
        System.out.println("OperacionCuenta anterior: " + saldoAnterior + "€");
        System.out.println("OperacionCuenta posterior: " + saldo + "€");
    }
}
