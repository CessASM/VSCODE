package tareas;

public class Tarea1U5 {
    public static int findMinValue(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
    // Método estático para encontrar el valor más pequeño en un arreglo de doubles
    public static double findMinValue(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }
        double minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
        int[] intArray = {3, 1, 4, 1, 5, 9, 2, 6};
        double[] doubleArray = {3.14, 2.71, 1.618, 0.577, 2.718};

        int minIntValue = findMinValue(intArray);
        double minDoubleValue = findMinValue(doubleArray);
        System.out.println("El valor más pequeño en el arreglo de enteros es: " + minIntValue);
        System.out.println("El valor más pequeño en el arreglo de doubles es: " + minDoubleValue);
    }
}