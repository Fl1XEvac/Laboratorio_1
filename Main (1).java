import java.util.Arrays;

public class Main {
    /* Ejercicio 1
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] resultMatrix = sumMatrices(matrix1, matrix2);

        System.out.println("Matriz Resultante:");
        printMatrix(resultMatrix);
    }

    public static int[][] sumMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

     */
    /* Ejercicio 2

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("Matriz Resultante:");
        printMatrix(resultMatrix);
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            System.out.println("No se pueden multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            return null;
        }

        int[][] resultMatrix = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

     */
    /*Ejercicio 3
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] transposedMatrix = transposeMatrix(matrix);

        System.out.println("Matriz Transpuesta:");
        printMatrix(transposedMatrix);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

     */
    /* Ejercicio 4
    public static void main(String[] args) {
        int[][] symmetricMatrix = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};

        int[][] nonSymmetricMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("La matriz symmetricMatrix es simétrica: " + isSymmetric(symmetricMatrix));
        System.out.println("La matriz nonSymmetricMatrix es simétrica: " + isSymmetric(nonSymmetricMatrix));
    }

    public static boolean isSymmetric(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

     */
    /* Ejercicio 5
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5};
        int scalar = 2;

        int[] resultVector = scalarProduct(vector, scalar);

        System.out.println("Vector Resultante:");
        printVector(resultVector);
    }

    public static int[] scalarProduct(int[] vector, int scalar) {
        int length = vector.length;
        int[] resultVector = new int[length];

        for (int i = 0; i < length; i++) {
            resultVector[i] = vector[i] * scalar;
        }

        return resultVector;
    }

    public static void printVector(int[] vector) {
        for (int value : vector) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

     */
    /* Ejercicio 6
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = sumMatrixElements(matrix);

        System.out.println("La suma de los elementos de la matriz es: " + sum);
    }

    public static int sumMatrixElements(int[][] matrix) {
        int sum = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }

        return sum;
    }

     */
    /* Ejercicio 7
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 3},
                {4, 2, 6},
                {7, 8, 9}
        };

        MaxElementInfo maxElementInfo = findMaxElement(matrix);

        System.out.println("El elemento máximo es: " + maxElementInfo.value);
        System.out.println("Posición del elemento máximo: Fila " + maxElementInfo.row + ", Columna " + maxElementInfo.col);
    }

    public static MaxElementInfo findMaxElement(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int maxElement = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new MaxElementInfo(maxElement, maxRow, maxCol);
    }

    static class MaxElementInfo {
        int value;
        int row;
        int col;

        MaxElementInfo(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

     */
    /* Ejercicio 8
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rowToSum = 1;

        int sum = sumRow(matrix, rowToSum);

        System.out.println("La suma de la fila " + rowToSum + " es: " + sum);
    }

    public static int sumRow(int[][] matrix, int row) {
        int sum = 0;
        int cols = matrix[0].length;

        if (row < 0 || row >= matrix.length) {
            System.out.println("Fila no válida.");
            return -1;
        }

        for (int j = 0; j < cols; j++) {
            sum += matrix[row][j];
        }

        return sum;
    }

     */
    /*Ejercicio 9
    public static void main(String[] args) {
        int[][] diagonalMatrix = {
                {2, 0, 0},
                {0, 5, 0},
                {0, 0, 9}
        };

        int[][] nonDiagonalMatrix = {
                {1, 4, 2},
                {9, 5, 1},
                {8, 6, 9}
        };

        System.out.println("La matriz diagonalMatrix es diagonal: " + isDiagonalMatrix(diagonalMatrix));
        System.out.println("La matriz nonDiagonalMatrix es diagonal: " + isDiagonalMatrix(nonDiagonalMatrix));
    }

    public static boolean isDiagonalMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

     */
    /* Ejercicio 10
    public static void main(String[] args) {
        int[][] identityMatrix = generateIdentityMatrix(3);

        System.out.println("Matriz Identidad 3x3:");
        printMatrix(identityMatrix);
    }

    public static int[][] generateIdentityMatrix(int n) {
        int[][] identityMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                identityMatrix[i][j] = (i == j) ? 1 : 0;
            }
        }

        return identityMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

     */
    /* Ejercicio 11
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int[] countResult = countEvenOddElements(matrix);

        // Imprimir el resultado
        System.out.println("Cantidad de elementos pares: " + countResult[0]);
        System.out.println("Cantidad de elementos impares: " + countResult[1]);
    }

    public static int[] countEvenOddElements(int[][] matrix) {
        int[] countResult = new int[2];

        for (int[] row : matrix) {
            for (int value : row) {
                if (value % 2 == 0) {
                    countResult[0]++;
                } else {
                    countResult[1]++;
                }
            }
        }

        return countResult;
    }

     */
    /* Ejercicio 12
    public static void main(String[] args) {
        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotatedMatrix = rotateMatrix(originalMatrix);

        // Imprimir la matriz original y la matriz rotada
        System.out.println("Matriz Original:");
        printMatrix(originalMatrix);

        System.out.println("\nMatriz Rotada 90 grados en sentido horario:");
        printMatrix(rotatedMatrix);
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] rotatedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

     */
    /* Ejercicio 13
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 2, 6},
                {7, 8, 2}
        };

        int targetValue = 2;

        int occurrences = countOccurrences(matrix, targetValue);

        System.out.println("El valor " + targetValue + " aparece " + occurrences + " veces en la matriz.");
    }

    public static int countOccurrences(int[][] matrix, int targetValue) {
        int count = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                if (value == targetValue) {
                    count++;
                }
            }
        }

        return count;
    }

     */
    /* Ejercicio 14
    public static void main(String[] args) {
        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] invertedMatrix = invertRows(originalMatrix);

        System.out.println("Matriz Original:");
        printMatrix(originalMatrix);

        System.out.println("\nMatriz con Filas Invertidas:");
        printMatrix(invertedMatrix);
    }

    public static int[][] invertRows(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] invertedMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                invertedMatrix[rows - 1 - i][j] = matrix[i][j];
            }
        }

        return invertedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

     */
    /* Ejercicio 15
    public static void main(String[] args) {
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = sumDiagonals(squareMatrix);
        System.out.println("La suma de todas las diagonales de la matriz es: " + sum);
    }

    public static int sumDiagonals(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            System.out.println("La matriz no es cuadrada.");
            return -1;
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            sum += matrix[i][i];
        }

        for (int i = 0; i < rows; i++) {
            sum += matrix[i][rows - 1 - i];
        }

        return sum;
    }

     */
    /* Ejercicio 16
    public static void main(String[] args) {
        double[][] orthogonalMatrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        double[][] nonOrthogonalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("La matriz orthogonalMatrix es ortogonal: " + isOrthogonalMatrix(orthogonalMatrix));
        System.out.println("La matriz nonOrthogonalMatrix es ortogonal: " + isOrthogonalMatrix(nonOrthogonalMatrix));
    }

    public static boolean isOrthogonalMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            return false;
        }

        double[][] transposeMatrix = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        double[][] inverseMatrix = inverseMatrix(matrix);

        return Arrays.deepEquals(transposeMatrix, inverseMatrix);
    }

    public static double[][] inverseMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        return new double[rows][cols];
    }

     */
    /* Ejercicio 17
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 2, 8},
                {4, 7, 1},
                {9, 3, 6}
        };

        int[] minValues = findMinValuesInEachRow(matrix);

        for (int value : minValues) {
            System.out.println(value);
        }
    }

    public static int[] findMinValuesInEachRow(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] minValues = new int[rows];

        for (int i = 0; i < rows; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minValues[i] = min;
        }

        return minValues;
    }

     */
    /* Ejercicio 18
    public static void main(String[] args) {
        int[][] matrix1 = {
                {2, 3},
                {4, 5},
                {6, 7}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] product = multiplyMatrices(matrix1, matrix2);

        if (product != null) {
            for (int[] row : product) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No es posible calcular el producto de las matrices.");
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            return null; // Matrices no compatibles para multiplicación
        }

        int[][] product = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                int sum = 0;
                for (int k = 0; k < cols1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                product[i][j] = sum;
            }
        }

        return product;
    }
     */
}