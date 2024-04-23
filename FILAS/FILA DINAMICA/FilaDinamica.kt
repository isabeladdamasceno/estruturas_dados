class FilaDinamica(private val tamanho: Int = 10) : Enfileiravel {

	private var ponteiroInicio: NoDuplo? = null
	private var ponteiroFim: NoDuplo? = null
	private var quantidade = 0
 
    override fun estaCheia(): Boolean {
		return quantidade == tamanho
	}
	
	override fun estaVazia(): Boolean {
		return quantidade == 0
	}

    override fun frente(): Any? {
    //verifica se nao esta vazia
   //guarda o dado do inicio e retorna
   //retorno ele
		var dadoAux: Any? = null
		if (!estaVazia())
			dadoAux = ponteiroInicio?.dado
		else
			println("Fila Vazia!")
		
		return dadoAux
	}

    override fun desenfileirar(): Any? {
		var dadoAux: Any? = null
		if (!estaVazia()) {
			dadoAux = ponteiroInicio?.dado
			ponteiroInicio = ponteiroInicio?.proximo
			quantidade = quantidade.dec()
			if (!estaVazia())
				ponteiroInicio?.anterior = null
			else
				ponteiroFim = null
		} else {
			println("Fila Vazia!")
		}
		return dadoAux
	}

	override fun enfileirar(dado: Any?) {
		if (!estaCheia()) {
			var noTemp = NoDuplo(dado)
			noTemp.anterior = ponteiroFim
			if (!estaVazia())
				ponteiroFim?.proximo = noTemp
			else
				ponteiroInicio = noTemp
				
			ponteiroFim = noTemp
			quantidade = quantidade.inc()
		} else {
			println("Fila Cheia!")
		}
    }

    override fun atualizar(dado: Any?) {
     //verifica se nao esta vazia
     //subistitui o inicio da fila pelo dado passado como parametro
		if (!estaVazia())
			ponteiroInicio?.dado = dado 
		else
			println("Fila Vazia!")

	}	

	override fun imprimir(): String {
		var ponteiroAuxiliar = ponteiroInicio
		var resultado = "["
		for (i in 0 until quantidade) {
			resultado += "${ponteiroAuxiliar?.dado}"
			if (i != quantidade-1)
				resultado += ","
			
			ponteiroAuxiliar = ponteiroAuxiliar?.proximo
		}
		return "$resultado]"
	}
}