package Practicas;

public class practica1 {
    public static void main(String[] args) {
            // Capturar los 3 arreglos de 5 posiciones
            int[] arreglo1 = {2, 4, 6, 8, 10};
            int[] arreglo2 = {1, 3, 5, 7, 9};
            int[] arreglo3 = {11, 12, 13, 14, 15};
    
            // Multiplicar el primer arreglo por el segundo y sumarle el tercero
            int[] arregloResultado = new int[5];
            for (int i = 0; i < 5; i++) {
                arregloResultado[i] = (arreglo1[i] * arreglo2[i]) + arreglo3[i];
            }
    
            // Mostrar el resultado en pantalla
            System.out.println("El arreglo resultado es:");
            for (int i = 0; i < 5; i++) {
                System.out.print(arregloResultado[i] + " ");
            }
        }
    }