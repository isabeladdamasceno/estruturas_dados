
 class ListaEstaticaCircular(val tamanho: Int = 10) : Listavel {
 
	private var dados: Array<Any?> = arrayOfNulls(tamanho)
	private var quantidade = 0
	private var ponteiroInicio = 0
	private var ponteiroFim = -1

	//selecionar = seleciona o que está na posição(recebe a posição guarda o dado na posição especifica e retorna)
	override fun selecionar (posicao: Int): Any? {
		var dadoAux: Any? = null
		if (!estaVazia()) {
			if (posicao >= 0 && posicao < quantidade) {
				var posicaoFisica = 
					(ponteiroInicio + posicao) % dados.size
				dadoAux = dados[posicaoFisica]
			} else {
				println("Indice Inválido!")	
			}
		} else {
			println(" A lista está vazia!")		
		}
		return dadoAux
	}

	override fun selecionarTodos(): Array<Any?> {        
		var dadosAux: Array<Any?> = arrayOfNulls(quantidade)
		if (!estaVazia()) {
			var ponteiroAux = ponteiroInicio
			for (i in 0 until quantidade)
				dadosAux[i] = dados[(ponteiroAux+i)%dados.size]
            
        }
        return dadosAux
	}

	//atualizar = subtituir
	override fun atualizar (posicao: Int, dado: Any?) {
		if (!estaVazia()) {
			if (posicao >= 0 && posicao < quantidade) {
				var posicaoFisica = 
					(ponteiroInicio + posicao) % dados.size
				dados[posicaoFisica] = dado
			} else {
				println("Indice Inválido!")	
			}
		} else {
			println("Lista Vazia!")		
		}
	}

	override fun estaCheia(): Boolean {
		return quantidade == dados.size
	}
	
	override fun estaVazia(): Boolean {
		return quantidade == 0
	}
	
	override fun imprimir(): String {
		var resultado = "["
		var ponteiroAux = ponteiroInicio
		for (i in 0 until quantidade) {
			resultado += if (i == ponteiroFim)
				"${dados[(ponteiroAux+i) % dados.size]}"
			else
				"${dados[(ponteiroAux+i) % dados.size]}, "			
		}
		return "$resultado]"
	}

//quando quer apagar chama o indice lógico, do ponto q ta apagando até o final
	override fun apagar(posicao: Int): Any? {
		var dadoAux: Any? = null
		if (!estaVazia()) {
			if (posicao >= 0 && posicao < quantidade){
				//ele arruma quando acaba a posicao valida e coloca dentro delas no array
				var posicaoFisica = 
				(ponteiroInicio + posicao) % dados.size
				dadoAux = dados[posicaoFisica]
				var ponteiroAux = posicaoFisica
				  //sempre o q ta atras vem pra frente
				for (i in posicao until (quantidade-1)) {
					var atual = ponteiroAux
					var proximo = (ponteiroAux+1)%dados.size
					//atual vai para frente
					dados[atual] = dados[proximo]
					ponteiroAux++
				}
				ponteiroFim--
				//para caso caia num posica invalida vai para o if
				if (ponteiroFim == -1) 
					ponteiroFim = dados.size - 1
				
				quantidade--
			} else {
				println("Indice Inválido!")
			}
		} else {
			println("Lista Vazia!")
		}
		return dadoAux
	}

// inserir = coloco onde eu quero
override fun inserir(posicao: Int, dado: Any?) {
    if (!estaCheia()) {
        if (posicao >= 0 && posicao <= quantidade) {
            var posicaoFisica = 
                (ponteiroInicio + posicao) % dados.size

            var ponteiroAux = ponteiroFim+1
            for (i in posicao until quantidade) {
                var anterior = ponteiroAux-1

                if(ponteiroAux == dados.size) {
                    ponteiroAux = 0			
                } 
                var atual = ponteiroAux

                dados[atual] = dados[anterior]
                ponteiroAux--
            }

            dados[posicaoFisica] = dado
            ponteiroFim++
            if (ponteiroFim == dados.size) {
                ponteiroFim = 0
            }
            quantidade++
        } else {
            println("Indice Inválido")
        }
    } else {
        println("Lista Cheia!")
    }
   }

   //anexar = sempre no final muito comum em listas
	override fun anexar(dado: Any?) {
		if (!estaCheia()) {
			ponteiroFim++
			if (ponteiroFim == dados.size)
				ponteiroFim = 0
			
			dados[ponteiroFim] = dado
			quantidade++
		} else {
			println("Lista cheia!")
		}
	}
 }

