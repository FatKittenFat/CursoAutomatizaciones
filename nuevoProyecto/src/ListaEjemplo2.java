import Utilidades.RandomUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaEjemplo2 {
    public static void main(String[] args) {
        final var alto = new ArrayList<String>();
        final var medio = new ArrayList<String>();
        final var bajo = new ArrayList<String>();

        final var arrayNotas = crearArrayNotas();
        final var arrayNombres = crearArrayNombres();

        rellenarListas(alto, medio, bajo, arrayNombres, arrayNotas);

        System.out.printf("Lista alto: %s%n", alto);
        System.out.printf("Lista medio: %s%n", medio);
        System.out.printf("Lista bajo: %s%n", bajo);


    }
    static String[] crearArrayNombres(){
        return new String[]{"Carlos", "Antonio", "Jorge", "Ana", "Mayra", "Julieta", "Maria", "Rodrigo", "Anabel", "Luz"};
    }
    static int[] crearArrayNotas(){
        return RandomUtilities.generarRandomArrayInt(10, 1, 20, new Random());
    }
    static void rellenarListas(
            List<String> alto,
            List<String> medio,
            List<String> bajo,
            String[] arrayNombres,
            int[] arrayNotas
    ){
        final var n = arrayNotas.length;
        for (int i = 0; i < n; i++) {
            final var notas = arrayNotas[i];
            final var nombre = arrayNombres[i];
            if (notas >= 16){
                alto.add(nombre);
            } else if (notas > 10) {
                medio.add(nombre);
            }else {
                bajo.add(nombre);
            }
        }
    }
}
