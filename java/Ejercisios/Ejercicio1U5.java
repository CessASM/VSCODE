package Ejercisios;
import java.util.Scanner;
public class Ejercicio1U5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el tamaño del arreglo: ");
            int n = scanner.nextInt();
            // Crear el arreglo
            int[] arreglo = new int[n];
                    // Ingresar elementos al arreglo
                    System.out.println("Ingrese los elementos del arreglo:");
                    for (int i = 0; i < n; i++) {
                        System.out.print("Elemento " + (i+1) + ": ");
                        arreglo[i] = scanner.nextInt();
                    }
                    // Imprimir el contenido del arreglo
                    System.out.println("Contenido del arreglo:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(arreglo[i]);
            }
        }
    }
}