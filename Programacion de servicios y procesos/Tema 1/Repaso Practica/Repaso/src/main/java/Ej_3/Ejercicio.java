package Ej_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio {

    public static void main(String[] args)
            throws IOException, InterruptedException {

        List<String> comandos =
                Files.readAllLines(Paths.get("Documentos/comandos.bat"));

        for (String comando : comandos) {

            ProcessBuilder pb =
                    new ProcessBuilder(
                            "cmd",
                            "/c",
                            comando);

            pb.redirectOutput(
                    ProcessBuilder.Redirect.appendTo(
                            Paths.get("Documentos/correctas.txt").toFile()));

            pb.redirectError(
                    ProcessBuilder.Redirect.appendTo(
                            Paths.get("Documentos/fallos.txt").toFile()));

            Process p = pb.start();

            p.waitFor();
        }

        System.out.println("Proceso finalizado");
    }
}
