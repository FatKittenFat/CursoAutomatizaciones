/*
ENUMS
son estructuras en las cuales se pueden especificar varias constantes
 */

import Utilidades.ScannerManager;

import java.util.Scanner;

public class Enums {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var diaSemana = ScannerManager.leerString(scanner, "Ingrese el diaSemana");
        scanner.close();
        final var resultado = calcularCal(DiaSemana.valueOf(diaSemana));
        imprimirResultado(diaSemana, resultado);
    }

    static int calcularCal (DiaSemana diaSemana){
        return switch (diaSemana) {
            case LUNES -> 350;
            case MARTES -> 420;
            case MIERCOLES -> 220;
            case JUEVES -> 600;
            case VIERNES -> 125;
            case SABADO -> 250;
            case DOMINGO -> 100;
            default -> -1;
        };
    }

    enum DiaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }

    static void imprimirResultado (String dia, int cal){
        System.out.printf("Para el dia %s se tiene que quemar %d cal %n", dia, cal);
    }
}
