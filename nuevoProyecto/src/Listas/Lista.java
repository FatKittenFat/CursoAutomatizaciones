package Listas;

/*
LISTAS
- es una coleccion de datos
- su index comienza en 0
- puede creder o decrecer
- debe tener el mismo tipo de dato

DECLARAR LISTAS
- si se conocen sus valores:
    final var listaInt = Arrays.asList(n1, n2, ... , n3);
    final var listaString = Arrays.asList("String1", "String2", ... , "Stringn");
- se no se conocen sus valores
    final var listaInt = new ArrayList<Integer>();
    final var listaString = new ArrayList<String>();

MANIPULAR VALORES DE LISTA
- agregar se usa metodo add pasandole el valor en el parentesis
    listaInt.add(n);
- para actualizar el valor de una lista se usa metodo set colocando el index a actualizar
    listaNumeros.set(index,n)

OBTENER VALORES DE UNA LISTA
- se usa metodo get
    listaNumeros.get(index)

TAMAÑO DE LISTA
- usar metodo size()
    listaNumeros.size()
- acceder al elemento de forma programatica:
    listaNumeros.get(listaNumeros.size()-1)

ITERACION DE LISTA CON FOR
    final var listaNombres = Arrays.asList("String1", "String2");
    final var n = listaNomibres.size();
    for (var i = 0; i < n; i++){
        listaNombres.get(i)
    }

ITERAR CON FOREACH
    for (var iterador : listaIterar){
        iterador;
    }

LISTA EN HEADERS DE METODOS
- parametro:
    static void mostrarValores(List<String> lista) {}
- tipo de retorno
    static List<String> listaMetodo (){}

VALIDAR ELEMENTOS DE UNA LISTA
    listaNombres.contains("String")

VALIDAR SI LA LISTA ESTA VACIA
    listaNombres.isEmpty()
 */
public class Lista {
}
