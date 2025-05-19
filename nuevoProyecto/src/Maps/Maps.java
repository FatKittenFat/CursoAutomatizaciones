/*
declaracion de maps:
    - si se conocen los valores
        final var mapString = Map.of(
            k1 1, v1 "String1",
            k2 2, v2 "String2",
            kn n, vn "Stringn"
        );
    - si no se conocen los valores inicales:
        final var mapString = new HashMap<Integer, String>();
        final var mapNumeros = new HashMap<Integer, Double>();

agregar valores a map
    - mapString.put(keyAlQueSeAgrega, "value");
obtener valor del key
    - mapString.get(keyDelQueSeObtendraValor);
validar elementos del map
    - mapString.containsKey(valorKey) - pregunta si esta ese key
    - mapString.containsValue(valorValue) - pregunta si esta ese valor
bucle for each
    - se usa el entrySet()
    - para keys - par.getKey()
    - para values - par.getValue()
    - el for queda:
        for(var par : mapString.entrySet()){
            par.getKey();
            par.getValue();
        }
declaracion en parametro:
    - static void nombreMetodo(Map<TipoDatoKey, TipoDatoValor> map)
declaracion como tipo de retorno:
    - static Map<TipoDatoKey, TipoDatoValor> nombreMetodo()
 */

package Maps;

import Utilidades.ScannerManager;

import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        final var mapUsuario = crearMap();
        final var scanner = new Scanner(System.in);

        int idLeido;
        System.out.printf("Escriba el id del usuario del 1 al 6, escriba -1 para salir. %n");
        do {
            idLeido = ScannerManager.leerInt(scanner, "Ingrese el id");
            if (idLeido != -1){
                mostrarUsuario(mapUsuario, idLeido);
            }
        }while (idLeido != -1);
        scanner.close();

    }
    //declarar map con datos harcodeados
    static Map<Integer, String> crearMap(){
        return Map.of(
                1,"Coco",
                2, "Socrates",
                3, "Calvario",
                4, "kitty",
                5, "Dejavu",
                6,"Rolex"
        );
    }

    //mostrar el usuario
    static void mostrarUsuario(Map<Integer, String> mapUsuario, int id){
        if (mapUsuario.containsKey(id)){
            System.out.printf("para el id: %d existe el username: %s %n", id, mapUsuario.get(id));
        } else {
            System.out.printf("El ID %d no se encuentra registrado %n", id);
        }
    }
}
