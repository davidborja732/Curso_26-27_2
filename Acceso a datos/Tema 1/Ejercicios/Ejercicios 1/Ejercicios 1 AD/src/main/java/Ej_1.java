import java.util.ArrayList;
import java.util.List;

public class Ej_1 {
    static void main() {
        List<String> lista =  new ArrayList<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("e");
        lista.forEach(System.out::println);
    }
}
