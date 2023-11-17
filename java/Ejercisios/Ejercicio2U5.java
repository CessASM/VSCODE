package Ejercisios;

public class Ejercicio2U5 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        // Ejemplo de arreglo
        mostrarArreglo(arreglo);
    }
    public static void mostrarArreglo(int[] arreglo) {
        System.out.println("Contenido del arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}