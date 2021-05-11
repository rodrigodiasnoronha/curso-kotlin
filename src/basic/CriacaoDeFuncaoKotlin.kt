package basic

class CriacaoDeFuncaoKotlin {
    private val a: Int = 10;
    private val b: Int = 20;
    private val c: Int = 30;

    fun run() {
        var valorBonus = this.calcularBonus();
        println("O valor do bônus é $valorBonus");

        valorBonus = calcularBonus(11, 22, 33);
        println("O novo valor do bônus é $valorBonus");

        imprimirNome("Rodrigo Dias Noronha");
    }

    private fun calcularBonus(): Int {
        return (this.a + this.b) * this.c;
    }

    private fun calcularBonus(a: Int, b: Int, c: Int): Int {
        return (a + b) * c;
    }

    private fun imprimirNome(nome: String): Unit {
        println(nome);
    }
}