package Array;

import Utilidades.RandomUtilities;
import Utilidades.ScannerManager;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var tamArray = ScannerManager.leerInt(scanner, "ingrese tamaño del array");
        final var min = ScannerManager.leerInt(scanner, "ingrese minimo");
        final var max = ScannerManager.leerInt(scanner, "ingrese maximo");
        scanner.close();

        final var random = new Random();
        final var radioC = RandomUtilities.generarRandomArrayDouble(tamArray, min, max, random);

        final var resultadoArea = calcularArrayArea(radioC);
        final var resultadoPerimetro = calcularArrayPerimetro(radioC);
        imprimirResultado(radioC, resultadoPerimetro, resultadoArea);
    }
    static double[] calcularArrayPerimetro (double[] radioC){
        final var n = radioC.length;
        var perimetro = new double[n];

        for (int i = 0; i < n; i++) {
            perimetro[i] = 2 * Math.PI * radioC[i];
        }
        return perimetro;
    }
    static double[] calcularArrayArea (double[] radioC){
        final var n = radioC.length;
        var area = new double[n];

        for (int i = 0; i < n; i++) {
            area[i] = Math.PI * Math.pow(radioC[i], 2);
        }
        return area;
    }
    static void imprimirResultado (double[] radioC, double[] perimetro, double[] area){
        System.out.printf("el array de radio es %s %n", Arrays.toString(radioC));
        System.out.printf("el array de perimetro es %s %n", Arrays.toString(perimetro));
        System.out.printf("el array de area es %s", Arrays.toString(area));
    }
}
