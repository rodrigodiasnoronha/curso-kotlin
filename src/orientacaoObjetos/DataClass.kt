package orientacaoObjetos

private class Triangulo(var area: Float) {
}

private data class Quadrado(var area: Float) {
    fun calcularArea() {
        println("área calculada")
    }
}

fun main() {
    var q1 = Quadrado(10f);
    var q2 = Quadrado(10f);

    var t1 = Triangulo(10f);
    var t2 = Triangulo(10f);
}