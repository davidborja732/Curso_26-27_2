import java.io.IOException;

public class Ejercicio_1 {
    static void main() {
        try {
            Process process= new ProcessBuilder("C:\\Program Files\\Notepad++\\notepad++.exe","Archivos/PSP_DOC.txt").start();
            System.out.println("Lanzado proceso notepad con java. PID: " + process.pid());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
