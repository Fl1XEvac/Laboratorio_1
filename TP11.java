import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
public class TP11 {
    /*Ejercicio 1
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> marcasAutos = new ArrayList<>();

            // Bucle para leer y guardar marcas de autos
            while (true) {
                System.out.print("Ingrese la marca del auto (o escriba 'salir' para finalizar): ");
                String marca = scanner.nextLine();

                // Verificar si el usuario quiere salir
                if (marca.equalsIgnoreCase("salir")) {
                    break;
                }

                // Agregar la marca del auto a la lista
                marcasAutos.add(marca);
            }

            // Mostrar todas las marcas de autos guardadas
            System.out.println("\nMarcas de autos guardadas:");
            for (String marca : marcasAutos) {
                System.out.println(marca);
            }

            // Cerrar el scanner
            scanner.close();
        }

     */
    /*Ejercicio 2

    public class EquipoDeFutbol {

        private String nombreEquipo;
        private ArrayList<String> jugadores;

        public EquipoDeFutbol(String nombreEquipo) {
            this.nombreEquipo = nombreEquipo;
            this.jugadores = new ArrayList<>();
        }

        public void agregarJugador(String nombreJugador) {
            jugadores.add(nombreJugador);
            System.out.println("Jugador " + nombreJugador + " agregado al equipo " + nombreEquipo);
        }

        public void eliminarJugador(String nombreJugador) {
            if (jugadores.contains(nombreJugador)) {
                jugadores.remove(nombreJugador);
                System.out.println("Jugador " + nombreJugador + " eliminado del equipo " + nombreEquipo);
            } else {
                System.out.println("El jugador " + nombreJugador + " no se encuentra en el equipo " + nombreEquipo);
            }
        }

        public void listarPlantilla() {
            System.out.println("Plantilla del equipo " + nombreEquipo + ":");
            for (String jugador : jugadores) {
                System.out.println(jugador);
            }
        }

        public void main(String[] args) {
            // Ejemplo de uso
            EquipoDeFutbol equipo = new EquipoDeFutbol("Equipo A");

            equipo.agregarJugador("Jugador1");
            equipo.agregarJugador("Jugador2");
            equipo.listarPlantilla();

            equipo.eliminarJugador("Jugador3"); // Intentar eliminar un jugador que no está en el equipo
            equipo.eliminarJugador("Jugador1");
            equipo.listarPlantilla();
        }

    }

     */
    //Ejercicio 3
    public class Factura {

        private int numeroFactura;
        private Date fechaEmision;
        private String cliente;
        private List<Articulo> articulos;

        public Factura(int numeroFactura, Date fechaEmision, String cliente) {
            this.numeroFactura = numeroFactura;
            this.fechaEmision = fechaEmision;
            this.cliente = cliente;
            this.articulos = new ArrayList<>();
        }

        public void agregarArticulo(Articulo articulo) {
            articulos.add(articulo);
        }

        public double calcularSubtotal() {
            double subtotal = 0;
            for (Articulo articulo : articulos) {
                subtotal += articulo.getPrecioUnitario() * articulo.getCantidad();
            }
            return subtotal;
        }

        public double calcularIVA() {
            double subtotal = calcularSubtotal();
            return subtotal * 0.16; // Suponiendo que el IVA es del 16%
        }

        public double calcularTotal() {
            double subtotal = calcularSubtotal();
            double iva = calcularIVA();
            return subtotal + iva;
        }

        public void main(String[] args) {
            // Ejemplo de uso
            Factura factura = new Factura(1, new Date(), "Cliente A");

            // Agregar artículos a la factura
            Articulo articulo1 = new Articulo("Producto1", 10.0, 2);
            Articulo articulo2 = new Articulo("Producto2", 15.0, 1);

            factura.agregarArticulo(articulo1);
            factura.agregarArticulo(articulo2);

            // Imprimir detalles de la factura
            System.out.println("Número de factura: " + factura.numeroFactura);
            System.out.println("Fecha de emisión: " + factura.fechaEmision);
            System.out.println("Cliente: " + factura.cliente);

            // Imprimir detalles de los artículos
            System.out.println("\nDetalles de los artículos:");
            for (Articulo articulo : factura.articulos) {
                System.out.println(articulo.getNombre() + " - Precio unitario: " + articulo.getPrecioUnitario() +
                        ", Cantidad: " + articulo.getCantidad());
            }

            // Calcular y mostrar subtotal, IVA y total
            System.out.println("\nSubtotal: $" + factura.calcularSubtotal());
            System.out.println("IVA: $" + factura.calcularIVA());
            System.out.println("Total: $" + factura.calcularTotal());
        }
    }

    class Articulo {
        private String nombre;
        private double precioUnitario;
        private int cantidad;

        public Articulo(String nombre, double precioUnitario, int cantidad) {
            this.nombre = nombre;
            this.precioUnitario = precioUnitario;
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecioUnitario() {
            return precioUnitario;
        }

        public int getCantidad() {
            return cantidad;
        }
    }

}
