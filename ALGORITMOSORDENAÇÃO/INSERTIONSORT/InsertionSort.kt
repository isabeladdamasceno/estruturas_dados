class InsertionSort(private var dados: Array<Int>): Ordenavell {
//InsertionSort: Percorre a lista e compara cada elemento com os anteriores e 
//os reorganiza, se necessário, para que a lista fique ordenada.
    private fun trocar(i: Int, j: Int) {
        val temp = dados[i]
        dados[i] = dados[j]
        dados[j] = temp
    }

    override fun imprimir() {
        for (i in 0 until dados.size) {
            print("${dados[i]} ")
        }
        println("")
    }
	
    override fun ordenar() {
        for (i in 1 until dados.size) {
            var j = i
            while ((j > 0) && dados[j] < dados[j-1]) {
                trocar(j, j-1)
                j--
            }
        }
    }
}