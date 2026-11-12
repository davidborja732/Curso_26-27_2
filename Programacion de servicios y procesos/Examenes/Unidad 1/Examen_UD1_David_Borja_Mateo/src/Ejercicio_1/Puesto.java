package Ejercicio_1;

public class Puesto{
    Coche coche;
    boolean libre;
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public Puesto() {
    }

    public Puesto(Coche coche, boolean libre, String nombre) {
        this.coche = coche;
        this.libre = libre;
        this.nombre = nombre;
    }

    public void Lavar_coche(String nombrecoche){
        while (!libre){
            System.out.println(nombrecoche+" esperando a ser lavado");
        }
        while (libre){
            System.out.print("Lavando coche "+nombrecoche);
            try {
                Thread.sleep(100);
                System.out.printf(nombrecoche+" terminado de lavar");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
