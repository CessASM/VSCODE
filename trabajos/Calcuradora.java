package trabajos;
import java.util.Scanner;
public class Calcuradora {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Seleccione la operacion que desea realizar: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Divicion");
        int operacion = scanner.nextInt();
        double resultado = 0;
        switch (operacion) {
            case 1: resultado = numero1 + numero2;
            break;
            case 2: resultado = numero1 - numero2;
            break;
            case 3: resultado = numero1 * numero2;
            break;
            case 4: resultado = numero1 / numero2;
            break;
            default:
            System.out.println("Opercion invalida");
            return;
        }
        System.out.println("El resultdo es: " + resultado);
    }
}
}