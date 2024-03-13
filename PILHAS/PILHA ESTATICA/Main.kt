fun main(args: Array<String>){
    
    var pilha = PilhaEstatica(20)
    pilha.empilhar("instituto")
    pilha.empilhar("federal")
    println("Topo: ${pilha.topo()}")
    pilha.empilhar("de")
    pilha.empilhar("educação")
    pilha.empilhar("ciencia")
    val dadoQualquer = pilha.desempilhar()
    pilha.empilhar("e")
    pilha.empilhar("tecnologia")
    pilha.empilhar(dadoQualquer)
    println("Dados: ${pilha.imprimir()}")
}