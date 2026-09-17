package List;

import java.util.ArrayList;
import java.util.List;

public class Ej_2 {
    static void main() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        lista.add(11);
        lista.add(12);
        numeros_pares(lista);
    }
    public static void numeros_pares(List<Integer> lista){
        lista.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
    }
}
