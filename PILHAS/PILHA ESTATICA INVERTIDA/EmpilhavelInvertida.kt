interface EmpilhavelInvertida {
    //funções/procedimento/rotina - métodos principais
    fun empilhar (dado: Any?)
    fun desempilhar(): Any?
    fun atualizar(dado: Any?)
    fun topo(): Any?
    
    //funções/procedimento/rotina - métodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}