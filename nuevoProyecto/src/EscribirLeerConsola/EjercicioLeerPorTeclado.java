package EscribirLeerConsola;

/*
Leer por teclado usando clase Scanner
    variable comienzo del scanner:
        final var scanner = new Scanner(System.in);

    string - scanner.nextLine()
    char - scanner.next().charAt(0)
    int - scanner.nextInt()
    double - scanner.nextDouble()
    boolean - scanner.nextBoolean()

    variable fin del scanner:
        scanner.close()
 */
public class EjercicioLeerPorTeclado {
    public static void main(String[] args) {
        final var scanner = new java.util.Scanner(System.in);

        System.out.printf("Ingresa tu edad:");
        final var edad = scanner.nextInt();

        System.out.printf("Ingresa tu estatura:");
        final var estatura = scanner.nextDouble();

        scanner.nextLine();

        System.out.printf("Ingresa tu nombre:");
        final var nombre = scanner.nextLine();

        scanner.close();

        imprimirResultado(edad, estatura, nombre);
    }

    static void imprimirResultado(int edad, double estatura, String nombre) {
        //System.out.printf("Tu edad es %d y tu estatura es %.2f", edad, estatura);
        System.out.printf("Mi nombre es %s tengo %d y mido %.2f", nombre, edad, estatura);
    }
}
