package orientacaoObjetos

private class Maquina(var marca: String) {
    private var cor: String = "";

    var nucleos = 10
        get() {
            println("Get foi chamado")
            return field
        }
        set(value) {
            println("Set foi chamado")
            field = value
        }


    constructor(nome: String, cor: String) : this(nome) {
        this.cor = cor;
    }

    fun ligar() {

    }

    fun processar() {

    }

    fun desligar() {

    }
}

fun main() {
    var maquina = Maquina("xpto");
    println(maquina.nucleos)

    with(maquina) {
        ligar();
        processar();
        desligar();
    }
}