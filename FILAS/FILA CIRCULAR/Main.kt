fun main() {
    var fila: EnfileiravelCircular = FilaEstaticaCircular()
    fila.enfileirar("1");
    println("Frente: ${fila.frente()}")	
    fila.enfileirar("2")
    fila.enfileirar("3")
    fila.enfileirar("4")
    fila.desenfileirar()
    fila.enfileirar("5")
    val conteudo = fila.desenfileirar()
    fila.enfileirar("6")
    println("Frente: ${fila.frente()}")
    println("Frente: ${fila.frente()}")	
    fila.enfileirar("7");
    fila.enfileirar(conteudo)
    fila.enfileirar("8")
    fila.enfileirar("9")
    fila.enfileirar("10")				
    println("Fila=${fila.imprimir()}")
}