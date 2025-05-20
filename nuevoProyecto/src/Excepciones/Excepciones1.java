package Excepciones;

import Utilidades.RandomUtilities;
import Utilidades.ScannerManager;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Excepciones1 {
    public static void main(String[] args) {
        final var arrayAleatorio = RandomUtilities.generarRandomArrayInt(5, 10,100, new Random());
        final var scanner = new Scanner(System.in);

        int indexLeido;
        do {
            mostrarArray(arrayAleatorio);
            indexLeido = ScannerManager.leerInt(scanner, "Ingrese el index deseado");
            if (indexLeido != -1){
                mostrarElementos(indexLeido, arrayAleatorio);
            }
        }while (indexLeido != -1);
        scanner.close();
    }

    static void mostrarElementos(int i, int[] array){
        try {
            final var elemento = array[i];
            System.out.printf("El elemento con index %s es %d%n%n", i, array[i]);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.err.printf("IndexOutOfBoundsException: %s%n", indexOutOfBoundsException.getLocalizedMessage());
            System.out.printf("Index no existente en el array %n");
        }
    }

    static void mostrarArray(int[] array){
        System.out.printf("El array es %s%n", Arrays.toString(array));
    }
}
