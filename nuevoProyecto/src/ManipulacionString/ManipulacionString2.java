package ManipulacionString;

import java.util.Arrays;

public class ManipulacionString2 {
    public static void main(String[] args) {
        final var data = obtenerData();
        final var arrayNumeros = crearArrayNumeros(data);
        final var promedioSimple = calcularPromedio(arrayNumeros);

        mostrarInfo(arrayNumeros, promedioSimple);

    }
    static String obtenerData (){
        return "5,3,15,23,12,11";
    }

    static int[] crearArrayNumeros(String data){
        final var arrayString = data.split(",");
        final var n = arrayString.length;

        final var arrayInt = new int[n];
        for (int i = 0; i < n; i++) {
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }
        return arrayInt;
    }

    static int calcularPromedio (int [] array){
        final var n = array.length;
        var suma = 0;
        for (var elemento: array){
            suma +=elemento;
        }
        return suma / n;
    }

    static void mostrarInfo (int[] array, int promedioSimple){
        System.out.printf("array es: %s%n", Arrays.toString(array));
        System.out.printf("promedio es: %d", promedioSimple);
    }
}
