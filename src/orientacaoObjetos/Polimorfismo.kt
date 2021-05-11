package orientacaoObjetos

interface Funcionario {
    fun calcularBonus();
}


class Gerente : Funcionario {
    override fun calcularBonus() {
        println("Bonus de 500")
    }
}

class Tecnico : Funcionario {
    override fun calcularBonus() {
        println("Bônus de 100")
    }
}

class Analista : Funcionario {
    override fun calcularBonus() {
        println("Bônus de 400")
    }
}

fun main() {
    var f1: Funcionario = Gerente();
    var f2: Funcionario = Tecnico();

}

fun calculo(f: Funcionario) {
    f.calcularBonus();
}