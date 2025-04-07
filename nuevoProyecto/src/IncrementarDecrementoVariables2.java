import Utilidades.RandomUtilities;
import Utilidades.ScannerManager;

import java.util.Random;
import java.util.Scanner;

public class IncrementarDecrementoVariables2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        var numero = ScannerManager.leerInt(scanner, "Ingrese un numero");
        numero --;
        System.out.printf("El numero es: %d%n", numero);
        final var randomNum = RandomUtilities.generarRandomInt(3,10, new Random());
        numero -=randomNum;
        System.out.printf("El numero es: %d%n", numero);

    }
}
