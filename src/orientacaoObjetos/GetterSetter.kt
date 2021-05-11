package orientacaoObjetos

class Carro(private var cor: String) {
    private var ano = 0;

    constructor(cor: String, ano: Int): this(cor) {
        this.ano = ano;
    }
}

fun main() {
    var c = Carro("amarelo");
}
