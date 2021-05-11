package orientacaoObjetos

private enum class TipoMoradia {
    CASA, APARTAMENTO, SITIO
}

private open class Moradia(private var tipoMoradia: TipoMoradia) {
    fun getTipoMoradia(): TipoMoradia {
        return this.tipoMoradia;
    }
};

private class Casa(tipoMoradia: TipoMoradia): Moradia(tipoMoradia) {
    fun mostrarMoradia() {
         var tm = this.getTipoMoradia()
        println("Moradia: $tm")
    }
}

fun main() {
    var c = Casa(TipoMoradia.CASA);
    c.mostrarMoradia()
}