package Ejercisios.tareas;
import java.util.Scanner;
public class tarea2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de productos: ");
            int cantidadProductos = scanner.nextInt();

            // Crear arreglos para almacenar la cantidad y precio de cada producto
            int[] cantidades = new int[cantidadProductos];
            double[] precios = new double[cantidadProductos];

            // Capturar la cantidad y precio de cada producto
            for (int i = 0; i < cantidadProductos; i++) {
                System.out.print("Ingrese la cantidad del producto " + (i + 1) + ": ");
                cantidades[i] = scanner.nextInt();
                System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
                precios[i] = scanner.nextDouble();
            }

            // Calcular el costo total del plato
            double costoTotal = 0;
            for (int i = 0; i < cantidadProductos; i++) {
                costoTotal += cantidades[i] * precios[i];
            }

            // Mostrar el costo total del plato
            System.out.println("El costo total del plato es: " + costoTotal);
        }
    }

}
