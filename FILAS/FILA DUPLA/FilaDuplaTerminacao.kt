class FilaDuplaTerminacao(private val tamanho: Int = 10) : DuplamenteEnfileiravel {

    //possibilita operações eficientes tanto no início quanto no final da fila

	private var ponteiroInicio = 0
	private var ponteiroFim = -1 
	private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade = 0

	override fun espiarInicio(): Any? {
		var dadoTopo: Any? = null
		if (!estaVazia()) {
			dadoTopo = dados[ponteiroInicio]
		} else {
			println("A fila está vazia!")
		}
		return dadoTopo
	}
	
	override fun espiarFim(): Any? {
		var dadoTopo: Any? = null
		if (!estaVazia()) {
			dadoTopo = dados[ponteiroFim]
		} else {
			println("A fila está vazia!")
		}
		return dadoTopo
	}

	override fun atualizarInicio(dado: Any?) {
		if (!estaVazia())
			dados[ponteiroInicio] = dado
		else
			println("A fila está vazia!")
	}

	override fun atualizarFim(dado: Any?) {
		if (!estaVazia())
			dados[ponteiroFim] = dado
		else
			println("A fila está vazia!")
	}

	override fun enfileirarFim(dado: Any?) {
		if (!estaCheia()) {
			ponteiroFim++
			if (ponteiroFim == dados.size)
				ponteiroFim = 0
			quantidade++		
			dados[ponteiroFim] = dado
		} else {
			println("A fila está cheia!")
		}
	}

    override fun enfileirarInicio(dado: Any?) {
        if (!estaCheia()) {
            ponteiroInicio--
            if (ponteiroInicio == -1) {
                ponteiroInicio = dados.size-1
                if (quantidade == 0)
                    ponteiroFim = dados.size-1
            }
            quantidade++		
            dados[ponteiroInicio] = dado
        } else {
            println("A fila está cheia!")
        }
    }

	override fun desenfileirarInicio(): Any? {
		var dadoAux: Any? = null
		if (!estaVazia()) {
			dadoAux = dados[ponteiroInicio]
			ponteiroInicio++
			//patch pra fila funcionar de forma circular
			if (ponteiroInicio == dados.size)
				ponteiroInicio = 0
			quantidade--
			//fim do patch	
		} else {
			println("A fila está vazia!")
		}
		return dadoAux
	}

	override fun desenfileirarFim(): Any? {
		var dadoAux: Any? = null
		if (!estaVazia()) {
			dadoAux = dados[ponteiroFim]
			ponteiroFim--
			if (ponteiroFim == -1)
				ponteiroFim = dados.size-1
			quantidade--
		} else {
			println("A fila está vazia!")
		}
		return dadoAux
	}

	override fun estaCheia(): Boolean {
		return quantidade == dados.size
	}
	
	override fun estaVazia(): Boolean {
		return quantidade == 0
	}
	
	override fun imprimir1(): String {
		var resultado = "["
		var ponteiroAux = ponteiroInicio
		for (i in 0 .. quantidade-1) {
			if (i == quantidade-1)
				resultado += "${dados[ponteiroAux]}"
			else
				resultado += "${dados[ponteiroAux]},"

			ponteiroAux++
            if (ponteiroAux == dados.size)
                ponteiroAux = 0			
		}
		return "$resultado]"
	}

	override fun imprimir2(): String {
		var resultado = "["
		var ponteiroAux = ponteiroFim
		for (i in quantidade-1 downTo 0) {
			if (i == 0)
				resultado += "${dados[ponteiroAux]}"
			else
				resultado += "${dados[ponteiroAux]},"

			ponteiroAux--
            if (ponteiroAux == -1)
                ponteiroAux = dados.size-1			
		}
		return "$resultado]"
	}    
}
    