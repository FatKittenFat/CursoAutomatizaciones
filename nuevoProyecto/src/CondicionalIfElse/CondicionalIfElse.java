package CondicionalIfElse;

/*
Operador ternario:
    - return expresionBooleana? expresion1 : expresion2
 */
public class CondicionalIfElse {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);
        final var numJugador = Utilidades.ScannerManager.leerInt(scanner, "Escriba un numero entre 1 y 6");
        scanner.close();
        if (validarNumero(numJugador)) {
            final var numRandom = Utilidades.RandomUtilities.generarRandomInt(1, 6, new java.util.Random());
            mostrarMensaje(numJugador, numRandom);
        } else {
            System.out.printf("Numero no valido");
        }
    }

    static boolean validarNumero(int numero) {
        return (numero >= 1) && (numero <= 6); // numero tiene que ser mayor o igual a 1 && numero tiene que ser menor o igual a 6
    }

    static void mostrarMensaje(int numeroJugador, int numeroRandom) {
        System.out.printf("El numero aleatorio es: %d%n", numeroRandom);
        if (numeroJugador == numeroRandom) {
            System.out.printf("VICTORIA");
        } else {
            System.out.printf("PERDIDA");
        }
    }
}
