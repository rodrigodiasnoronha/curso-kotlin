package basic

class TiposDeDados {

    fun run() {
        // float e double para números com vírgulas
        // byte, int, Long e Short para numeros sem vírgulas

        var preco = 12.5f; // o float precisar ter o f no final;
        val rico = false;
        val idade = 21;
        var nome = "Rodrigo";
        var sexo = 'h';

        println("$idade | $rico");

        // para ver o máximo de caracteres que cada tipo suporta
        println("Float: ${Float.MAX_VALUE}");
        println("Double: ${Double.MAX_VALUE}");
        println("Integer: ${Int.MAX_VALUE}");
        println("Long: ${Long.MAX_VALUE}");
    }
}