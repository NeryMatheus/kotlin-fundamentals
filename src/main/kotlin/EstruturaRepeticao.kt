import java.util.*

fun main(args: Array<String>) {

    var listaCompras = arrayOf("Arroz", "Feijão", "Batata", "Uva", "Banana", "Carne", "Leite", "Ovos", 100, 2.55, "Abacate")
    var totalCompras = listaCompras.size - 1
    var indice = 0


    // While
    /* while (indice <= totalCompras) {
        println(listaCompras[indice])
        indice++
    } */

    // For
    for (i in 0 .. totalCompras) {
        println(listaCompras[i])
    }
}