package poo.polimorfismo

class Cachorro: Mamifero() {
    fun latir() {
        println("Au Au")
    }

    override fun comunicar() {
        latir()
    }
}