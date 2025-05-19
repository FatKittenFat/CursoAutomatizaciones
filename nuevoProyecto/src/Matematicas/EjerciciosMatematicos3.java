package Matematicas;/*
    raiz cuadrada - Math.sqrt(a) - regresa resultado a
    potencia - Math.pow(a,b) - regresa potencia de a elevado a b
    pi - Math.PI - valor de pi

    NOTA: raices y potencias dan como resultado un double
 */

public class EjerciciosMatematicos3 {
    public static void main(String[] args) {
        final var cateto1 = 55.12;
        final var cateto2 = 23.12;

        final var cuadrados = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        final var hipotenusa = Math.sqrt(cuadrados);

        System.out.printf("Para los catetos %.3f y %.3f tenemos una hipotenusa de %.3f", cateto1, cateto2, hipotenusa);
    }
}
