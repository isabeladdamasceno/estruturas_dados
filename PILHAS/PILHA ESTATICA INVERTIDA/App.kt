fun main(args: Array<String>){
    
    var pilha = PilhaInvertida(20)
    pilha.empilhar("Azul")
    pilha.empilhar("Verde")
    println("Topo: ${pilha.topo()}")
    pilha.empilhar("Amarelo")
    pilha.empilhar("Marrom")
    pilha.empilhar("Laranja")
    val dadoQualquer = pilha.desempilhar()
    pilha.empilhar("Rosa")
    pilha.empilhar("Violeta")
    pilha.empilhar(dadoQualquer)
    println("Dados: ${pilha.imprimir()}")
}