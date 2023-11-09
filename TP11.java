import java.util.*;

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

    /*Ejercicio 4

    public static void main(String[] args) {
        // Parte a: Leer 20 números decimales ingresados por el usuario y almacenarlos en un ArrayList
        ArrayList<Double> numeros = new ArrayList<>();
        leerNumeros(numeros, 20);
    // Parte b: Determinar y mostrar el mayor de los números en el arreglo
    double mayor = encontrarMayor(numeros);
        System.out.println("El mayor número es: " + mayor);

    // Parte c: Determinar y mostrar el menor de los números en el arreglo
    double menor = encontrarMenor(numeros);
        System.out.println("El menor número es: " + menor);

    // Calcular y mostrar el rango de los elementos en el arreglo
    double rango = calcularRango(mayor, menor);
        System.out.println("El rango de los números es: " + rango);
}

    private static void leerNumeros(ArrayList<Double> numeros, int cantidad) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese " + cantidad + " números decimales:");

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            numeros.add(numero);
        }

        scanner.close();
    }

    private static double encontrarMayor(ArrayList<Double> numeros) {
        double mayor = Double.MIN_VALUE;

        for (double numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        return mayor;
    }

    private static double encontrarMenor(ArrayList<Double> numeros) {
        double menor = Double.MAX_VALUE;

        for (double numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    private static double calcularRango(double mayor, double menor) {
        return mayor - menor;
    }
    */
    /* Ejercicio 5
    public class AplicacionNumeros {

        public static void main(String[] args) {
            // Parte a: Almacenar en un ArrayList 20 números enteros positivos pares del 1 al 100
            ArrayList<Integer> numeros = generarNumerosAleatorios(20);

            // Parte b: Calcular y mostrar el promedio aritmético
            double promedio = calcularPromedio(numeros);
            System.out.println("El promedio aritmético es: " + promedio);

            // Parte c: Contar cuántos números son iguales al promedio aritmético
            int igualesAlPromedio = contarIgualesAlPromedio(numeros, promedio);
            System.out.println("Cantidad de números iguales al promedio: " + igualesAlPromedio);

            // Parte d: Contar cuántos números son mayores que el promedio aritmético
            int mayoresAlPromedio = contarMayoresAlPromedio(numeros, promedio);
            System.out.println("Cantidad de números mayores al promedio: " + mayoresAlPromedio);

            // Parte e: Contar cuántos números son menores que el promedio aritmético
            int menoresAlPromedio = contarMenoresAlPromedio(numeros, promedio);
            System.out.println("Cantidad de números menores al promedio: " + menoresAlPromedio);
        }

        private static ArrayList<Integer> generarNumerosAleatorios(int cantidad) {
            ArrayList<Integer> numeros = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < cantidad; i++) {
                // Generar un número entero positivo par aleatorio entre 1 y 100
                int numero = random.nextInt(50) * 2 + 1;
                numeros.add(numero);
            }

            return numeros;
        }

        private static double calcularPromedio(ArrayList<Integer> numeros) {
            int suma = 0;

            for (int numero : numeros) {
                suma += numero;
            }

            return (double) suma / numeros.size();
        }

        private static int contarIgualesAlPromedio(ArrayList<Integer> numeros, double promedio) {
            int contador = 0;

            for (int numero : numeros) {
                if (numero == promedio) {
                    contador++;
                }
            }

            return contador;
        }

        private static int contarMayoresAlPromedio(ArrayList<Integer> numeros, double promedio) {
            int contador = 0;

            for (int numero : numeros) {
                if (numero > promedio) {
                    contador++;
                }
            }

            return contador;
        }

        private static int contarMenoresAlPromedio(ArrayList<Integer> numeros, double promedio) {
            int contador = 0;

            for (int numero : numeros) {
                if (numero < promedio) {
                    contador++;
                }
            }

            return contador;
        }
    }
    
     */
}

