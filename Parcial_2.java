import java.util.Scanner;

public class Parcial_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dna = new String[6];

        // Se solicita al usuario que ingrese las secuencias de ADN
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese la secuencia de ADN en la fila " + (i + 1) + ": ");
            dna[i] = scanner.nextLine();
            // Si la secuencia ingresada es incorrecta, se le indica al usuario que ha ingresado mal y se le vuelve a pedir
            if (!isValidDnaSequence(dna[i])) {
                System.out.println("Ha ingresado una letra incorrecta, por favor, utilice solo los caracteres A, T, C y G");
                i--;
            }
        }

        boolean isMutant = isMutant(dna);
        // Se llama a la función isMutant
        if (isMutant) {
            // Si el retorno da True, se le indica que el sujeto es un mutante
            System.out.println("El sujeto es un mutante.");
        } else {
            System.out.println("El sujeto no es un mutante.");
        }

        scanner.close();
    }

    public static boolean isMutant(String[] dna) {
        int n = dna.length;
        int count = 0;

        // Verificar filas horizontales
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - 4; j++) {
                if (dna[i].substring(j, j + 4).matches("AAAA|TTTT|CCCC|GGGG")) {
                    count++;
                }
            }
        }

        // Verificar columnas verticales
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= n - 4; i++) {
                StringBuilder sequence = new StringBuilder();
                for (int k = 0; k < 4; k++) {
                    sequence.append(dna[i + k].charAt(j));
                }
                if (sequence.toString().matches("AAAA|TTTT|CCCC|GGGG")) {
                    count++;
                }
            }
        }

        // Verificar diagonales
        for (int i = 0; i <= n - 4; i++) {
            for (int j = 0; j <= n - 4; j++) {
                StringBuilder sequence1 = new StringBuilder();
                StringBuilder sequence2 = new StringBuilder();
                for (int k = 0; k < 4; k++) {
                    sequence1.append(dna[i + k].charAt(j + k));
                    sequence2.append(dna[i + k].charAt(j + 3 - k));
                }
                if (sequence1.toString().matches("AAAA|TTTT|CCCC|GGGG") || sequence2.toString().matches("AAAA|TTTT|CCCC|GGGG")) {
                    count++;
                }
            }
        }

        return count > 1;
    }

    public static boolean isValidDnaSequence(String sequence) {
        return sequence.matches("[ATCGatcg]+");
    }
}

