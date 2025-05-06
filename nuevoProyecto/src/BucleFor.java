import Utilidades.RandomUtilities;

import java.util.Random;

public class BucleFor {
    public static void main(String[] args) {
        final var random = RandomUtilities.generarRandomInt(5,20, new Random());
        mostrarNumeros1(random);
        mostrarNumeros2(random);
        mostrarNumeros3(random);
    }
    static void mostrarNumeros1(int n){
        for (var i = 1; i < n; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
    static void mostrarNumeros2(int n ){
        for (var i = 1; i <= 0 ; i++) {
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
    static void mostrarNumeros3(int n){
        for (var i = n; i >= 1 ; i--) {
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
}
