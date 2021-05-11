package basic

class MaisSobreFuncao {

    fun run() {
        this.endereco("SQ 12 QD 4", "Cidade Ocidental", "Goiás", "72880-498");
        this.endereco(cidade = "OISAJDOAS") // você também pode especificar o nome do parametro

        this.calcularMediaAluno(5f);
    }

    // como colocar valores default na função (igual no javascript)
    private fun endereco(rua: String = "", cidade: String = "", estado: String = "", cep: String = "", numero: Int = 0) {
//        println("""
//            Rua: $rua
//            Cidade: $cidade
//            Estado: $estado
//            CEP: $cep
//            Número: $numero
//        """.trimIndent())
    }

    // n parametros
    fun calcularMediaAluno(vararg notas: Float) {

        if (notas.isNotEmpty()) {
            var notaTotal = 0f;
            for (nota in notas) {
                notaTotal += nota;
            }

            var media: Float = notaTotal / notas.size;

            println("A média do aluno é $media");
        } else {
            println("A média do aluno é 0.0");

        }

    }

    fun <T> mediaTeste(vararg valores: T) {
    }
}