import java.util.Random;
import java.util.Scanner;

public class Ejercicio_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int numero_aleatorio=aleatorio.nextInt(100)+1;
        System.out.println(numero_aleatorio);
        int numero_intentos=0;
        System.out.println("Dime un numero entre el 1 y el 100");
        int numero_usuario=sc.nextInt();
        if (numero_usuario!=numero_aleatorio) {
            numero_mayor_menor(numero_aleatorio,numero_usuario);
        }
        while (numero_usuario!=numero_aleatorio) {
            System.out.println("numero equivocado prueba de nuevo");
            System.out.println("Intento numero "+numero_intentos);
            numero_intentos++;
            System.out.println("Dime otro numero");
            numero_usuario=sc.nextInt();
            if (numero_usuario!=numero_aleatorio) {
                numero_mayor_menor(numero_aleatorio,numero_usuario);
            }
            if (numero_usuario==numero_aleatorio) {
                System.out.println("El numero era "+numero_aleatorio+ " lo has acertado");
                System.out.println("Lo has hecho en "+numero_intentos+" intentos");
            }
        }

    }
    public static void numero_mayor_menor(int numero_aleatorio, int numero_usuario) {
        if (numero_usuario>numero_aleatorio) {
            System.out.println("Numero mayor");
        }else if (numero_usuario<numero_aleatorio){
            System.out.println("Numero menor");
        }
    }
}
