package exercicios

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class VogalConsoanteTest {

    val vogalConsoante = VogalConsoante();

    @Test
    fun contarVogaisTest() {
        Assertions.assertEquals(5, vogalConsoante.contarVogais("Lucy Beatrice"));
    }

    @Test
    fun contarConsoantesTest() {
        Assertions.assertEquals(7, vogalConsoante.contarConsoantes("Lucy Beatrice"))
    }

    @Test
    fun contarVogaisEConsoantes() {
        Assertions.assertEquals(8, vogalConsoante.contarVogais("Rodrigo Dias Noronha"));
        Assertions.assertEquals(10, vogalConsoante.contarConsoantes("Rodrigo Dias Noronha"));
    }

}
