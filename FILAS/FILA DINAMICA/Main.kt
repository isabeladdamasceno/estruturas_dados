fun main() {
    var fila: Enfileiravel = FilaDinamica(7)
    fila.enfileirar("Roxo")
    fila.enfileirar("Amarelo")
    println("Topo: ${fila.frente()}")
    fila.enfileirar("Vermelho")
    fila.enfileirar("Azul")
    fila.enfileirar("Branco")
    fila.enfileirar("Coral")
    println("Topo: ${fila.frente()}")
    val conteudo = fila.desenfileirar()
    fila.desenfileirar()
    fila.enfileirar("Verde")
    fila.enfileirar("Pink")
    fila.enfileirar("Preto")
    fila.enfileirar(fila.desenfileirar())
    fila.enfileirar(conteudo)
    println("fila=${fila.imprimir()}")
}