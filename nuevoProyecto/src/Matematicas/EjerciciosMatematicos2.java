package Matematicas;

public class EjerciciosMatematicos2 {
    public static void main(String[] args) {
        final var a = 100.5032;
        final var m = 76.1265;

        final var fuerza = m * a;

        System.out.printf("Para una masa de %.4f y %n" +
                "aceleracion de %.4f tenemos una fuerza %n" +
                "de %.4f", m, a, fuerza);
    }
}
