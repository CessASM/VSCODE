package Ejercisios.tareas;
import java.util.Scanner;
public class tarea1{
    public static void main(String[] args){
        int[] arreglo = new int[10];
        try (Scanner scanner = new Scanner(System.in)) {
            //Hecer un arreglo de 10 posiciones
            for (int i = 0; i < arreglo.length; i++){
                System.out.print("Ingrese el numero para la posicion"+i+": ");
                arreglo[i] = scanner.nextInt();
            }
            //pedir numero buscado
            System.out.print("Ingrese el numero que desea buscar ");
            int  numeroBuscar = scanner.nextInt();
            //Buscar el numero si se encuentra en el arreglo e indicar su posicion
            boolean encontrado = false;
            int posicion = -1;
            for (int i = 0; i < arreglo.length; i++){
                if (arreglo[i] == numeroBuscar) {
                    encontrado = true;
                    posicion = i;
                    break;
                }
            } 
            // resultado if
            if (encontrado) {
                System.out.println("El numero " + numeroBuscar + "se encuentra el la posicion " + posicion);
            }else{
            System.out.println("El numero " + numeroBuscar + "se encuentra el arreglo");
            }
        }
    }
}