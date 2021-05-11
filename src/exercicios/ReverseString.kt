package exercicios

import java.lang.StringBuilder

class ReverseString {
    fun reverseStringStringBuilder(str: String): String {
        return StringBuilder(str).reverse().toString();
    }

    fun reverseStringUsingLoop(str: String): String {
        var count = str.length;
        var strInverse = "";

        while (count != 0) {
            strInverse += str.split("")[count];
            count--;
        }

        return strInverse;
    }
}