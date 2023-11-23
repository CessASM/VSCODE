package Herramientas;
import java.util.Scanner;
public class Herramienta {
    public int[] crearArregloInt(int n) {
        int[] arreglo = new int[n];
        try (Scanner scanner = new Scanner(System.in)) {
            for(int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor de la posicion"+i+": ");
                arreglo[i] = scanner.nextInt();
            }
        }
        return arreglo;
    }
    public double[] crearArregloDouble(int n) {
        double[] arreglo = new double[n];
        try (Scanner scanner = new Scanner(System.in)) {
            for(int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor de la posicion "+i+":");
                arreglo[i] = scanner.nextDouble();
            }
        }
        return arreglo;
    }
    public int[][] crearMatrizInt(int m, int n) {
        int[][] matriz = new int[m][n];
        try (Scanner scanner = new Scanner(System.in)) {
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print("Ingrese el valor para la posicion ("+i+","+j+"): ");
                    matriz[i][j] = scanner.nextInt();
                }
            }
        }
        return matriz;
    }
    public double[][] crearMatrizDouble(int m, int n) {
        double[][] matriz = new double[m][n];
        try (Scanner scanner = new Scanner(System.in)) {
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print("Ingrese el valor para la posicion ("+i+","+j+"): ");
                    matriz[i][j] = scanner.nextDouble();
                }
            }
        }
        return matriz;
    }
    public int encontrarValorMin(int[] x) {
        int min = x[0];
        for(int i = 1; i < x.length; i++) {
            if(x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }
    public double encontrarValorMin(double[] x) {
        double min = x[0];
        for(int i = 1; i < x.length; i++) {
            if(x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }
    public int encontrarValorMax(int[] x) {
        int max = x[0];
        for(int i = 1; i < x.length; i++) {
            if(x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }
    public double encontrarValorMax(double[] x) {
        double max = x[0];
        for(int i = 1; i < x.length; i++) {
            if(x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }
    public int encontrarValor(int[] x, int valor) {
        for(int i = 0; i < x.length; i++) {
            if(x[i] == valor) {
                return i;
            }
        }
        return -1; //valor no encontrado
    }
}