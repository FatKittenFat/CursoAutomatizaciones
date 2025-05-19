package EscribirLeerConsola;

public class EjercicioPrintf {
    public static void main(String[] args) {
        final var numeroGatos = 5;
        final var peso = 13.2;
        final var libroFavorito = "hola mundo 123";
        final var esBajo = false;
        final var inicial = 'v';

        System.out.printf("hola tengo %d gatos %n", numeroGatos);
        System.out.printf("%.2f es mi peso %n", peso);
        System.out.printf("mi libro favorito es %s y lo leo todas las noches %n", libroFavorito);
        System.out.printf("mi inicial es %c %n", inicial);
        System.out.printf("si me preguntan si soy bajo la respuesta es %b %n", esBajo);
    }

    /* cuando usar sout o printf:
        quiero imprimir por lo menos un dato:
        - si - se usa printf
        - no - se usa sout
     */
}
