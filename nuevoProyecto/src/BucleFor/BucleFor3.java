package BucleFor;

import Utilidades.RandomUtilities;

import java.util.Random;

public class BucleFor3 {
    public static void main(String[] args) {
        final var random = RandomUtilities.generarRandomInt(15,100,new Random());
        final var suma1 = calcularSuma1(random);
        final var suma2 = calcularSuma2(random);
        final var suma3 = calcularSuma3(random);

        System.out.printf("numero random: %d%n", random);
        System.out.printf("resultado suma 1: %d%n", suma1);
        System.out.printf("resultado suma 2: %d%n", suma2);
        System.out.printf("resultado suma 3: %d%n", suma3);
    }
    static int calcularSuma1 (int n){
        var suma = 0;
        for (var i = 1; i <= n ; i++) {
            suma +=i;
        }
        return suma;
    }
    static int calcularSuma2 (int n){
        var suma = 0;
        for (var i = 1; i < n ; i++) {
            if(n % 2 == 0){
                suma += i;
            }
        }
        return suma;
    }
    static int calcularSuma3 (int n){
        var suma = 0;
        for (var i = 1; i < n ; i++) {
            if (n % 5 == 0){
                suma += i;
            }
        }
        return suma;
    }
}
