interface Empilhavel {
    //função/procedimento/rotina - métodos principais
    fun empilhar (dado: Any?)
    fun desempilhar(): Any?
    fun topo(): Any?
    
    //função/procedimento/rotina - métodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}