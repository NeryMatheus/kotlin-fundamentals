package poo.polimorfismo

class Gato: Mamifero() {
    fun miar(){
        println("Miauuuuuuu!!!")
    }

    override fun comunicar() {
        miar()
    }
}
