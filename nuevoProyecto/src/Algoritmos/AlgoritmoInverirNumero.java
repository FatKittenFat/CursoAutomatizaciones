package Algoritmos;

import Utilidades.ScannerManager;

import java.util.Scanner;

public class AlgoritmoInverirNumero {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner, "ingrese numero:");
        scanner.close();
        final var nIvertido = invertirNumero(n);
        final var capicua = esCapicua(n, nIvertido);

        System.out.printf("El numero %d es capicua ? %b %n", n, capicua);

    }
    static int invertirNumero (int n){
        var aux = n;
        var inverso = 0;

        while (aux !=0){
            final var residuo = aux % 10;
            inverso = inverso * 10 + residuo;
            aux /= 10;
        }
        return inverso;
    }

    static boolean esCapicua (int n, int nInvertido){
        return  n == nInvertido;
    }
}
