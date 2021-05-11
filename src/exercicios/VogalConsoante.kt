package exercicios

import java.util.*

class VogalConsoante {
    private var vogais = arrayOf('a', 'e', 'i', 'o', 'u')
    private var consoantes = arrayOf(
        'b',
        'c',
        'd',
        'f',
        'g',
        'h',
        'j',
        'k',
        'l',
        'm',
        'n',
        'p',
        'q',
        'r',
        's',
        't',
        'v',
        'w',
        'x',
        'y',
        'z'
    );


    fun contarVogais(str: String = ""): Int {
        var count = 0;

        for (letra in str) {
            if (this.vogais.contains(letra.lowercaseChar())) {
                count++;
            }
        }

        return count;
    }

    fun contarConsoantes(str: String = ""): Int {
        var count = 0;

        for (letra in str) {
            if (this.consoantes.contains(letra.lowercaseChar())) {
                count++;
            }
        }

        return count;
    }

    fun contarVogaisComFilter(str: String): Int {
        return str.filter { this.vogais.contains(it.toLowerCase()) }.count();
    }
}