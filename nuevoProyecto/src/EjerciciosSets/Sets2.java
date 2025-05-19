package EjerciciosSets;

import Utilidades.ScannerManager;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sets2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var set1 = crearSetUtiles1();
        final var set2 = crearSetUtiles2(scanner);
        scanner.close();
        set1.addAll(set2);
        imprimirSet(set1);

    }

    static Set<String> crearSetUtiles1 (){
        return new HashSet<>(Arrays.asList("lapicero","borrador","lonchera","mochila","corrector","goma","tijera"));
    }

    static Set<String> crearSetUtiles2 (Scanner scanner){
        final var set = new HashSet<String>();
        String utiles;
        do {
            utiles = ScannerManager.leerString(scanner, "ingrese el nombre del articulo escolar");
            if (!utiles.equals("salida")){
                set.add(utiles);
            }
        }while (!utiles.equals("salida"));
            return set;
    }

    static void imprimirSet(Set<String> set){
        System.out.printf("los utiles son: %s %n", set);
    }
}
