package Ejercicio_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Lavadero  implements Runnable{
    int numero_puestos;
    Queue<Puesto> listapuestos=new LinkedList<>();
    int precio=2;
    int total_recaudado;
    int total_recaudado_puesto;
    int tiempo_medio;

    Puesto puesto;
    Coche coche;

    public int getTiempo_medio() {
        return tiempo_medio;
    }

    public void setTiempo_medio(int tiempo_medio) {
        this.tiempo_medio = tiempo_medio;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public int getNumero_puestos() {
        return numero_puestos;
    }

    public void setNumero_puestos(int numero_puestos) {
        this.numero_puestos = numero_puestos;
    }

    public Queue<Puesto> getListapuestos() {
        return listapuestos;
    }

    public void setListapuestos(Queue<Puesto> listapuestos) {
        this.listapuestos = listapuestos;
    }

    public int getTotal_recaudado_puesto() {
        return total_recaudado_puesto;
    }

    public void setTotal_recaudado_puesto(int total_recaudado_puesto) {
        this.total_recaudado_puesto = total_recaudado_puesto;
    }

    public int getTotal_recaudado() {
        return total_recaudado;
    }

    public void setTotal_recaudado(int total_recaudado) {
        this.total_recaudado = total_recaudado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Lavadero() {
    }

    public Lavadero(int numero_puestos, int total_recaudado_puesto, Queue<Puesto> listapuestos, int precio, int total_recaudado) {
        this.numero_puestos = numero_puestos;
        this.total_recaudado_puesto = total_recaudado_puesto;
        this.listapuestos = listapuestos;
        this.precio = precio;
        this.total_recaudado = total_recaudado;
    }

    @Override
    public void run() {
        Random random=new Random();
        int puestoacreados=0;
        List<Puesto> puestos;
        while (puestoacreados<numero_puestos){
            listapuestos.add(new Puesto());
        }
    }
    public void Estadisticas_finales(){
        System.out.println(
                "Tiempo medio "+ tiempo_medio +
                "Total acumulado "+total_recaudado+
                "Total acumulado por caja "+
                "Tiempo medio por puesto "
        );
    }
}
