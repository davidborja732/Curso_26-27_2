/*
Crea un programa Java que trabaje con 3 hilos.
El hilo principal deberá crear y lanzar dos hilos:
El primer hilo deberá escribir por consola la palabra "Hola" 10 veces,
esperando 1 segundo entre cada escritura.
El segundo hilo deberá escribir por consola la palabra "DAM" 10 veces,
esperando 1 segundo entre cada escritura.
El hilo principal deberá lanzar primero el hilo que escribe "Hola" y, después de
50 ms, lanzar el hilo que escribe "DAM".
Cada mensaje deberá aparecer acompañado del nombre del hilo que lo ha
generado.
Por ejemplo:
Hilo-Hola: Hola
Hilo-DAM: DAM
Hilo-Hola: Hola
Hilo-DAM: DAM
Una vez lanzados los dos hilos, el hilo principal deberá esperar a que ambos
finalicen utilizando join().
Después de 5 segundos desde el comienzo de la ejecución de los dos hilos,
el hilo principal deberá interrumpir ambos hilos.
Cuando un hilo reciba la interrupción deberá:
• Mostrar un mensaje indicando que ha sido interrumpido.
• Finalizar su ejecución.
Finalmente, el hilo principal deberá mostrar:
Programa finalizado
 */
public class Ej_1 {

    public static void main(String[] args) {

        Thread hiloHola = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": Hola");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()
                        + ": He sido interrumpido");
            }
        }, "Hilo-Hola");

        Thread hiloDAM = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": DAM");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()
                        + ": He sido interrumpido");
            }
        }, "Hilo-DAM");

        // Lanzar Hola
        hiloHola.start();

        // Esperar 50 ms
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Lanzar DAM
        hiloDAM.start();

        // Esperar 5 segundos desde que comenzaron
        try {
            Thread.sleep(5000);

            // Interrumpir ambos hilos
            hiloHola.interrupt();
            hiloDAM.interrupt();

            // Esperar a que terminen
            hiloHola.join();
            hiloDAM.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");
    }
}
