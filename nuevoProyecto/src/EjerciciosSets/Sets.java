package EjerciciosSets;

import Utilidades.ScannerManager;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
SETS
- lista que no acepta valores repetidos y no tiene indices
- no mantiene el orden de valores
- se usa para teoria de conjuntos o filtrar valores repetidos de una coleccion
- puede crecer o decrecer
- dentro del set debe tener el

DECLARACION
- valores iniciales
    final var setNumeros = new HashSet<>(Arrays.asList(n1,n2,...,nN))
    final var setStrings = new HashSet<>(Arrays.asList("String1", "String2", ... , "StringN"))
- sin valores iniciales
    final var setNumeros = new HashSet<Integer>()
    final var setStrings = new HashSet<String>()

AÑADIR VALORES
- se usa metodo add
    setNumeros.add(valor)
    setStrings.add("valor")

TAMAÑO DEL SET
- se usa metodo size retorna un int
    setNumeros.size()

ITERACION
- solo se puede con foreach
    for(var iterador = set)

HEADERS DE METODOS
- parametro
    static void nombreMet(Set<String> setDato)
- tipo de retorno
    static Set<tipoDato> nombreMet()

VALIDAR ELEMENTOS
- se validan con contains
- se puede usar if/else para validar antes de accederlo
    final var setStrings = new HashSet<>(Arrays.asList("String1", "String2"))
    if(setStrings.contains("String1")){
    }else{}

ACUMULAR / CONTAR VALORES CON SETS
- se realiza con foreach
-foreach para sumar/acumular
    for(var elemento: setNumeros){
        suma+= elemento
    }
- foreach para contar
    var contador = 0
    for(var elemento: set){
        if(elemento > 30){
            contador ++
        }
    }
    return contador

OPERACIONES ENTRE SETS
- unir dos data entre 2 sets
    - usa metodo addAll
    - teoria de conjuntos AUB
        final var setA = new HashSet<>(Arrays.asList(1,2,3,4));
        final var setB = new HashSet<>(Arrays.asList(4,5,6));
        setA y setB se unen por el 4
        setA.addAll(setB)
        el resultado sera [1,2,3,4,5,6]
- interseccion de 2 sets
    - se usa metodo retainAll
    - teoria de conjuntos AnB
        final var setA = new HashSet<>(Arrays.asList(1,2,3,4));
        final var setB = new HashSet<>(Arrays.asList(4,5,6));
        setA y setB se intersectan por el 4
        setA.retainAll(setB)
        el resultado sera la interseccion de A con B: 4
- eliminar elementos en el otro set
    - se usa metodo removeAll
    - teoria de conjuntos: A - B o B - A, son resultados diferentes
        final var setA = new HashSet<>(Arrays.asList(1,2,3,4));
        final var setB = new HashSet<>(Arrays.asList(4,5,6));
        setA.removeAll(setB) -  A - B - se muestra el resultado del setA sin el numero que coincide con el setB - 1,2,3
        setB.removeAll(setA) -  B - A - se muestra el resultado del setB sin el numero que coincide con el setA - 5,6
 */
public class Sets {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        //creacion de sets
        final var set1 = crearSetGrupo1();
        final var set2 = crearSetGrupo2(scanner);
        scanner.close();
        //union entre ambos sets
        set1.addAll(set2);
        imprimirSet(set1);
    }
    //creacion de grupo
    static Set<String> crearSetGrupo1 (){
        return new HashSet<>(Arrays.asList("oso", "carro", "patito", "robot", "pelota"));
    }

    //creacion de grupo leido por teclado
    static Set<String> crearSetGrupo2 (Scanner scanner){
        final var set = new  HashSet<String>();
        String regalo;
        do {
            regalo = ScannerManager.leerString(scanner, "Ingrese un regalo");
            if (!regalo.equals("salida")){
                set.add(regalo);
            }
        }while (!regalo.equals("salida"));
        return set;
    }

    //imprimir en consola
    static void imprimirSet(Set<String> set){
        System.out.printf("El registro total es: %s%n", set);
    }
}
