package tareas;
public class Tarea3U5 {
            // Método estático para encontrar un valor en un arreglo de enteros
            public static int findValue(int[] array, int value) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == value) {
                        return i; // Devuelve el índice si encuentra el valor
                    }
                }
                return -1; // Devuelve -1 si el valor no se encuentra en el arreglo
            }
            // Método estático para encontrar un valor en un arreglo de doubles
            public static int findValue(double[] array, double value) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == value) {
                        return i; // Devuelve el índice si encuentra el valor
                    }
                }
                return -1; // Devuelve -1 si el valor no se encuentra en el arreglo
            }
            public static void main(String[] args) {
                int[] intArray = {3, 1, 4, 1, 5, 9, 2, 6};
                double[] doubleArray = {3.14, 2.71, 1.618, 0.577, 2.718};
                int indexInt = findValue(intArray, 5);
                int indexDouble = findValue(doubleArray, 1.618);
                System.out.println("El índice del valor en el arreglo de enteros es: " + indexInt);
                System.out.println("El índice del valor en el arreglo de doubles es: " + indexDouble);
        }
    }