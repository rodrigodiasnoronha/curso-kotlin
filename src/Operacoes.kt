class Operacoes {
    fun run() {
        var numero = 10;
        val numeroIncrementoDepois = numero++;
        val numeroDecrementoDepois = numero--;
        val numeroIncrementoAntes = ++numero;
        val numeroDecrementoAntes = --numero;

        println("""
            Numero: $numero;
            Numero Incremento Depois: $numeroIncrementoDepois
            Numero Decremento Depois: $numeroDecrementoDepois
            Numero Incremento Antes: $numeroIncrementoAntes
            Numero Decremento Antes: $numeroDecrementoAntes
        """.trimIndent());
    }
}