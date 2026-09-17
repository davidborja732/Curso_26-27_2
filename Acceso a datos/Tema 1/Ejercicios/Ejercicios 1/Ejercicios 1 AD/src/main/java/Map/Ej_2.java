package Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ej_2 {
    static void main() {
        List<Integer> list = List.of(1,2,3,4,5,5,6,7,8,9,9,8,7,6,1,2,10,12,12,14,14,216);
        SoloUnicos(list);
    }
    public static void SoloUnicos(List<Integer> lista){
        Set<Integer> set = new HashSet<>();
        set.addAll(lista);
        set.forEach(System.out::println);
    }
}
