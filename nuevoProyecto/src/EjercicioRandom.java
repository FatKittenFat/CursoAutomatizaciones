package Utilities;

public class EjercicioRandom {
    public static void main(String[] args) {
        final var random = new java.util.Random();

        final var randomInt = Utilities.RandomUtilities.generarRandomInt(20, 100, random);
        final var randomDouble = Utilities.RandomUtilities.generarRandomDouble(100, 500, random);

        System.out.printf("random int: %d %n", randomInt);
        System.out.printf("random double: %.2f %n", randomDouble);
        /// FUERZA
        final var masa = random.nextDouble(300 - 100 + 1) + 100;
        final var aceleracion = random.nextDouble(5 - 3 + 1) + 3;

        final var fuerza = Utilities.RandomUtilities.calcularFuerza(masa, aceleracion);
        Utilities.RandomUtilities.imprimirResultado(masa, aceleracion, fuerza);

        /// VELOCIDAD
        final var vi = Utilities.RandomUtilities.generarRandomDouble(10, 30, random);
        final var a = Utilities.RandomUtilities.generarRandomDouble(2, 5, random);
        final var t = Utilities.RandomUtilities.generarRandomDouble(3, 5, random);

        final var vf = Utilities.RandomUtilities.calcularVelocidadFinal(vi, a, t);
        Utilities.RandomUtilities.imprimirVelocidadFinal(vi, a, t, vf);

        /// HIPOTENUSA
        final var cateto1 = Utilities.RandomUtilities.generarRandomDouble(10, 30, random);
        final var cateto2 = Utilities.RandomUtilities.generarRandomDouble(10, 30, random);
        final var hipotenusa = Utilities.RandomUtilities.calcularHipotenusa(cateto1, cateto2);
        Utilities.RandomUtilities.imprimirHipotenusa(cateto1, cateto2, hipotenusa);

        /// AREA Y PERIMETRO
        final var radio = Utilities.RandomUtilities.generarRandomDouble(10, 25, random);
        final var area = Utilities.RandomUtilities.calcularArea(radio);
        final var perimetro = Utilities.RandomUtilities.calcularPerimetro(radio);
        Utilities.RandomUtilities.imprimirAreaPerimetro(radio, area, perimetro);

    }
}
