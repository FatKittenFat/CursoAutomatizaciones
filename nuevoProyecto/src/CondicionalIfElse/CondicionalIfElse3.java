package CondicionalIfElse;

import Utilidades.ScannerManager;

import java.util.Scanner;

public class CondicionalIfElse3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var radio = ScannerManager.leerDouble(scanner, "Ingrese el radio");
        imprimirMenu();
        final var opcion = ScannerManager.leerChar(scanner, "Ingrese una opcion");
        scanner.close();

        if (validarInput(opcion)){
            if (opcion == 'A'){
                mostrarArea(calcularArea(radio));
            } else if (opcion == 'B') {
                mostrarPerimetro(calcularPerimetro(radio));
            } else if (opcion == 'C') {
                mostrarArea(calcularArea(radio));
                mostrarPerimetro(calcularPerimetro(radio));
            }
        } else {
            System.out.printf("Opcion incorrecta");
        }
    }
    static void imprimirMenu(){
        System.out.printf("A: Calcular area %n");
        System.out.printf("B: Calcular perimetro %n");
        System.out.printf("C: Calcular ambos %n");
    }
    static boolean validarInput (char opcion){
        return (opcion == 'A') || (opcion == 'B') || (opcion == 'C');
    }

    static double calcularArea (double radio){
        return Math.PI * Math.pow(radio, 2);
    }

    static double calcularPerimetro (double radio){
        return 2 * Math.PI * radio;
    }

    static void mostrarArea (double area){
        System.out.printf("Su area es de %.2f %n", area);
    }

    static void mostrarPerimetro (double perimetro){
        System.out.printf("Su perimetro es de %.2f %n", perimetro);
    }


}
