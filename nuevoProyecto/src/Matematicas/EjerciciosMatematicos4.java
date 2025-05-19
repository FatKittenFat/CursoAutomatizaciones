package Matematicas;/*
numeros random:
    declarar una variable random:
        final var random = new Random()
    despues se usa su formula:
        final var numeroAleatorio = random.nextInt(maximo - minimo + 1) + minimo

 double aleatorios:
    declarar una variable random:
        final var random = new Random()
    despues se usa su formula:
        final var doubleAleatorio = (maximo - minimo) * random.nextDouble() + minimo
 */

public class EjerciciosMatematicos4 {
    public static void main(String[] args) {
        final var random = new java.util.Random();

        final var radio = random.nextInt(100 - 20 + 1) + 20;

        final var perimetro = 2 * Math.PI * radio;
        final var area = Math.PI * Math.pow(radio, 2);

        System.out.printf("Para un radio de %d se tiene un perimetro de %.3f y un area de %.3f", radio, perimetro, area);
    }
}


