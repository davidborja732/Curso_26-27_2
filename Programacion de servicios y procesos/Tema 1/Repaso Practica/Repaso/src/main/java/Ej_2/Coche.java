package Ej_2;

public class Coche {
    private String nombre;
    private int distancia;

    public Coche(String nombre) {
        this.nombre = nombre;
        this.distancia = 0;
    }

    public Coche() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    @Override
    public String toString() {
        return "Coche{" + "nombre=" + nombre + ", distancia=" + distancia + '}';
    }
}
