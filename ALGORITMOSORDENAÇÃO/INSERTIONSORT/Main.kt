fun main() {
    val dados = arrayOf(5, 7, 2, 6, 1, 4, 3)
    var b = InsertionSort(dados) // Copia o array original para preservá-lo
    b.imprimir()
    b.ordenar()
    b.imprimir()
}
