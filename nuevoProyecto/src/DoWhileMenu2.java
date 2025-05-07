import Utilidades.ScannerManager;
import java.util.Scanner;

public class DoWhileMenu2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        String diaSemana;
        do {
            diaSemana = ScannerManager.leerString(scanner, "Ingrese dia");

            if (!diaSemana.equals("SALIDA")){
                final var kcal = calculoCal(DiaSemana.valueOf(diaSemana));
                imprimirResultado(diaSemana, kcal);
            }
        } while (!diaSemana.equals("SALIDA"));
        scanner.close();


    }
    static int calculoCal (DiaSemana diaSemana) {
        return switch (diaSemana){
          case LUNES -> 350;
          case MARTES -> 420;
          case MIERCOLES -> 420;
          case JUEVES -> 420;
          case VIERNES -> 420;
          case SABADO -> 420;
          case DOMINGO -> 420;
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

    static void imprimirResultado (String diaSemana, int cal){
        System.out.printf("Para el dia %s se tiene que quemar %d kcal %n", diaSemana, cal);
    }
}
