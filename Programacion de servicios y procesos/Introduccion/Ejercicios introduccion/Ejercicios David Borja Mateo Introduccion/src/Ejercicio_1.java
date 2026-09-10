import java.util.Scanner;

public class Ejercicio_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantas horas quieres meter");
        int numero_notas = sc.nextInt();
        int valor_total=0;
        int valor=0;
        int nota;
        while (valor<numero_notas) {
            System.out.println("Dime la nota "+ valor);
            nota = sc.nextInt();
            valor_total+=nota;
            valor++;
            if (valor==numero_notas) {
                System.out.println("La nota media es "+valor_total/numero_notas);
                int nota_final=valor_total/numero_notas;
                if (nota_final>=5) {
                    System.out.println("Aprobado");
                }
                if (nota_final<5){
                    System.out.println("Suspendido");
                }
                if (nota_final>=9){
                    System.out.println("Sobresaliente");
                }
            }
        }
    }
}
