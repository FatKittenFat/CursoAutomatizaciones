import Utilidades.ScannerManager;

import java.util.Scanner;

public class CompararNumeros2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        var a = ScannerManager.leerInt(scanner, "Ingrese el primer numero");
        var b = ScannerManager.leerInt(scanner, "Ingrese el segundo numero");
        scanner.close();
        final  var c = sonIguales(a,b);
        imprimirResultado(a,b,c);

    }
    static boolean sonIguales (int a, int b){
        return a == b;
    }
    static void imprimirResultado (int a, int b, boolean esIgual){
        System.out.printf("El numero %d es igual a %d? %b%n",a ,b,esIgual);
    }
}
