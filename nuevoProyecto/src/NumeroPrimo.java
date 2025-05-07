import Utilidades.ScannerManager;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner, "ingrese numero");
        scanner.close();
        final var primo = calcularNumero(n);
        System.out.printf("El numero es primo: %b",primo);
    }

    static boolean calcularNumero (int numero){
        var i = 2;
        while (i < numero){
            if(numero % i != 0){
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
