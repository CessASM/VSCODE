package Practicas;
public class Practica6 {
    public static void main(String[] args) {
    String cadena = "anita lava la tina";
    
    // Elimina los espacios y convierte la cadena a minúsculas
    cadena = cadena.replaceAll("\\s", "").toLowerCase();
    
    // Comprueba si la cadena es un palíndromo
    boolean esPalindromo = true;
    int longitud = cadena.length();
    for (int i = 0; i < longitud / 2; i++) {
    if (cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
    esPalindromo = false;
    break;
    }
    }
    
    // Muestra el resultado
    if (esPalindromo) {
    System.out.println("La cadena es un palíndromo");
    } else {
    System.out.println("La cadena no es un palíndromo");
    }
    }
    }