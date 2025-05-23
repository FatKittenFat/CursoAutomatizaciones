package Array;

import Utilidades.RandomUtilities;

import java.util.Arrays;
import java.util.Random;

/*
Declaracion de array:
- si se conocen los valores:
final var arrayPalabras = new String[]{"dato1", "dato2",... , "daton"};
final var arrayNum = new int[]{1,2,3,... , n};

-si no hay valores inciales:
final var arrayPalabras = new String[tamañoArray];
final var arrayNum = new int[tamañoArray];

Asignacion de valores:
nombreArray[posicion] = dato a asignado;

Tamaño de array:
nombreArray.length;

Acceder a ultimo elemento:
nombreArray.length -1;

Iteracion de array con for:
final var nombreArray = new tipoDato[]{dato1, dato2, dato3};
final var tamañoArray = nombreArray.lenght;
for (var i = 0; i<n; i++){
    nombreArray[i]
}

Iteracion con bucle foreach
- no se tiene acceso al index pero es mas facil declarar
final var nombreArray = new tipoDato[]{dato1, dato2, dato3};
for (var iterador = nombreArray){
    nombre;
}

Array.Array en header de metodos:
- Parametro
static void nombreMetodo (tipoDato[] nombreParametro)
- Tipo de retorno
static tipoRetorno[] nombreMetodo () {
    return new tipoRetorno[]{dato1, dato2, ... , daton}
}
 */
public class Array {
    public static void main(String[] args) {
        final var random = new Random();
        final var arrayInt = RandomUtilities.generarRandomArrayInt(10, 10, 100, random);
        final var arrayDouble = RandomUtilities.generarRandomArrayDouble(5,10,30, random);

        System.out.printf("el array int es: %s%n", Arrays.toString(arrayInt));
        System.out.printf("el array double es: %s", Arrays.toString(arrayDouble));

    }
}






















