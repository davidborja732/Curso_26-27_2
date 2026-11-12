package Pregunta_Examen_1;

public class Puesto {

    private int id;
    private boolean ocupado;

    public Puesto(int id) {
        this.id = id;
        this.ocupado = false;
    }

    public int getId() {
        return id;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
