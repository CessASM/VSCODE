package tareas;

public class Tarea1U5 {
    public static int encontrarMinimo(int[] arreglo) {
        int minimo = arreglo[0]; // Asignamos el primer elemento como el valor mínimo inicial
        int[] arregloEnteros = {5, 2, 8, 1, 9};
        int minimoEnteros = encontrarMinimo(arregloEnteros);
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i]; 
                // Actualizamos el valor mínimo si encontramos un elemento más pequeño
                
            }
            System.out.println("El valor mínimo en el arreglo de enteros es: " + minimoEnteros);
        }
        return minimo;
    }
    public static double encontrarMinimo(double[] arreglo) {
        double minimo = arreglo[0];
        double[] arregloDoubles = {3.2, 1.5, 6.7, 2.4};
        double minimoDoubles = encontrarMinimo(arregloDoubles);
        // Asignamos el primer elemento como el valor mínimo inicial
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
                // Actualizamos el valor mínimo si encontramos un elemento más pequeño
            }
            System.out.println("El valor mínimo en el arreglo de doubles es: " + minimoDoubles);
        }
        return minimo;
    }
}