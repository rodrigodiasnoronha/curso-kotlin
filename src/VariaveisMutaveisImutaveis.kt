class VariaveisMutaveisImutaveis {
    fun run() {
        // var define uma váriavel mutável, que pode ter seu valor alterado;
        var nome = "Rodrigo";
        nome = "Rodrigo Dias Noronha";

        println(nome);

        // val define uma variável imutável;
        val idade = 21.21f; // não pode mudar, é imutável;
        println("Nome: ${nome}\nIdade: ${idade}");
    }
}