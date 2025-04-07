/*
    Aumentar valor 1 - ++
    Decrementar valor 1 - --
    Aumentar valor en n - +=
    Decrementar valor en n - -=

    se usan mas en int
 */


import Utilidades.RandomUtilities;
import Utilidades.ScannerManager;

import java.util.Random;
import java.util.Scanner;


public class IncrementarDecrementoVariables {
    public static void main(String[] args) {
       final var scanner = new Scanner(System.in);
       var numero = ScannerManager.leerInt(scanner, "ingrese un numero");
       scanner.close();
       numero++;
       System.out.printf("El numero es %d%n", numero);
       final var n = RandomUtilities.generarRandomInt(3, 10, new Random());
       numero += n;
        System.out.printf("El numero es %d", numero);
    }
}
