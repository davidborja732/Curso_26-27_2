package Ej_1;

public class Main_Ej_1 {
    static void main() {
        GestorDescargas gestorDescargas = new GestorDescargas();
        Thread Descarga1=new Thread(new Descargador("Archivo1.pdf",gestorDescargas));
        Thread Descarga2=new Thread(new Descargador("Archivo2.pdf",gestorDescargas));
        Thread Descarga3=new Thread(new Descargador("Archivo3.txt",gestorDescargas));
        Thread Descarga4=new Thread(new Descargador("Archivo4.docx",gestorDescargas));
        Thread Descarga5=new Thread(new Descargador("Archivo5.odf",gestorDescargas));
        Thread Descarga6=new Thread(new Descargador("Archivo6.pdf",gestorDescargas));
        Descarga1.start();
        Descarga2.start();
        Descarga3.start();
        Descarga4.start();
        Descarga5.start();
        Descarga6.start();
        try {
            Descarga1.join();
            Descarga2.join();
            Descarga3.join();
            Descarga4.join();
            Descarga5.join();
            Descarga6.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int Descargas=gestorDescargas.getDescargasCompletadas()-1;
        System.out.println("El total de descargas es "+Descargas);
    }
}
