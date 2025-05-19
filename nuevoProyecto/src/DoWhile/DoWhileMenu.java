package DoWhile;

import Utilidades.ScannerManager;

import java.util.Scanner;

public class DoWhileMenu {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var a = ScannerManager.leerInt(scanner, "ingrese el primer numero");
        final var b = ScannerManager.leerInt(scanner, "ingrese el segundo numero");
        char opcion;

        do {
            imprimirMenu();
            opcion = ScannerManager.leerChar(scanner, "Ingrese una opcion");
            if (opcion != 'F' && opcion != 'f'){
                ejecutarOpciones(a,b,opcion);
            }
        }while (opcion != 'F' && opcion != 'f');

        scanner.close();

    }

    static void imprimirMenu (){
        System.out.printf("A. suma %n");
        System.out.printf("B. resta %n");
        System.out.printf("C. multiplicacion %n");
        System.out.printf("D. division %n");
        System.out.printf("E. resto %n");
        System.out.printf("F. Salir del menú");
    }
    static void ejecutarOpciones (int a, int b, char opcion){
        final var resultado = switch (opcion){
            case 'A', 'a' -> calcularSuma(a,b);
            case 'B', 'b' -> calcularResta(a,b);
            case 'C', 'c' -> calcularMultiplicacion(a,b);
            case 'D', 'd' -> calcularDivision(a,b);
            case 'E', 'e' -> calcularResiduo(a,b);
            default -> -1;
        };

        if (resultado != -1){
            System.out.printf("El resultado entre %d y %d es %d %n", a,b,resultado);
        }else {
            System.out.printf("Opcion no valida");
        }
    }

    static int calcularSuma (int a, int b){
        return a + b;
    }
    static int calcularResta (int a, int b){
        return a - b;
    }
    static int calcularMultiplicacion (int a, int b){
        return a * b;
    }
    static int calcularDivision (int a, int b){
        return a / b;
    }
    static int calcularResiduo (int a, int b){
        return a % b;
    }
}

