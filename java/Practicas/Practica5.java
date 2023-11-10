package Practicas;
public class Practica5 {
    public static void main(String[] args) {
    int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
        };
        int fila = 0;
        int columna = 0;
        boolean puntoDeSilla = false;
        // Recorre cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
        int minimoFila = matriz[i][0];
        int columnaMinimo = 0;
        // Encuentra el valor mínimo en la fila
        for (int j = 1; j < matriz[i].length; j++) {
        if (matriz[i][j] < minimoFila) {
        minimoFila = matriz[i][j];
        columnaMinimo = j;
        }
        }
        // Comprueba si el mínimo de la fila es el máximo de la columna correspondiente
        boolean esPuntoDeSilla = true;
        for (int k = 0; k < matriz.length; k++) {
        if (matriz[k][columnaMinimo] > minimoFila) {
        esPuntoDeSilla = false;
        break;
        }
        }
        // Si es un punto de silla, actualiza las variables y muestra el resultado
        if (esPuntoDeSilla) {
        fila = i;
        columna = columnaMinimo;
        puntoDeSilla = true;
        break;
        }
        }
        // Mostrar el resultado
        if (puntoDeSilla) {
        System.out.println("El punto de silla se encuentra en la posición (" + fila + ", " + columna + ")");
        } else {
        System.out.println("No se encontró ningún punto de silla en la matriz");
        }
        }
        }