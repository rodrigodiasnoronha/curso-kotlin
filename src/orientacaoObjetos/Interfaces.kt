package orientacaoObjetos

private interface Machine {
    var marca: String;
    fun ligar();

    // pode ter corpo na função
    fun desligar() {
        println("Desliguei");
    }

}

class Computer: Machine {
    override var marca = "";


    override fun ligar() {
        TODO("Not yet implemented")
    }

    override fun desligar() {
        super.desligar()
    }

}
