interface Empilhavel {
    //continua a mesma interface, fazendo a implementação dos métodos usando objetos
    //função/procedimento/rotina - métodos principais
    fun empilhar(dado: Any?)
    fun desempilhar(): Any?
    fun espiar(): Any?
    fun atualizar(dado: Any?)   
    
    //função/procedimento/rotina - métodos auxiliares  
    fun estaCheio(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}