package ComparacionNumeros;

public class CompararNumeros3 {
    public static void main(String[] args) {
        final var scaneer = new java.util.Scanner(System.in);
        final var numeroLeido = Utilidades.ScannerManager.leerInt(scaneer, "Ingrese numero");
        scaneer.close();
        imprimirResultado(numeroLeido, esPar(numeroLeido), esMultiplo(numeroLeido));
    }

    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    static boolean esMultiplo(int numero) {
        return numero % 5 == 0;
    }

    static void imprimirResultado(int numero, boolean esPar, boolean esMultiplo5) {
        System.out.printf("El numero %d es par? %b%n", numero, esPar);
        System.out.printf("El numero %d es multiplo de 5 = %b%n", numero, esMultiplo5);
    }
}
