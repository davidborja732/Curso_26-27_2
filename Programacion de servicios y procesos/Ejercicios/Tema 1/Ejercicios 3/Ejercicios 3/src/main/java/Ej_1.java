import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;
/*
Crea un programa en Java que utilice ProcessBuilder para lanzar una
aplicación instalada en tu ordenador.
El programa deberá:
• Solicitar al usuario mediante teclado la ruta del programa que desea
ejecutar.
• Crear un proceso utilizando ProcessBuilder.
• Esperar a que el proceso termine mediante waitFor().
• Mostrar por consola el código de finalización del proceso.
• Controlar las posibles excepciones que puedan producirse.
Ejemplo: puedes probarlo ejecutando el Bloc de notas (notepad.exe) o la
calculadora de Windows. */
public class Ej_1 {
    static void main() throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el programa que quieres usar");
        String programa = sc.nextLine();
        Process pb = new ProcessBuilder(programa).start();
        pb.waitFor();
        System.out.println("Programa finalizado con pid "+pb.pid());
    }
}