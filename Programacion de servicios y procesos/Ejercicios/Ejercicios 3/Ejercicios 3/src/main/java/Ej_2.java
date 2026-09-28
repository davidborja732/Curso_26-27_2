import java.io.*;

/* Ejercicio 2 — Ejecutar comandos y guardar la salida en un fichero
Crea un programa Java que lance un proceso cmd utilizando ProcessBuilder.
El programa deberá ejecutar varios comandos de Windows, por ejemplo:
echo Usuario actual:
whoami
echo Directorio actual:
cd
echo Contenido del directorio:
dir
La salida producida por estos comandos deberá almacenarse en un fichero
llamado salida.txt.
Además:
• Los errores deberán almacenarse en un fichero llamado errores.txt.
• Deberás utilizar redirectOutput() y redirectError().
• El programa deberá esperar a que finalice el proceso.
• Finalmente, deberá mostrar por consola el código de finalización.*/
public class Ej_2 {
    static void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Archivos/CMD_Proceso.txt")))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}