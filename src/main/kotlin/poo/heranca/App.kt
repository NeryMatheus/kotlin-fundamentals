package poo.heranca

import java.math.BigDecimal

class App {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculadora = Calculadora()
            calculadora.somar(BigDecimal(2))
            calculadora.dividir(BigDecimal("50"))

            val calculadoraCientifica = CalculadoraCientifica()
            calculadoraCientifica.somar(BigDecimal(2))
            calculadoraCientifica.dividir(BigDecimal("50"))
            calculadoraCientifica.potencia(8)
        }
    }
}