package Ej_1;

public class GestorDescargas {
    private int descargasCompletadas=0;

    public int getDescargasCompletadas() {
        return descargasCompletadas;
    }

    public synchronized void registrarDescarga(String nombreArchivo){
        if(descargasCompletadas==0){
            descargasCompletadas=1;
        }
        System.out.println(Thread.currentThread().getName() + ": Registrando descarga " + nombreArchivo +" Total descargas "+descargasCompletadas++);
    }

    public GestorDescargas(int descargasCompletadas) {
        this.descargasCompletadas = descargasCompletadas;
    }

    public GestorDescargas() {
    }
}
