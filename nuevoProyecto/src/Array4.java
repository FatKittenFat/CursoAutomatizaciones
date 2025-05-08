import Utilidades.RandomUtilities;
import Utilidades.ScannerManager;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var tamaArray = ScannerManager.leerInt(scanner, "ingrese tamaño del array");
        final var min = ScannerManager.leerInt(scanner, "ingrese el minimo");
        final var max = ScannerManager.leerInt(scanner, "ingrese el maximo");
        scanner.close();

        final var random = new Random();
        final var array1 = RandomUtilities.generarRandomArrayDouble(tamaArray, min, max, random);
        final var array2 = RandomUtilities.generarRandomArrayDouble(tamaArray, min, max, random);

        final var resultado = calcularPromedio(array1, array2);
        imprimirResultado(array1, array2, resultado);

    }
    static double calcularPromedio (double[] array1, double[] array2){
        final var n = array1.length;
        var numerador = 0.0;
        for (int i = 0; i < n; i++) {
            numerador += array1[i] * array2[i];
        }
        return numerador/n;
    }
    static void imprimirResultado (double[] array1, double[] array2, double promedio){
        System.out.printf("el primer array es %s %n", Arrays.toString(array1));
        System.out.printf("el segundo array es %s %n", Arrays.toString(array2));
        System.out.printf("el promedio es %f.2", promedio);
    }
}
