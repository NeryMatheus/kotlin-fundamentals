import java.util.*

fun main (args: Array<String>) {
    var opcao = 3

    /* when (opcao) {
        1 -> println("Suco de Laranha")
        2 -> println("Suco de Uva")
        3 -> println("Suco de Morango")
        else -> println("Nenhuma opção foi selecionada")
    } */

    var mensagem = when (opcao) {
        1 -> "Suco de Laranha"
        2 -> "Suco de Uva"
        3 -> "Suco de Morango"
        else -> "Nenhuma opção foi selecionada"
    }

    println(mensagem)
}