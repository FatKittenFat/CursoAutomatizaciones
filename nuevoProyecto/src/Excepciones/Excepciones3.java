package Excepciones;

import Utilidades.ScannerManager;

import java.util.Scanner;

public class Excepciones3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var numeroLeido = ScannerManager.leerInt(scanner, "Ingrese el numero");
        scanner.close();
        mostrarContador(numeroLeido);

    }

    static void esperar (long n) { // long es similar a el int
        try{
            Thread.sleep(n * 1000);
        }catch (InterruptedException interruptedException){
            System.out.printf("InterruptedException: %s%n", interruptedException);
            System.out.printf("Error al esperar");
        }
    }

    static void mostrarContador (int n){
        for (int i = 0; i < n; i++) {
            System.out.println(i+1);
            esperar(1);
        }
    }
}
