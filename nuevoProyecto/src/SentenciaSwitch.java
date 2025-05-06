/*
Sentencia Switch

java 16 o menos:
switch (opcion){
    case 'A':
        lo que tenga que hacer;
        break;
    default:
        opcion no correcta;
}

java 17+ AQUI YA NO SE USA EL BREAK
switch (opcion){
    case 'A' -> lo que se tenga que hacer;
    default -> opcion no correcta;
};

para dos casos iguales:
switch (opcion){
    case 'A' , 'a' -> lo que se tenga que hacer;
    default -> opcion no correcta;
};

asignar dato con switch
final var dato = switch (opcion){
    case 'A' , 'a' -> lo que se tenga que hacer;
    default -> opcion no correcta;
};
para mas lineas en bloques de casos se usa la palabra yieldm, se asigna el valor a la constante dato
final var dato = switch (opcion){
    case 'A' , 'a' -> {
        lo que se tenga que hacer;
        yield "opcion 1";
    }
    default -> opcion no correcta;
};
 */

import Utilidades.ScannerManager;

import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var a = ScannerManager.leerInt(scanner, "ingrese el primer numero");
        final var b = ScannerManager.leerInt(scanner, "ingrese el segundo numero");
        imprimirMenu();

        final var opcion = ScannerManager.leerChar(scanner, "ingrese la opcion");
        ejecutarOpciones(a,b,opcion);
        scanner.close();

    }

    static void imprimirMenu (){
        System.out.printf("A. suma %n");
        System.out.printf("B. resta %n");
        System.out.printf("C. multiplicacion %n");
        System.out.printf("D. division %n");
        System.out.printf("E. resto %n");
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

