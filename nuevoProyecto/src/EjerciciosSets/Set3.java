package EjerciciosSets;

import Utilidades.ScannerManager;

import java.util.*;

public class Set3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var set1 = crearSetAnimales1();
        final var set2 = crearSetAnimales2(scanner);
        scanner.close();
        set1.addAll(set2);
        imprimirAnimales(set1);
    }
    static Set<String> crearSetAnimales1(){
        return new HashSet<>(Arrays.asList("oso","gorila","zebra","leon","pantera"));
    }
    static Set<String> crearSetAnimales2(Scanner scanner){
        final var set = new HashSet<String>();
        String animal;
        do {
            animal = ScannerManager.leerString(scanner, "ingrese animal");
            if (!animal.equals("salida")){
                set.add(animal);
            }
        }while (!animal.equals("salida"));
            return set;
    }

    static void imprimirAnimales (Set<String> set){
        System.out.printf("Total de animales: %s%n",set);
    }
}
