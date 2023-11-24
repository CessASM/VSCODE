package Practicas;

public class U5P2 {
    public static void main(String[] args) {
        int[] arreglo = {5, 3, 8, 2, 1, 9, 4, 10};
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);
        ordenamientoBurbuja(arreglo);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
        }
        public static void ordenamientoBurbuja(int[] arreglo) {
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
}