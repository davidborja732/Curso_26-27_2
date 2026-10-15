package Ej_3;

import java.util.Random;
/*
rea una clase llamada Cuenta que tenga un atributo privado:
private double saldo;
El constructor recibirá el saldo inicial.
La clase deberá disponer de:
• Un método getSaldo().
• Un método para ingresar dinero.
• Un método para retirar dinero.
Los métodos de ingreso y retirada deberán incluir un sleep() aleatorio de entre
100 y 500 ms para simular que las operaciones tardan un tiempo.
Cada operación deberá mostrar:
• Nombre del hilo.
• Tipo de operación.
• Cantidad.
• OperacionCuenta anterior.
• OperacionCuenta posterior.
Por ejemplo:
[Ingresador-1] Ingreso: 100 €
OperacionCuenta anterior: 500 €
OperacionCuenta posterior: 600 €
Crea una clase que implemente Runnable.
Cada objeto Runnable deberá realizar varias operaciones sobre la misma
cuenta.
Desde main:
1. Crea una cuenta con 1000 €.
2. Crea 5 hilos que compartan la misma cuenta.
3. Algunos hilos realizarán ingresos.
4. Otros realizarán retiradas.
5. Cada hilo deberá realizar 5 operaciones.
6. Asigna un nombre diferente a cada hilo.
7. Lanza todos los hilos.
8. Utiliza join() para esperar a que todos finalicen.
9. Muestra el saldo final.
Después realiza una segunda versión del programa utilizando synchronized
en los métodos que modifican el saldo.
Comprueba y explica qué diferencias existen entre ambas versiones.
 */
public class Ej_3_Main {


        public static void main(String[] args) {

            /*Cuenta cuenta = new Cuenta(1000);

            Thread t1 = new Thread(new OperacionCuenta(cuenta, true), "Ingresador-1");
            Thread t2 = new Thread(new OperacionCuenta(cuenta, true), "Ingresador-2");
            Thread t3 = new Thread(new OperacionCuenta(cuenta, false), "Retirador-1");
            Thread t4 = new Thread(new OperacionCuenta(cuenta, false), "Retirador-2");
            Thread t5 = new Thread(new OperacionCuenta(cuenta, true), "Ingresador-3");*/

            Cuenta_Sync cuenta = new Cuenta_Sync(1000);

            Thread t1 = new Thread(new OperacionCuenta(cuenta, true), "Ingresador-1");
            Thread t2 = new Thread(new OperacionCuenta(cuenta, true), "Ingresador-2");
            Thread t3 = new Thread(new OperacionCuenta(cuenta, false), "Retirador-1");
            Thread t4 = new Thread(new OperacionCuenta(cuenta, false), "Retirador-2");
            Thread t5 = new Thread(new OperacionCuenta(cuenta, true), "Ingresador-3");

            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();

            try {
                t1.join();
                t2.join();
                t3.join();
                t4.join();
                t5.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\nSaldo final: " + cuenta.getSaldo() + "€");
        }
}


