package tareas;
public class Tarea2U5 {
    // Método estático para encontrar el índice del valor más pequeño en un arreglo de enteros
        public static int findMinIndex(int[] array) {
            if (array.length == 0) {
                throw new IllegalArgumentException("El arreglo no puede estar vacío");
            }
    
            int minIndex = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            return minIndex;
        }
        // Método estático para encontrar el índice del valor más pequeño en un arreglo de doubles
        public static int findMinIndex(double[] array) {
            if (array.length == 0) {
                throw new IllegalArgumentException("El arreglo no puede estar vacío");
            }
            int minIndex = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            return minIndex;
        }
        public static void main(String[] args) {
            int[] intArray = {3, 1, 4, 1, 5, 9, 2, 6};
            double[] doubleArray = {3.14, 2.71, 1.618, 0.577, 2.718};
    
            int minIntIndex = findMinIndex(intArray);
            int minDoubleIndex = findMinIndex(doubleArray);
    
            System.out.println("El índice del valor más pequeño en el arreglo de enteros es: " + minIntIndex);
            System.out.println("El índice del valor más pequeño en el arreglo de doubles es: " + minDoubleIndex);
        }
    }