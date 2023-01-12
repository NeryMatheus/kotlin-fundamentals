package poo.encapsulamento

import java.math.BigDecimal

class App {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculadora = Calculadora()
            calculadora.somar(BigDecimal.ONE)
            calculadora.dividir(BigDecimal("50"))
        }
    }
}