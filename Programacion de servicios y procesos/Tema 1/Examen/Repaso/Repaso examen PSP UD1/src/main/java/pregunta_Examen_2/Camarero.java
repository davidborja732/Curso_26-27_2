package pregunta_Examen_2;

public class Camarero implements Runnable {

    private String nombre;
    private ZonaRecogida zona;

    private int pedidosEntregados = 0;

    public Camarero(String nombre, ZonaRecogida zona) {
        this.nombre = nombre;
        this.zona = zona;
    }

    @Override
    public void run() {

        while (true) {

            synchronized (zona) {

                if (zona.getEntregados() >= Restaurante.TOTAL_PEDIDOS) {
                    break;
                }
            }

            Pedido pedido = zona.recogerPedido(nombre);

            if (pedido != null) {
                pedidosEntregados++;
            }
        }

        System.out.println(nombre +
                " terminó. Pedidos entregados: "
                + pedidosEntregados);
    }
}
