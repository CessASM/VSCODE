package Practicas;
import java.util.Scanner;
public class practica2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Capturar arreglo de 10 posiciones
            int[] arreglo1 = new int[10];
            System.out.println("Ingresa los valores del arreglo:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Posición " + i + ": ");
                arreglo1[i] = scanner.nextInt();
            }

            // Llenar segundo arreglo con valores en posición contraria
            int[] arreglo2 = new int[10];
            for (int i = 0; i < 10; i++) {
                arreglo2[9 - i] = arreglo1[i];
            }

            // Mostrar segundo arreglo
            System.out.println("El segundo arreglo con los valores en posición contraria es:");
            for (int i = 0; i < 10; i++) {
                System.out.print(arreglo2[i] + " ");
            }
        }
    }
}