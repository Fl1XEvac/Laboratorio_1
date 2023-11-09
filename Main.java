import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Ejercicio 1
         int [] array_num= {2, 4, 1, 3};

        Arrays.sort(array_num);
        for (int n : array_num) {
            System.out.println(n);
            }

                */
        /*Ejericio 2
        Integer [] array_num= {2, 4, 1, 3};
        Arrays.sort(array_num, Collections.reverseOrder());
        for (int n : array_num) {
            System.out.println(n);
        */

        /*Ejercicio 3
        double [] array_num= {4.2, 1.2, 5.3 , 6.4, 1.1, 2.4, 5.5};
        Arrays.sort(array_num);
        for(double n : array_num){
            System.out.println(n);
        }

        */
        /* Ejercicio 4
        Double [] array_num= {5.2, 4.2, 7.8, 6.4, 1.2, 9.0, 8.7};

        Arrays.sort(array_num, Collections.reverseOrder());
        for (double v : array_num){
            System.out.println(v);

        }

         */
        /*Ejercicio 5
        String [] nombres = {"Ulises", "Abel", "Exequiel", "Erica", "Luis", "Brisa"};
        Arrays.sort(nombres);
        for (String a : nombres){
            System.out.println(a);
        }
        */
        /*Ejercicio 6
        String [] nombres = {"Ulises", "Abel", "Exequiel", "Erica", "Luis", "Brisa"};
        Arrays.sort(nombres, Collections.reverseOrder());
        for (String s : nombres){
            System.out.println(s);
        }

         */
        /*Ejericio 9
        int [] numeros = {4, 1, 3, 2};
        int aux;

        aux = numeros[0];
        numeros[0] = numeros[1];
        numeros[1] = aux; //1

        aux = numeros[1];
        numeros[1] = numeros[3];
        numeros[3] = aux; //2

        System.out.print(numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3]);


         */
        /* Ejercicio 10
        int menor, i, j, pos, tmp;
        int [] numeros = {50, 10, 7, 35, 25, 1, 98};
        for (i = 0; i < Array.getLength(numeros); i++){
            menor = numeros[i];
            pos = i;
            for (j = i + 1; j < Array.getLength(numeros); j++){
                if (numeros[j] < menor){
                    menor = numeros[j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = numeros[i];
                numeros[i]= numeros[pos];
                numeros[pos] = tmp;
            }


        }
        for (int p : numeros){
            System.out.println(p);
        }

         */
        /* Ejercicio 11
        int p, j;
        int aux;
        int [] numeros = {4, 5, 6 ,1 ,2, 7, 0, 8, 10, 9};
        for (p = 1; p < numeros.length; p++) {
            aux = numeros[p];
            j = p - 1;
            while ((j >= 0) && (aux < numeros[j])) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = aux;
        }
        for (int i : numeros){
            System.out.print(i + " ");
        }
        */

        /*Ejercicio 12
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Array original:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nArray ordenado:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        */

        /*Ejercicio 13
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Array original:");
        printArray(arr);

        shellSort(arr);

        System.out.println("\nArray ordenado:");
        printArray(arr);
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

         */
        //Ejercicio 14

        int[] arr = new int[20];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los 20 elementos del array:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array original:");
        printArray(arr);

        System.out.println("\n¿Cómo desea ordenar el array?");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        int orden = scanner.nextInt();

        System.out.println("\nElija el método de ordenamiento:");
        System.out.println("1. Inserción");
        System.out.println("2. Burbuja");
        System.out.println("3. Selección");
        int metodo = scanner.nextInt();


        switch (orden) {
            case 1:
                switch (metodo) {
                    case 1:
                        insertionSort(arr);
                        break;
                    case 2:
                        bubbleSort(arr);
                        break;
                    case 3:
                        selectionSort(arr);
                        break;
                    default:
                        System.out.println("Método de ordenamiento no válido");
                }
                break;
            case 2:
                switch (metodo) {
                    case 1:
                        insertionSort(arr);
                        reverseArray(arr);
                        break;
                    case 2:
                        bubbleSort(arr);
                        reverseArray(arr);
                        break;
                    case 3:
                        selectionSort(arr);
                        reverseArray(arr);
                        break;
                    default:
                        System.out.println("Método de ordenamiento no válido");
                }
                break;
            default:
                System.out.println("Opción de orden no válida");
        }

        System.out.println("\nArray ordenado:");
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


