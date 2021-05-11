package colecoes

fun main() {

    // List - array, Set, HashMap

    // listOf
    var lista = listOf("Madrid", "São Paulo", "Berlim"); // imutavel
    var lista2 = mutableListOf("Madrid", "São Paulo", "Berlim") // mutável
    var arrayList = arrayListOf("Madrid", "São Paulo", "Berlim") // Mutável

    // set -> não aloca valores repetidos
    var s1 = setOf("Brasília", "Rio Grande do Sul", "Berlim", "Berlim"); // imutável
    var s2 = mutableSetOf("Brasília", "Rio Grande do Sul", "Berlim"); // mutável

    // hashMap -> recebe chave e valor e de acordo com a chave, retorna o valor
    val h1 = hashMapOf<String, String>(Pair("Key",  "value"), Pair("França",  "París")); // mutável
    // h1.entries.remove();


}