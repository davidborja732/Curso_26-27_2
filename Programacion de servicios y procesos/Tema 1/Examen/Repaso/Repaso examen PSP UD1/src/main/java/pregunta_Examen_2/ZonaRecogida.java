package pregunta_Examen_2;

import java.util.Queue;


    import java.util.LinkedList;
import java.util.Queue;

    public class ZonaRecogida {

        private static final int CAPACIDAD = 5;

        private Queue<Pedido> pedidos = new LinkedList<>();

        private int preparados = 0;
        private int entregados = 0;

        public synchronized void dejarPedido(Pedido pedido, String cocinero) {

            try {

                while (pedidos.size() >= CAPACIDAD) {

                    System.out.println(cocinero +
                            " espera porque la zona está llena.");

                    wait();
                }

                pedidos.add(pedido);
                preparados++;

                System.out.println(cocinero +
                        " prepara pedido " +
                        pedido.getId() +
                        " | En cola: " +
                        pedidos.size());

                notifyAll();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public synchronized Pedido recogerPedido(String camarero) {

            try {

                while (pedidos.isEmpty()) {

                    if (entregados >= Restaurante.TOTAL_PEDIDOS) {
                        return null;
                    }

                    System.out.println(camarero +
                            " espera porque no hay pedidos.");

                    wait();
                }

                Pedido pedido = pedidos.poll();

                entregados++;

                System.out.println(camarero +
                        " entrega pedido " +
                        pedido.getId() +
                        " | En cola: " +
                        pedidos.size());

                notifyAll();

                return pedido;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return null;
        }

        public synchronized int getPreparados() {
            return preparados;
        }

        public synchronized int getEntregados() {
            return entregados;
        }

        public void mostrarEstadisticas() {

            System.out.println("\n====================");
            System.out.println("ESTADÍSTICAS");
            System.out.println("====================");

            System.out.println("Pedidos preparados: " + preparados);
            System.out.println("Pedidos entregados: " + entregados);
        }
    }

