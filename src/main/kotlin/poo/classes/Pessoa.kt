package poo.classes

import java.time.LocalDate

class Pessoa(
    val cpf: String,
    val nome: String,
    val dataNascimento: LocalDate)
{
    val idade = LocalDate.now().year - dataNascimento.year

    fun falar(msg: String){
        println("$nome falou: $msg. Com idade de $idade e cpf: $cpf")
    }
}