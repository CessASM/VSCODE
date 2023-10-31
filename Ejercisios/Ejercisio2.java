package Ejercisios;
import java.util.Scanner;
public class Ejercisio2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el numero de filas de la matriz:");
    int filas = scanner.nextInt();
    System.out.print("Ingrese el numero de columnas de la matriz:");
    int columnas = scanner.nextInt();
    int[][] matriz = new int[filas][columnas];
    System.out.println("Ingrese los elementos de la matriz:");
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            matriz[i][j] = scanner.nextInt();
        }
    }
    int sumaPositivos = 0;
    int sumaNegativos = 0;
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            if (matriz[i][j] > 0) {
                sumaPositivos += matriz[i][j];
            }else if(matriz[i][j] < 0) {
                sumaNegativos += matriz[i][j];
            }
        }
    }
    System.out.println("La suma de los elementos positivos es: "+sumaPositivos);
    System.out.println("La suma de los elemtos negativos es: "+sumaNegativos);
    scanner.close();
    }
}