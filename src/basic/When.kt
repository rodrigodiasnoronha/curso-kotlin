package basic

import java.util.*



class When {

    fun run() {
        val valor1 = this.operacao(10, 10, "soma");
        val valor2 = this.operacao2(21, 1, "subtracao");
        val valor3 = this.operacao2(5, 5, "multiplicacao");

        val faseDaPessoa = this.calcularFaseDaIdadeDaPessoa(15);
        val faseDaPessoa2 = this.calcularFaseDaIdadeDaPessoa(50);
        val faseDaPessoa3 = this.calcularFaseDaIdadeDaPessoa(5);

        println("""
            $faseDaPessoa
            $faseDaPessoa2
            $faseDaPessoa3
        """.trimIndent())

        if (18 in 10..20) {
            println(true);
        }
    }

    private fun operacao(a: Int, b: Int, c: String): Int {
        when (c) {
            "soma" -> {
                return a + b;
            }

            "multiplicacao" -> {
                 return a * b;
            }

            "subtracao" -> {
                return a - b;
            }

            else -> {
                return 0;
            }
        }
    }

    private fun operacao2(a: Int, b: Int, c: String): Int {
        val valorCFormatado = c.lowercase(Locale.getDefault());
        when (valorCFormatado) {
            "soma" -> {
                return a + b;
            }
            "subtracao" -> {
                return a - b;
            }
            "multiplicacao" -> {
                return a * b;
            }
            else -> {
                return 0;
            }
        }
    }

    private fun calcularFaseDaIdadeDaPessoa(idade: Int): String {
        return when (idade) {
            in 0..14 -> {
                "Criança"
            }
            in 14..18 -> {
                "Adolescente"
            }
            in 18..60 -> {
                "Adulto"
            }
            else -> {
                "Velhice"
            }
        }
    }
}