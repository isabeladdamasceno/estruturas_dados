class FilaEstaticaCircular(private val tamanho: Int = 10) : EnfileiravelCircular {
  // variáveis globais 
private var ponteiroInicio = 0
private var ponteiroFim = -1
private var quantidade = 0
private var dados: Array<Any?> = arrayOfNulls(tamanho)
  //construtor implícito
 //métodos auxiliares
override fun estaCheia(): Boolean {
    return (quantidade == dados.size)
}

override fun estaVazia(): Boolean {
  return (quantidade == 0)
}

override fun imprimir() : String{
  var resultado = "["
  var aux = ponteiroInicio
  for (i in 0..quantidade){
if (i = quantidade)
      resultado += "${dados[aux]}"
      aux++
       
  }else{
      resultado += "${dados[aux]},"
      aux++
       if(aux == dados.size)
           aux=0
  }
  
  return "$resultado]"
  
}

   override fun espiar(dado: Any?) {
  var dadoTopo: Any? = null
  if (!estaVazia()) {
    dadoTopo = dados[ponteiroInicio]
  } else {
    println("A fila está vazia!")
  }
}

    override fun desenfileirar() : Any? {
      var dado: Any? = null
      if (!estaVazia()){
         dado = dados[ponteiroInicio]
           ponteiroInicio++
          if (ponteiroInicio == dados.size)
              ponteiroInicio = 0
           quantidade--
  
       } else{
         println(" A fila está vazia")
         }
        return dado
      }

      override fun enfileirar(dado: Any?) {
          if (!estaCheia()) {
         ponteiroFim++
         if (ponteiroFim == dados.size)
         ponteiroFim = 0
         dados[ponteiroFim] = dado
          quantidade++
      }else{
             println("A fila está Cheia!")
             }
          }
        } 
