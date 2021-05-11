package colecoes

data class Ingredientes(val nome: String, val quantidade: Int);

data class Comida(val nome: String, val calorias: Double, val ingredientes: List<Ingredientes> = listOf())

fun main() {
    val dados = listOf(
        Comida(
            "Lasanha", 1200.00, listOf(
                Ingredientes("Farinha", 1),
                Ingredientes("Queijo", 10),
                Ingredientes("Pressunto", 5),
                Ingredientes("Molho de tomate", 2),
                Ingredientes("Manjericão", 3)
            )
        ),
        Comida("Panqueca", 500.0),
        Comida("Omelete", 200.0),
        Comida("Sopa de feijão", 300.0),
        Comida(
            "Hamburguer", 2000.0,
            listOf(
                Ingredientes("Pão", 3),
                Ingredientes("Hamburguer", 1),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1),
            ),

        )
    )

    // tenho receitas na lista
    val hasReceitas = if (dados.isEmpty()) "Não" else "Sim"
    println("Tenho receitas? $hasReceitas");

    // quantas receitaas tenho
    val totalReceitas = dados.count();
    println("Quantas receitas tem na coleção? $totalReceitas receitas ")

    // qual a primeira e última receita
    val primeiraReceita = dados.first();
    val ultimaReceita = dados.last();

    println("Primeira receita: ${primeiraReceita.nome}");
    println("Última receita: ${ultimaReceita.nome}");

    // Qual a soma de calorias de todas as receitas
    var totalCalorias = dados.sumByDouble { it.calorias }
    println("Total de calorias: $totalCalorias");

    // Me dê as duas primeiras receitas
    var duasPrimeirasReceitas = dados.take(2);
    println("Pimreira receita: ${duasPrimeirasReceitas.first().nome}");
    println("Segunda receita: ${duasPrimeirasReceitas.last().nome}");

    // sei como fazer panquecas? e sushi?
    val seiFazerPanqueca = dados.filter { it.nome == "Panqueca" }.any();
    println("Sei fazer panqueca? ${if (seiFazerPanqueca) "Sim" else "Não"}")
    val seiFazerSushi = dados.filter { it.nome == "Sushi" }.any();
    println("Sei fazer sushi? ${if (seiFazerSushi) "Sim" else "Não"}");

    // Quais as comidas com mais de 500 calorias
    var comidasMaisDe500calorias = dados.filter { it.calorias >= 500.0 }
    if (comidasMaisDe500calorias.any()) {
        for (comida in comidasMaisDe500calorias) {
            println("Comidas com mais de 500 calorias: ${comida.nome} com ${comida.calorias} calorias")
        }
    } else {
        println("Não tem comidas com mais de 500 calorias")
    }

    // par chave-valor com comidas com mais de 500 calorias
    dados.filter { it.calorias >= 500.0 }.map { Pair(it.nome, it.calorias) }.forEach { println("${it.first}: ${it.second}") }

    // quais receitas possui farinha como ingrediente
    dados.filter { it.ingredientes.filter { it.nome == "Farinha" }.any() }.forEach {
        println("A comida ${it.nome} possui farinha como ingrediente")
    }

}