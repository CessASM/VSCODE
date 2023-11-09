package Practicas;
import java.util.Scanner;
public class Practica4 {
   /**
 * @param args
 */
public static void main(String[] args) {
    int[][] matriz = new int [2][4];
    //leer matriz
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Ingresa los elementos de la matriz:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    System.out.println("Matriz original:");
    for (int i = 0; i < 2; i++) {
         for(int j = 0; j < 4; j++) {
            System.out.print(matriz[i][j]+"");
         }
         System.out.println();
    }
    //Calcular la matriz transpuesta
    int[][] transpuesta = new int[2][4];
    for (int i = 0; i < 2; i++) {
         for(int j = 0; j < 4; j++) {
            transpuesta[j][i] = matriz[i][j];
         }
    }
    //Mostrar la matriz transpuesta
    System.out.println("Matriz transpuesta:");
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(transpuesta[j][i]+" ");
        }
        System.out.println();
    }
   }
}