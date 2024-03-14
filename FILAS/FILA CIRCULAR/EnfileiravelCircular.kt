interface EnfileiravelCircular {
    //função/procedimento/rotina - métodos principais
    fun enfileirar(dado: Any?)
    fun desenfileirar(): Any?
    fun espiar(dado: Any?)
    fun frente(): Any?

    //função/procedimento/rotina - métodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}