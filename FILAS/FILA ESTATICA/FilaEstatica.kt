class FilaEstatica (val tamanho: Int = 10) : Enfileiravel {
  // variáveis globais 
private var ponteiroInicio = 0
private var ponteiroFim = -1
private var dados: Array<Any?> = arrayOfNulls(tamanho)

override fun espiar(dado: Any?) {
  var dadoTopo: Any? = null
  if (!estaVazia()) {
    dadoTopo = dados[ponteiroInicio]
  } else {
    println("A fila está vazia!")
  }
}

  override fun enfileirar(dado: Any?) {
    if (!estaCheia()) {
      ponteiroFim++
      dados[ponteiroFim] = dado
    } else {
      println("A pilha está cheia!")
    }
  }
  
  override fun desenfileirar(): Any? {
    var dadoInicio: Any? = null
    if (!estaVazia()) {
      dadoInicio = dados[ponteiroInicio]
      ponteiroInicio++
    } else {
      println("Queue is empty!")
    }
    return dadoInicio
  }
  
  override fun frente(): Any? {
    var dadoInicio: Any? = null
    if (!estaVazia()) {
      dadoInicio = dados[ponteiroInicio]
    } else {
      println("Queue is empty!")
    }
    return dadoInicio
  }
  
  override fun estaCheia(): Boolean {
    return ponteiroFim == dados.size - 1
  }
  
  override fun estaVazia(): Boolean {
    return ponteiroInicio == ponteiroFim + 1
  }
  
  override fun imprimir(): String {
    var result = "["
    for (i in ponteiroInicio..ponteiroFim) {
      if (i == ponteiroFim)
        result += "${dados[i]}"
      else
        result += "${dados[i]},"
    }
    return "$result]"
  }
}

