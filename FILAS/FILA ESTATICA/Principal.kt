fun main() {
    var fila: Enfileiravel = FilaEstatica()
    fila.enfileirar("Um");
    println("Frente: ${fila.frente()}")	
    fila.enfileirar("Dois")
    fila.enfileirar("Três")
    fila.enfileirar("Quatro")
    fila.desenfileirar()
    fila.enfileirar("Cinco")
    val conteudo = fila.desenfileirar()
    fila.enfileirar("Seis")
    println("Frente: ${fila.frente()}")
    println("Frente: ${fila.frente()}")	
    fila.enfileirar("Sete");
    fila.enfileirar(conteudo)
    fila.enfileirar("Oito")
    fila.enfileirar("Nove")
    fila.enfileirar("Dez")				
    println("Fila=${fila.imprimir()}")
}