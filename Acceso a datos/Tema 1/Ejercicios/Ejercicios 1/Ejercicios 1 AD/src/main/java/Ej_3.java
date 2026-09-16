import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ej_3 {
    static void main() {
        List<String> lista =  new ArrayList<>();
        lista.add("Antonio");
        lista.add("Barco");
        lista.add("Casa");
        lista.add("Dentro");
        lista.add("Espinaca");
        lista.forEach(System.out::println);
        Longitud_larga(lista);
    }
    public static void Longitud_larga(List<String> lista){
        lista.stream().max((o1, o2) -> o1.length()).ifPresent(System.out::println);
    }
}
