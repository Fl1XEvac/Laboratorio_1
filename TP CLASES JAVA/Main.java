import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Ejercicio 1,2,3
        Perro p1 = new Perro();
        p1.setNombre("Firulais");
        p1.setEdad(7);
        p1.setRaza("Pastor Aleman");

        p1.Ladrar();

        //Ejercicio 4 y 5

        System.out.println("Colocar el radio del circulo para calcular el area y el perimetro: ");
        double radio = scanner.nextDouble();
        Circulo p2 = new Circulo();
        p2.setRadio(radio);
        p2.area(p2.getRadio());
        System.out.println("---");
        p2.circunferencia(p2.getRadio());

        //Ejercicio 6 y 7

         */


        /*Ejercicio 8 y 9

        Libro p3 = new Libro("Las aventuras de Gon y Killua", "Gon y Killua", "20/03/2004");
        p3.setTitulo("Las aventuras de Gon y Killua");
        p3.setAutor("Gon y Killua");
        p3.setAño_de_publicacion("20/03/2004");
        p3.mostrar_libro();

         */

        /*Ejercicio 10 y 11

        CuentaBancaria p4 = new CuentaBancaria();

        System.out.println("Ingrese el numero de cuenta: ");
        int num_de_cuenta= scanner.nextInt();

        System.out.println("Ingrese la cantidad de plata que tiene en el banco: ");
        int banco = scanner.nextInt();

        System.out.println("Ingrese la cantidad de plata que desea depositar: ");
        int plata = scanner.nextInt();

        System.out.println("Ingrese la cantidad que desea retirar: ");
        int retirar = scanner.nextInt();



        p4.setSaldo(plata);
        p4.setNum_de_cuenta(num_de_cuenta);
        p4.Depositar(plata, banco);
        p4.Retirar(banco, retirar);

         */

        /* Ejercicio 12
        Rectangulo p5 = new Rectangulo();

        System.out.println("Ingrese el ancho del rectangulo: ");
        int ancho = scanner.nextInt();

        System.out.println("Ingrese la altura del rectangulo: ");
        int altura = scanner.nextInt();

        p5.setAltura(altura);
        p5.setAncho(ancho);
        p5.calcularPerimetro(altura, ancho);
        p5.calcularArea(altura, ancho);


         */

        /*Ejercicio 13 y 14

        Coche p6 = new Coche();

        String modelo = "NSX";

        String marca = "Honda";

        int ano_de_publicacion = 2023;

        p6.setMarca(marca);
        p6.setModelo(modelo);
        p6.setAno_de_fabricacion(ano_de_publicacion);

        System.out.println("La marca del auto es: " + p6.getMarca() + " El modelo es: " + p6.getModelo() + " y el año de fabricacion es: " + p6.getAno_de_fabricacion());

        p6.Acelerar();
        p6.Frenar();


         */

        //Ejercicio 15

        Pelicula p7 = new Pelicula();

        p7.setDirector("Naoko Yamada");
        p7.setTitulo("A Silent Voice");
        p7.setDuracion_min(129);

        p7.InformacionPelicula(p7.getTitulo(), p7.getDirector(), p7.getDuracion_min());












    }
}

