package Wikipedia_EJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Wiki {
    public static void main(String[] args) {
        try {
// creamos el objeto url
            URL url = new URL("https://es.lipsum.com/");
// abrimos un reader que lee directamente de la url
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );
// recorremos el reader y lo mostramos por consola
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*public static void main(String[] args) {
        try {
// creamos el objeto url
            URL url = new URL("https://es.lipsum.com/");
// creamos una conexión a la url
            URLConnection cn = url.openConnection();
// abrimos un reader que lee directamente de la url
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(cn.getInputStream())
            );
// recorremos el reader y lo mostramos por consola
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}