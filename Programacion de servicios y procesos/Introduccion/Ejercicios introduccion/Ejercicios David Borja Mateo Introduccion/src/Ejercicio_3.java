import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero_usuario;
        for (int i=1;i<=10;i++) {
            System.out.println("Dime un numero pàra añadir a la lista");
            numero_usuario=sc.nextInt();
            numeros.add(numero_usuario);
        }
        int suma=0;
        numeros.stream().max(Integer::compareTo).ifPresent(numero->System.out.println("El numero mayor es: "+numero));
        numeros.stream().min(Integer::compareTo).ifPresent(numero->System.out.println("El numero menor es: "+numero));
        for (Integer numero:numeros){
            suma+=numero;
        }
        System.out.println("La suma de toda la lista es: "+suma);
        System.out.println("La media es "+suma/numeros.size());
    }
}
