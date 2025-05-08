import Utilidades.RandomUtilities;
import Utilidades.ScannerManager;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var tamano = ScannerManager.leerInt(scanner, "ingrese el tamaño del array");
        final var min = ScannerManager.leerInt(scanner, "ingrese el min");
        final var max = ScannerManager.leerInt(scanner, "ingerese el max");
        final var escalar = ScannerManager.leerInt(scanner, "ingrese el escalar");

        scanner.close();
        final var random = new Random();
        final var arrayOriginal = RandomUtilities.generarRandomArrayInt(tamano, min, max, random);
        final var arrayNuevo = calcularProductoEscalar(arrayOriginal, escalar);

        imprimirResultado(arrayOriginal, arrayNuevo);

    }
    static int[] calcularProductoEscalar(int[] array, int escalar){
        final var n = array.length;
        final var nuevoArray = new int[n];

        for (var i = 0; i < n; i++) {
            nuevoArray[i] = array[i] * escalar;
        }
        return nuevoArray;
    }
    static void imprimirResultado (int[] arrayOriginal, int[] nuevoArray){
        System.out.printf("el array original es: %s %n", Arrays.toString(arrayOriginal));
        System.out.printf("el array nuevo es: %s",
                Arrays.toString(nuevoArray));
    }
}
