/*
    suma +
    resta -
    multiplicacion *
    division /
    residuo %
 */

public class EjercicioMatematicos1 {
    public static void main(String[] args) {

        final var vi = 15.24;
        final var a = 3.75;
        final var t = 5;

        final var vf = vi + a * t;

        System.out.printf("Para una velocidad inicial de %.2f, %n" +
                "una aceleacion de %.2f y un tiempo de %d se tiene una %n" +
                "velocidad final de %,3f", vi, a, t, vi);
    }
}
