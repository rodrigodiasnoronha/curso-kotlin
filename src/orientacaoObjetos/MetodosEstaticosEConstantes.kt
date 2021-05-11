package orientacaoObjetos

import com.sun.deploy.uitoolkit.impl.awt.UIToolkitImpl

private class Utils private constructor() {
    // colocar métodos e variáveis estáticos aqui
    // companion object deixa os metodos e variáveis visiveis em toda a classe
    // possui escopo aberto
    companion object BANCO {
        val TABLE = "pessoa";

        fun teste() {
            println("Sou um método estático");
        }
    }

   // possui escopo fechado / so pode ser acessado através de VENDAS
    object VENDAS {
        val TABLE_NAME = "vendas";
    }

}

fun main() {

}