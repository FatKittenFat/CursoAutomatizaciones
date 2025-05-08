import Utilidades.RandomUtilities;

import java.util.Arrays;
import java.util.Random;

/*
BubbleSort
algoritmo de ordenamiento
(n-1) pasos del array = n
los pasos se inician con 0 en el for
 */
public class BubbleSort {
    public static void main(String[] args) {
        final var random = new Random();
        final var arrayAleatorio = RandomUtilities.generarRandomArrayInt(30,10, 500, random);
        imprimirArray(arrayAleatorio);

        ordenarArrayMin(arrayAleatorio);
        ordenarArrayMax(arrayAleatorio);

        imprimirArray(arrayAleatorio);

    }
    static void ordenarArrayMin(int[] array){
        final var n = array.length; // se declara la longitud del array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(array[j] > array[j + 1]){
                    final var temp = array[j];
                    array[j] = array[j +1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    static void ordenarArrayMax(int[] array){
        final var n = array.length; // se declara la longitud del array

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(array[j] < array[j + 1]){
                    final var temp = array[j];
                    array[j] = array[j +1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    static void imprimirArray (int[] arrayOriginal){
        System.out.printf("Array original %s %n", Arrays.toString(arrayOriginal));
    }
}
