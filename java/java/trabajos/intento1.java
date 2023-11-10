package java.trabajos;
import java.util.Scanner;
public class intento1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
//juego sobre la adivinacion de un numero del 0 al 100
boolean jugar = true;
while(jugar) {
int numeroSecreto = (int)(Math.random()*100)+1;
int intentos = 0;
int numero;
boolean gano = false;
int limiteIntentos = 10;
System.out.println("Bienvenido al juego de adivinar el numero secreto.");
System.out.println("Estoy pensando en un numero del 1 al 100. ¡Adivina!");
while (!gano && intentos < limiteIntentos) {
    System.out.print("Ingresa el numero: ");
    numero = scanner.nextInt();
    intentos++;
    if (numero == numeroSecreto) {
        gano = true;
        System.out.println("¡Felicidades! Adivinaste el numero en "+intentos+" intentos.");
    }else if(numero < numeroSecreto) {
        System.out.println("El numero secreto es mayor. Sigue intentando.");
    }else{
        System.out.println("El nmero secreto es menor. Sigue intentando.");
    }
    }
    if(!gano) {
        System.out.println("¡Agotaste tus intentos! El numero secreto era:"+numeroSecreto);
    }
    System.out.print("¿Quieres jugar de nuevo? (s/n): ");
    String respuesta = scanner.next();
    if(!respuesta.equalsIgnoreCase("s")) {
        jugar = false;
    }
}
System.out.println("Grcias por jugar. !Hasta luego¡");
scanner.close();
}
}