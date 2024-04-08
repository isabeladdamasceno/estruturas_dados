
class SelectionSort(private var dados: Array<Int>): Ordenavel{
//SELECTIONSORT = varre o array inteiro e identifica o menor e mantem este, 
//e troca o indice do menor elemento para o primeiro indice do array        
         private fun trocar(i: Int, j: Int) {
            val temp = dados[i]
            dados[i] = dados[j]
            dados[j] = temp
        }
       
       override fun imprimir(){
           for(i in 0 until dados.size){
           print("${dados[i]}")
        }
       println("")
    }
       
     override fun ordenar() {
       for (i in 0 until dados.size-1) {
                var indiceMenor = i
                for (j in i+1 until dados.size) {
                    if (dados[j] < dados[indiceMenor])
                        indiceMenor = j
                }
                trocar(i, indiceMenor)
            }
        }
         
    }
