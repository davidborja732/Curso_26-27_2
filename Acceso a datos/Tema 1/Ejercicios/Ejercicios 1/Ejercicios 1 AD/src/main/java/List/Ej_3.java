package List;

import java.util.ArrayList;
import java.util.List;

/*
Dada una lista de Strings, escribir una función que devuelva la longitud del
string más largo en la lista.
*/
public class Ej_3 {

    static void main() {
        List<String> lista = new ArrayList<>();
        lista.add("Antonio");
        lista.add("Barco");
        lista.add("Casa");
        lista.add("Dentro");
        lista.add("Espinaca");

        //lista.forEach(System.out::println);

        System.out.println(longitudLarga(lista));

    }
    public static int longitudLarga(List<String> lista) {
        return lista.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
    }
    /*
    public static void longitudLarga(List<String> lista) {
        int max = 0;
        String palabralarga = "";
        for (String palabra : lista) {
            if (palabra.length() > max) {
                max = palabra.length();
                palabralarga=palabra;
            }
        }
        System.out.println("La palabra "+palabralarga+" es la mas larga con una longitud de "+max+" caracteres.");
    }*/

}

