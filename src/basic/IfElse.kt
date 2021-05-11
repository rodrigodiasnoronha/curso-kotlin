package basic

class IfElse {
    fun run() {
        // tomadas de decisão
        val idade = 21;
        val isMaiorDeIdade = this.maiorDeIdade(idade);

        if (isMaiorDeIdade) {
            println("É maior de idade");
        } else {
            println("Não é maior de idade");
        }

        val bonus = this.calcularBonus("Coordenador", (100).toFloat());
        println(bonus);
    }

    private fun maiorDeIdade(idade: Int): Boolean = idade >= 18;

    private fun calcularBonus(cargo: String, salario: Float): Float {
        return if (cargo == "Coordenador") {
            salario * 0.2f;
        } else if (cargo == "Gerente Júnior") {
            salario * 0.5f;
        } else {
            salario * 2f;
        }
    }
}
