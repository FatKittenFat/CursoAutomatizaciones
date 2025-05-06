import Utilidades.RandomUtilities;

import java.util.Random;

public class BucleFor4 {
    public static void main(String[] args) {
        final var random = RandomUtilities.generarRandomInt(5,20,new Random());
        final var promedio = calcularPromedio(random);
        imprimirResultado(random, promedio);
    }
    static int calcularPromedio (int n){
        var promedio = 0;
        for (var i = 1; i <= n ; i++) {
            promedio = n + i / n;
        }
        return promedio;
    }
    static void imprimirResultado (int n, int promedio){
        System.out.printf("El promedio simple desde 1 hasta " + n + " es " + promedio + "%nDonde " + n + " es n y " + promedio + " es el promedio simple");
    }
}
