import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //A)
        Scanner iguales= new Scanner(System.in);
        int num, num1;
        System.out.print("Ingrese un numero de 3 digitos: ");
        num= iguales.nextInt();
        System.out.print("Ingrese un segundo numero de 3 digitos: ");
        num1 = iguales.nextInt();

        if (num%10 == num1%10) {
            System.out.print("La ultima cifra de ambos numeros son iguales");
        }else {
            System.out.print("La ultima cifra de ambos numeros no son iguales");
        }

        // B)
        //Scanner capicua = new Scanner(System.in);
        //int num, primera_cifra, tercer_cifra;
        //System.out.print("Ingrese un numero entero de 3 cifras para saber si es capicua");
        //num= capicua.nextInt();
        //primera_cifra= num/100;
        //tercer_cifra= num%10;

        //if(primera_cifra == tercer_cifra){
            //System.out.print("El numero es capicua");
        //}else{
            //System.out.print("El numero no es capicua");
    }
}

