package Practicas;
import java.util.Scanner;
public class practica3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cantidadEstudiantes = 10;
            int[] matriculas = new int[cantidadEstudiantes];
            double[][] calificaciones = new double[cantidadEstudiantes][3];

            // Capturar información de los estudiantes
            System.out.println("Ingresa la información de los estudiantes:");
            for (int i = 0; i < cantidadEstudiantes; i++) {
                System.out.println("Estudiante " + (i + 1) + ":");
                System.out.print("Matrícula: ");
                matriculas[i] = scanner.nextInt();
                for (int j = 0; j < 3; j++) {
                    System.out.print("Calificación Parcial " + (j + 1) + ": ");
                    calificaciones[i][j] = scanner.nextDouble();
                }
            }

            // Calcular y mostrar el promedio por alumno
            System.out.println("\nPromedio por alumno:");
            for (int i = 0; i < cantidadEstudiantes; i++) {
                double promedio = calcularPromedio(calificaciones[i]);
                System.out.println("Estudiante " + (i + 1) + ": " + promedio);
            }

            // Calcular y mostrar el promedio del grupo
            System.out.println("\nPromedio del grupo:");
            double promedioGrupo = calcularPromedioGrupo(calificaciones);
            System.out.println(promedioGrupo);
        }
    }

    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public static double calcularPromedioGrupo(double[][] calificaciones) {
        double suma = 0;
        int totalCalificaciones = 0;
        for (double[] estudianteCalificaciones : calificaciones) {
            for (double calificacion : estudianteCalificaciones) {
                suma += calificacion;
                totalCalificaciones++;
            }
        }
        return suma / totalCalificaciones;
    }
}