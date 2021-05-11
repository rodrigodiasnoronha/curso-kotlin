private enum class EstadoBot {
    LIGADO, DESLIGADO
}

private open class Bot(val token: String) {
    private var estado = EstadoBot.DESLIGADO;

    fun iniciar() {
        this.estado = EstadoBot.LIGADO;
        println("Iniciando BOT")
    }

    fun reiniciar() {
        this.estado = EstadoBot.DESLIGADO;
        println("Reiniciando BOT")
        this.estado = EstadoBot.LIGADO;
    }

    fun desligar() {
        this.estado = EstadoBot.DESLIGADO;
        println("Desligando BOT")
    }

    fun imprimirEstado() {
        println("Estado do BOT: $estado")
    }
}

private class MyPersonalBot(token: String): Bot(token) {
    fun pingPong() {
        println("Ping Pong")
    }
}

fun main() {
    var myPersonalBot = MyPersonalBot("oasidajsodisjadoiasj");

    with (myPersonalBot) {
        iniciar();
        imprimirEstado();
        pingPong();
        desligar();
        imprimirEstado();
    }
}