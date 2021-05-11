package orientacaoObjetos

private abstract class Mamifero(var nome: String) {
    var peso: Float = 0f

    abstract fun falar();

    open fun dormir() {
        println("Estou dormindo");
    }
}

private class Cachorro(nome: String, peso: Float) : Mamifero(nome) {

    init {
        this.peso = peso;
    }

    override fun falar() {
        println("au au")
    }

    override fun dormir() {
        println("cachorro dormindo")
    }
}

private class Gato(nome: String): Mamifero(nome) {
    override fun falar() {
        println("miau")
    }

    override fun dormir() {
        println("gato dormindo")
    }
}

fun main() {
    var gato = Gato("Johnny");
    var cachorro = Cachorro("Jack", 34f);

    gato.dormir()
    cachorro.dormir();
}