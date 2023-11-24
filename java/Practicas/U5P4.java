package Practicas;

public class U5P4 {
    public static void main(String[] args) {
        int[] votos = {1, 5, 2, 3, 1, 2, 4, 3, 3, 2, 5, 2, 5, 3, 2, -1};
        int[] resultados = contarVotos(votos);
        mostrarResultados(resultados);
        mostrarGanador(resultados, votos.length - 1);
    }
    public static int[] contarVotos(int[] votos) {
        int[] resultados = new int[5];
        for (int i = 0; i < votos.length; i++) {
            int voto = votos[i];
            if (voto == -1) {
                break;
            }
            resultados[voto - 1]++;
        }
        return resultados;
    }
    public static void mostrarResultados(int[] resultados) {
        System.out.println("Número de votos por candidato:");
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + resultados[i]);
        }
        System.out.println();
    }
    public static void mostrarGanador(int[] resultados, int totalVotos) {
    int maxVotos = 0;
    int candidatoGanador = 0;
    for (int i = 0; i < resultados.length; i++) {
        if (resultados[i] > maxVotos) {
            maxVotos = resultados[i];
            candidatoGanador = i + 1;
        }
    }
    double porcentaje = (double) maxVotos / totalVotos * 100;
    System.out.println("Candidato ganador: " + candidatoGanador);
    System.out.println("Número de votos: " + maxVotos);
    System.out.println("Porcentaje de votos: " + porcentaje + "%");
    }
}