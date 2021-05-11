package orientacaoObjetos


open class Fruta(var cor: String, var isMadura: Boolean) {
    open fun comer() {
        if (isMadura) {
            println("Comendo fruta");
        } else {
            println("Essa fruta não está madura")
        }
    }

    open fun verCorFruta() {
        println("A cor da fruta é $cor")
    }
}

class Abacate(cor: String, isMadura: Boolean) : Fruta(cor, isMadura) {
    override fun comer() {
        if (this.isMadura) {
            println("Comendo abacate")
        } else {
            println("Esse abacate não esta maduro")
        }
    }

    fun overload(i: Int) = println("Overload 1")
    fun overload(i: String) = println("Overload 2");
}

fun main() {
    var a = Abacate("verde", true);

    a.comer()
}
