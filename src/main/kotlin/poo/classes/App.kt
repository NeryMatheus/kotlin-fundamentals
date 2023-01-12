package poo.classes

import java.time.LocalDate

class App {
    companion object {
        @JvmStatic
        fun main (args: Array<String>) {
            val fernando = Pessoa("09102209102209", "Matheus", LocalDate.of(1997, 3, 10))
            fernando.falar("Olá Mundo da programação Orientada a Objetos!!!")
        }
    }
}