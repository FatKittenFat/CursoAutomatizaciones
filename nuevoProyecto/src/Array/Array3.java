package Array;

import Utilidades.RandomUtilities;
import Utilidades.ScannerManager;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var tamArray = ScannerManager.leerInt(scanner, "ingrese tamaño del array");
        final var min = ScannerManager.leerInt(scanner, "ingrese el min");
        final var max = ScannerManager.leerInt(scanner, "ingrese el max");
        scanner.close();

        final var random = new Random();
        final var array1 = RandomUtilities.generarRandomArrayInt(tamArray, min, max, random);
        final var array2 = RandomUtilities.generarRandomArrayInt(tamArray, min, max, random);

        final var suma = calcularSuma(array1, array2);
        imprimirResultado(array1, array2, suma);

    }
    static int[] calcularSuma(int[] array1, int[] array2){
        final var n = array1.length;
        final var arraySuma = new int[n];
        for (int i = 0; i < n; i++) {
            arraySuma[i] = array1[i] + array2[i];
        }

        return arraySuma;
    }

    static void imprimirResultado(int[] array1, int[] array2, int[] resultado){
        System.out.printf("array1: %s %n", Arrays.toString(array1));
        System.out.printf("array2: %s %n", Arrays.toString(array2));
        System.out.printf("resultado de la suma: %s", Arrays.toString(resultado));
    }
}
