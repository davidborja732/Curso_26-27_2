package Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ej_1 {
    static void main() {
        Set<String> set = new HashSet<String>();
        set.add("Hola");
        set.add("Adios");
        set.add("Acer");
        set.add("Philips");
        set.add("Nintendo");
        set.forEach(System.out::println);


    }
}
