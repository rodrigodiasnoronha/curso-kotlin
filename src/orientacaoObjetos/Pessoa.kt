package orientacaoObjetos

import java.util.*

private class Pessoa(
    private var nome: String
) {
    private var idade = 0;

    constructor(nome: String, idade: Int): this(nome) {
        this.idade = idade;
    }

    fun mostrarIdade() {
        println("Tenho $idade anos");
    }

    fun saudacao() {
        println("Olá")
    }
}

fun main() {
    var pessoa = Pessoa("Rodrigo");
    pessoa.mostrarIdade()
}