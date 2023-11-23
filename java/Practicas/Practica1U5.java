package Practicas;
import Herramientas.Herramienta;
public class Practica1U5 {
    public static void main(String[] args) {
        Herramienta herramientas = new Herramienta();
        int[] arregloEnteros = herramientas.crearArregloInt(5);
        double[] arregloDoubles = herramientas.crearArregloDouble(3);
        int[][] matrizEnteros = herramientas.crearMatrizInt(2, 3);
        double[][] matrizDoubles = herramientas.crearMatrizDouble(2, 3);
        int minEnteros = herramientas.encontrarValorMin(arregloEnteros);
        double minDoubles = herramientas.encontrarValorMin(arregloDoubles);
        int maxEnteros = herramientas.encontrarValorMax(arregloEnteros);
        double maxDoubles = herramientas.encontrarValorMax(arregloDoubles);
        int posicionValor = herramientas.encontrarValor(arregloEnteros, 10);
        System.out.println("Valor minimo de arregloEnteros: "+minEnteros);
        System.out.println("Valor minimo de arregloDoubles: "+minDoubles);
        System.out.println("Valor maximo de arregloEnteros: "+maxEnteros);
        System.out.println("Valor maximo de arregloDoubles: "+maxDoubles);
        if(posicionValor != -1) {
            System.out.println("El valor 10 se encuentra en la posicion "+posicionValor+" de arregloEnteros");
        }else{
            System.out.println("El valor 10 no se encuentra en arregloEnteros");
        }
    }
}