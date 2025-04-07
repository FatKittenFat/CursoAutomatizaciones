package Utilidades;

public class EjercicioRandom {
    public static void main(String[] args) {
        final var random = new java.util.Random();

        final var randomInt = Utilidades.RandomUtilities.generarRandomInt(20, 100, random);
        final var randomDouble = Utilidades.RandomUtilities.generarRandomDouble(100, 500, random);

        System.out.printf("random int: %d %n", randomInt);
        System.out.printf("random double: %.2f %n", randomDouble);
        /// FUERZA
        final var masa = random.nextDouble(300 - 100 + 1) + 100;
        final var aceleracion = random.nextDouble(5 - 3 + 1) + 3;

        final var fuerza = Utilidades.RandomUtilities.calcularFuerza(masa, aceleracion);
        Utilidades.RandomUtilities.imprimirResultado(masa, aceleracion, fuerza);

        /// VELOCIDAD
        final var vi = Utilidades.RandomUtilities.generarRandomDouble(10, 30, random);
        final var a = Utilidades.RandomUtilities.generarRandomDouble(2, 5, random);
        final var t = Utilidades.RandomUtilities.generarRandomDouble(3, 5, random);

        final var vf = Utilidades.RandomUtilities.calcularVelocidadFinal(vi, a, t);
        Utilidades.RandomUtilities.imprimirVelocidadFinal(vi, a, t, vf);

        /// HIPOTENUSA
        final var cateto1 = Utilidades.RandomUtilities.generarRandomDouble(10, 30, random);
        final var cateto2 = Utilidades.RandomUtilities.generarRandomDouble(10, 30, random);
        final var hipotenusa = Utilidades.RandomUtilities.calcularHipotenusa(cateto1, cateto2);
        Utilidades.RandomUtilities.imprimirHipotenusa(cateto1, cateto2, hipotenusa);

        /// AREA Y PERIMETRO
        final var radio = Utilidades.RandomUtilities.generarRandomDouble(10, 25, random);
        final var area = Utilidades.RandomUtilities.calcularArea(radio);
        final var perimetro = Utilidades.RandomUtilities.calcularPerimetro(radio);
        Utilidades.RandomUtilities.imprimirAreaPerimetro(radio, area, perimetro);

    }
}
