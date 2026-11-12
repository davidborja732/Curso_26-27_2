package pregunta_Examen_2;

import java.util.Random;

public class Cocinero implements Runnable {

    private String nombre;
    private ZonaRecogida zona;
    private Random random = new Random();

    private int pedidosPreparados = 0;

    public Cocinero(String nombre, ZonaRecogida zona) {
        this.nombre = nombre;
        this.zona = zona;
    }

    @Override
    public void run() {

        while (true) {

            int idPedido = Restaurante.obtenerSiguientePedido();

            if (idPedido == -1) {
                break;
            }

            try {
                Thread.sleep(random.nextInt(301) + 200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            zona.dejarPedido(
                    new Pedido(idPedido),
                    nombre);

            pedidosPreparados++;
        }

        System.out.println(nombre +
                " terminó. Pedidos preparados: "
                + pedidosPreparados);
    }
}
