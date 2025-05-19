package Matematicas;/*
Operaciones Logicas:
- resultado es booleano
operadores:
    - ! - negacion - !datoBoolean
    - && - and - a==b && a==c
    - || - or - a!= b || b!=c
 */

public class OperacionesLogicas {
    public static void main(String[] args) {
        final var random = new java.util.Random();
        final var numero = Utilidades.RandomUtilities.generarRandomInt(10, 200, random);
        final var condicion1 = preguntarCondiciones(numero);
        final var condicion2 = preguntarCondiciones2(numero);

        System.out.printf("Numero random: %d%n", numero);
        System.out.printf("El numero %d es par y mayor que 50? %b%n", numero, condicion1);
        System.out.printf("El numero %d es multiplo de 3 o menos o igual que 35? %b%n", numero, condicion2);
    }

    static boolean preguntarCondiciones(int numero) {
        return (numero % 2 == 0) && (numero > 50);
    }

    static boolean preguntarCondiciones2(int numero) {
        return (numero % 3 == 0) || (numero <= 35);
    }
}
