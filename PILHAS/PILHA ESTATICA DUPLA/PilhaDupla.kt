class PilhaDupla : EmpilhavelDupla {
   // Pilha 1 executa como a Pilha Estática
  // Pilha 2 executa como a Pilha Estática Invertida

	private var topoPonteiro1: Int
	private var topoPonteiro2: Int
    private var dados: Array<Any?>
	
	constructor() : this(10)

	constructor(tamanho: Int) {
		dados = arrayOfNulls(tamanho)
		topoPonteiro1 = -1
        topoPonteiro2 = tamanho
	}
	
    //PILHA 1
	//métodos para operações na pilha1
	override fun empilhar1(dado: Any?) {
		if (!estaCheia1()) {
			topoPonteiro1++
			dados[topoPonteiro1] = dado
		} else {
			println("A pilha 1 está cheia!")
		}
	}
	
	override fun desempilhar1(): Any? {
		var dadoTopo: Any? = null
		if (!estaVazia1()) {
			dadoTopo = dados[topoPonteiro1]
			topoPonteiro1--
		} else {
			println("A pilha 1 está vazia!")
		}
		return dadoTopo
	}

	override fun estaCheia1(): Boolean {
		return (topoPonteiro1 == topoPonteiro2-1)
	}
	
	override fun estaVazia1(): Boolean {
		return (topoPonteiro1 == -1)
	}
	
	override fun topo1(): Any? {
		var dadoTopo: Any? = null
		if (!estaVazia1()) {
			dadoTopo = dados[topoPonteiro1]
		} else {
			println("A pilha 1 está vazia!")
		}
		return dadoTopo
	}

	override fun imprimir1(): String {
		var result = "["
		for (i in topoPonteiro1 downTo 0) {
			if (i == 0)
				result += "${dados[i]}"
			else
				result += "${dados[i]}, "
		}
		return "$result]"
	}

    //PILHA 2
	//métodos para operações na pilha 2
	override fun empilhar2(dado: Any?) {
		if (!estaCheia2()) {
			topoPonteiro2--
			dados[topoPonteiro2] = dado
		} else {
			println("A pilha 2 está cheia!")
		}
	}
	
	override fun desempilhar2(): Any? {
		var dadoTopo: Any? = null
		if (!estaVazia2()) {
			dadoTopo = dados[topoPonteiro2]
			topoPonteiro2++
		} else {
			println("A pilha 2 está vazia!")
		}
		return dadoTopo
	}

	override fun estaCheia2(): Boolean {
		return estaCheia1()
	}
	
	override fun estaVazia2(): Boolean {
		return (topoPonteiro2 == dados.size)
	}
	
	override fun topo2(): Any? {
		var dadoTopo: Any? = null
		if (!estaVazia2()) {
			dadoTopo = dados[topoPonteiro2]
		} else {
			println("A pilha 2 está vazia!")
		}
		return dadoTopo
	}

	override fun imprimir2(): String {
		var result = "["
		for (i in topoPonteiro2 .. dados.size-1) {
			if (i == dados.size-1)
				result += "${dados[i]}"
			else
				result += "${dados[i]}, "
		}
		return "$result]"
	}
}
