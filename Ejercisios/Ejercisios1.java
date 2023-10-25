package Ejercisios;
import java.util.Scanner;
public class Ejercisios1 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
// Leer la matriz
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa los valores de la matriz:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = scanner.nextInt();
                }
            }
            // Pedir el número de una fila
            System.out.println("Ingresa el número de una fila (1, 2 o 3):");
            int fila = scanner.nextInt();
            // Validar el número de fila ingresado
            if (fila < 1 || fila > 3) {
                System.out.println("Número de fila inválido");
            } else {
                // Encontrar el valor máximo de la fila
                int maximo = matriz[fila - 1][0];
                for (int j = 1; j < 3; j++) {
                    if (matriz[fila - 1][j] > maximo) {
                        maximo = matriz[fila - 1][j];
                    }
                }
                // Mostrar el valor máximo de la fila
                System.out.println("El valor máximo de la fila " + fila + " es: " + maximo);
            }
        }
    }
}