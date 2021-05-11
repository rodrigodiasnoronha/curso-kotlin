package orientacaoObjetos

private enum class Prioridade {
    BAIXA, MEDIA, ALTA
}

private enum class Prioridade2(var id: Int) {
    BAIXA(1),
    MEDIA(5),
    ALTA(10)
}

private class Alarme(var descricao: String, var p: Prioridade) {

}

fun main() {
    var prioridade = Prioridade.ALTA;

    if (prioridade == Prioridade.ALTA) {
        // code..
    } else {
        // code...
    }

    var alarme = Alarme("oaisdjaos", Prioridade.ALTA);
}