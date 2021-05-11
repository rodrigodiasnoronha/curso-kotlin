package exercicios

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ReverseStringTest {
    var reverseString = ReverseString()

    @Test
    fun reverseUsingStringBuilder() {
        Assertions.assertEquals("niltok", reverseString.reverseStringStringBuilder("kotlin"))
    }

    @Test
    fun reverseUsingLoop() {
        Assertions.assertEquals("pool niltok", reverseString.reverseStringUsingLoop("kotlin loop"))
    }
}