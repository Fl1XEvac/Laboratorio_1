import java.util.Scanner;

public class Calculadora_UlisesJimenez {
    public static void main(String[] args) {
        Scanner calculadora= new Scanner(System.in);
        int contador= 999;
        while (contador != 0){
            System.out.print("Bienvenido a la calculadora, seleccione el operador que desee realizar (1 para suma, 2 para resta, 3 para multiplicacion, 4 para division): ");
            int op = calculadora.nextInt();
            if (op == 1) {
                System.out.print("Ingrese los numeros para realizar la suma (numero 1): ");
                int num= calculadora.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                int num2= calculadora.nextInt();
                double suma= (num + num2);
                System.out.println("La suma entre " + num +" y " + num2 + " Es: " + suma);
                System.out.println("Desea seguir realizando operaciones? Si es asi, introduzca 0, si desea seguir realizando operaciones, introduzca 1: ");
                int salida= calculadora.nextInt();
                if (salida == 0){
                    System.out.print("Gracias por usar nuestra calculadora. ¡Hasta luego!");
                    break;
                }else{
                    continue;
                }

            } else if (op == 2) {
                System.out.print("Ingrese los numeros para realizar la resta (numero 1): ");
                int num = calculadora.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                int num2 = calculadora.nextInt();
                double resta = (num - num2);
                System.out.println("La resta entre " + num + " y " + num2 + " es: " + resta);
                System.out.println("Desea seguir realizando operaciones? Si es asi, introduzca 0, si desea seguir realizando operaciones, introduzca 1: ");
                int salida= calculadora.nextInt();
                if (salida == 0){
                    System.out.print("Gracias por usar nuestra calculadora. ¡Hasta luego!");
                    break;
                }else{
                    continue;
                }
            } else if (op == 3) {
                System.out.print("Ingrese los numeros para realizar la multiplicacion (numero 1): ");
                int num = calculadora.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                int num2 = calculadora.nextInt();
                double multiplicacion = (num * num2);
                System.out.println("La multiplicacion entre " + num + " y " + num2 + " es: " + multiplicacion);
                System.out.print("Desea seguir realizando operaciones? Si es asi, introduzca 0, si desea seguir realizando operaciones, introduzca 1: ");
                int salida= calculadora.nextInt();
                if (salida == 0){
                    System.out.print("Gracias por usar nuestra calculadora. ¡Hasta luego!");
                    break;
                }else{
                    continue;
                }

            } else if (op == 4) {
                int contador1= 999;
                while (contador1 > 0){
                    System.out.print("Ingrese los numeros para realizar la division (numero 1): ");
                    int num = calculadora.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int num2 = calculadora.nextInt();
                        if (num == 0 || num2 == 0){
                        System.out.println("Ha ingresado un 0, por favor, ingrese un numero valido");
                        continue;
                        }
                    float division= (num / num2);
                    System.out.println("La division entre " + num + " y " + num2 + " es: " + division);
                    int salida;
                    System.out.println("Desea seguir realizando operaciones? Si es asi, introduzca 0, si desea seguir realizando operaciones, introduzca 1: ");
                    salida = calculadora.nextInt();
                    if (salida == 0){
                        System.out.print("Gracias por usar nuestra calculadora. ¡Hasta luego!");
                        break;
                    }else if (salida == 1){
                        continue;
                    }
                }
            }
        }

    }
}