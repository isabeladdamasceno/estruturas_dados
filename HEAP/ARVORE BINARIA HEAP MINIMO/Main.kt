fun main() {
        var heap: Amontoavel = ArvoreBinariaHeapMinimo(10)
        heap.inserir(1)
        heap.inserir(2)
        heap.inserir(3)
        heap.inserir(4)
        heap.atualizar(5)	
        heap.inserir(6)
        println(heap.imprimir())
        println(heap.extrair())	
        println(heap.obter())	
        println(heap.obter())	
        println(heap.imprimir())
    }
