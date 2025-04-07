import Utilidades.RandomUtilities;

import java.util.Random;

/*
Comparaciones entre numeros:
- deben ser del mismo tipo - 2 int o 2 double
- el resultado de la comparacion es un booleano
Igualdad: a == b
Desigualdad: a!=b
Menor: a<b
Menor igual: a<=b
Mayor: a>b
Mayor igual: a>=b
 */
public class CompararNumeros {
    public static void main(String[] args) {
        final var random = new Random();
        final var numRandomA = RandomUtilities.generarRandomInt(20,100,random);
        final var numRandomB = RandomUtilities.generarRandomInt(20,100,random);

        imprimirResultado(numRandomA, esNegativo(numRandomA));
        imprimirResultado(numRandomB, esNegativo(numRandomB));

    }
    static boolean esNegativo (int numero){
        return numero < 0;
    }
    static void imprimirResultado (int numero, boolean esNegativo){
        System.out.printf("El numero %d es negativo? %b%n",numero,esNegativo);
    }
}
