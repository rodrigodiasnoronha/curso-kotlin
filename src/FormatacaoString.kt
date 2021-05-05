class FormatacaoString {
    val frase: String = "Kotlin é uma linguagem";

    fun run() {
        println(frase);

        val tamanhoDaFrase = frase.length;
        val novaFrase = frase.replace("Kotlin", "Javascript");
        val caracteristica = "show!";
        val umaFraseComMaisDeUmaLinha = """
            Eu sou um texto aleatório
            Que estou colocando aqui
            Somente para preencher
            Diversas linhas de código
            ${this.frase}
        """.trimIndent();

        println(tamanhoDaFrase);
        println(novaFrase);
        println("${frase} ${caracteristica}");
        println(umaFraseComMaisDeUmaLinha);
    }
}