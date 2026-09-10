import java.util.Scanner;

public class Ejercicio_4 {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Saludo");
        System.out.println("2- Numero Par/Impar");
        System.out.println("3- Numero primo");
        System.out.println("4- Salir");
        System.out.println("Elige una opcion");
        int opcion = sc.nextInt();
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    saludar();
                    break;
                case 2:
                    System.out.println("Ingresa el numero par/impar");
                    int numero_par_impar = sc.nextInt();
                    Numero_par(numero_par_impar);
                    break;

                case 3:
                    System.out.println("Ingresa el numero primo");
                    int numero_primo = sc.nextInt();
                    break;

                case 4:
                    System.out.println("Saliendo.......");
                    break;
                default:
                    System.out.println("Operacion desconocida");
                    break;

            }
            System.out.println("Dime otra opcion");
            opcion = sc.nextInt();
        }
    }

    public void saludar() {
        System.out.println("Hola humano");
    }

    public String Numero_par(int numero) {
        if (numero % 2 == 0) {
            return "Numero par";
        } else {
            return "Numero impar";
        }
    }
}

