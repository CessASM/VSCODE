package Practicas;

public class U5P3 {
    public static void main(String[] args) {
        int[] arreglo = {50, 20, 10, 60, 70, 80, 90, 40};
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);
        bubbleSort(arreglo);
        System.out.println("Arreglo ordenado en forma ascendente:");
        imprimirArreglo(arreglo);
        System.out.println("Arreglo ordenado en forma descendente:");
        imprimirDescendente(arreglo);
    }
    public static void bubbleSort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
    public static void imprimirDescendente(int[] arreglo) {
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}