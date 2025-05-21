package ManipulacionString;

import java.util.Arrays;

/*
 string como array de char
    String es una clase que representa un array de char
        toCharArray - regresa un array de char - sirve para contar los caracteres dentro del array
string como clase:
    nombreCadena.length - regresa tamaño de la cadena como entero
    nombreCadena.charAt(index) - regresa el valor del char en la posicion index como char
    nombreCadena.indexOf(char/String) - regresa la posicion del char
string.format
    retorna el string formateado
    funciona igual que printf
string multilinea
    final var string = """ ... """;
comprar string
    cadena1.equals(cadena2) - deben ser iguales, compara con mayusculas - regresa booleano
    cadena1.equalsIgnoreCase(cadena2) - compara ignorando las mayusculas - regresa booleano
    cadena1.contains(cadena2) - indica si 1 contiene 2 - reegresa booleano
convertir mayusculas a minusculas
    cadena.toUpperCase() - mayusculas
    cadena.toLowerCase() - minusculas
comparar alfabeticamente
    cadena1.compareTo(cadena2) > 0 - compara 1 mayor que 2
    cadena1.compareTo(cadena2) < 0 - compara 1 menor que 2
    cadena1.compareTo(cadena2) = 0 - compara que ambas cadenas sean iguales
comparar ignorando las mayusculas
    cadena1.compareToIgnoreCase(cadena2) - compara como el anterior solo no toma en cuenta las mayusculas
como separador
    cadena.split("separador") - separa el string de un array usando separador como limitador
        cadena.slit(",") - en consola se mostrara un salto de linea cada que encuentre una coma
reemplazar o quitar char o Strings
    cadena.replace("stringAEliminar","porElqueSeVaAReemplazar")
        en caso de que no se necesite reemplazar se deja vacio
verificar si el string comienza con el char indicado - retorna booleano
    cadena.startsWith("char o cadena")
        dato.startsWith("A") - verifica si el dato comienza con A
verificar si el string termina con el char indicado - retorna booleano
    cadena.endsWith("char o cadena")
        dato.endsWith("A") - verifica si el dato termina con A
verificar si esta vacio - retorna booleano
    cadena.isEmpty()
  */
public class ManipulacionString {
     public static void main(String[] args) {

         final var arrayNombres = crearData();
         mostrarArray(arrayNombres);
         ordenarArray(arrayNombres);
         mostrarArray(arrayNombres);

     }
     //crear string con data
     static String[] crearData(){
         return new String[]{
                 "Carlos",
                 "Rodrigo",
                 "Juan",
                 "Arturo",
                 "Daniel",
                 "Mayra"
         };
     }
    //ordenar el array
     static void ordenarArray (String[] array){
         final var n = array.length; // tamaño de cadena en n
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                // se pregunta cual es mayor albabeticamente
                 if (array[j].compareTo(array[j + 1])>=0){
                     final var temp = array[j];
                     array[j] = array[j + 1];
                     array[j + 1] = temp;
                 }
             }
         }
     }

     static void mostrarArray(String[] array){
         System.out.printf("El array es: %s%n", Arrays.toString(array));
     }

}
