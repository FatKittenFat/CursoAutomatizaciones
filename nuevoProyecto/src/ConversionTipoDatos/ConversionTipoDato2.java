package ConversionTipoDatos;

public class ConversionTipoDato2 {
    public static void main(String[] args) {
        final var cantidad1 = "22";
        final var cantidad2 = "5";
        final var cantidad3 = "111";

        final var resultado = calcularSuma(cantidad1 ,cantidad2 ,cantidad3);
        imprimirResultado(resultado);

    }

    static int calcularSuma (String cantidad1, String cantidad2, String cantidad3){
        final var i1 = Integer.parseInt(cantidad1);
        final var i2 = Integer.parseInt(cantidad2);
        final var i3 = Integer.parseInt(cantidad3);

        return i1 + i2 + i3;
    }

    static void imprimirResultado (int cantidadTotal){
        System.out.printf("La cantidad total es %d", cantidadTotal);
    }
}
