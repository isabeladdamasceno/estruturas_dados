class ListaDinamica(private val tamanho: Int = 10): Listavel{
  //mesma variaveis globais de lista
  private var ponteiroInicio: NoDuplo? = null
  private var ponteiroFim: NoDuplo? = null
  private var quantidade = 0

  //metodos auxiliares a implementação é identica da lista
  override fun estaCheia(): Boolean{
      return quantidade == tamanho

  }

override fun estaVazia(): Boolean{
      return quantidade == 0
      
  }

  //ele é o inserir no final
  override fun anexar(dado: Any?){
       if(!estaCheia()){
         var novoNo = NoDuplo(dado)
         novoNo.anterior = ponteiroFim
       if(!estaVazia())
         ponteiroFim?.proximo = novoNo 
      else 
         ponteiroInicio = novoNo

         ponteiroFim = novoNo
         quantidade = quantidade.inc()

       }else{
          println("Lista cheia!")
       }
   }

   override fun selecionarTodos(): Array<Any?>{
     var dadosAux: Array<Any?> = arrayOfNulls(quantidade)
     var ponteiroAux = ponteiroInicio
     for(i in 0 until quantidade){
      dadosAux[i] = ponteiroAux?.dado
      ponteiroAux = ponteiroAux?.proximo
     }
      return dadosAux
      
   }

   override fun selecionar(posicao: Int): Any?{
    var dadoAux: Any? = null
      if(!estaVazia()){
          if(posicao >=0 && posicao < quantidade){
              var ponteiroAux = ponteiroInicio
                for(i in 0 until posicao)
                  ponteiroAux = ponteiroAux?.proximo

                  dadoAux = ponteiroAux?.dado

          }else{
              println("Posição inválida")
          }

      }else{
      println("Lista Vazia!")

      }
       return dadoAux  
    }

    override fun atualizar(posicao: Int, dado:Any?){
        if(!estaVazia()){
            if(posicao >=0 && posicao < quantidade){
                var ponteiroAux = ponteiroInicio
                  for(i in 0 until posicao)
                    ponteiroAux = ponteiroAux?.proximo

                    ponteiroAux?.dado = dado

            }else{
                println("Posição inválida")
            }

        }else{
        println("Lista Vazia!")

        }
         
      }

      override fun apagar(posicao: Int): Any?{
         var dadoAux: Any? = null
          if(!estaVazia()){
              if(posicao >=0 && posicao < quantidade){
                var ponteiroAux = ponteiroInicio
                for(i in 0 until posicao)
                ponteiroAux = ponteiroAux?.proximo
                dadoAux = ponteiroAux?.dado
                
                var ponteiroAnt = ponteiroAux?.anterior
                var ponteiroPro = ponteiroAux?.proximo
                ponteiroAnt?.proximo = ponteiroPro
                ponteiroAnt?.anterior = ponteiroAnt
              }else{
                  println("Posição inválida")
              }
  
              }else{
                  println("Lista Vazia")
              }
  
           return dadoAux  
        }

        override fun inserir(posicao: Int, dado: Any?) {
          if (!estaCheia()) {
            if (posicao >= 0 && posicao <= quantidade) {
              val noTemp = NoDuplo(dado)
              var ponteiroAuxiliar = ponteiroInicio
              for (i in 0 until posicao)
                ponteiroAuxiliar = ponteiroAuxiliar?.proximo
              if (estaVazia()) {
                ponteiroInicio = noTemp
                ponteiroFim = noTemp
              } else {
                val ponteiroProximo = ponteiroAuxiliar
                val ponteiroAnterior = ponteiroAuxiliar?.anterior ?: ponteiroFim
                if (ponteiroAnterior != null)						
                  ponteiroAnterior.proximo = noTemp
                else	
                  ponteiroInicio = noTemp

                if (ponteiroProximo != null)
                  ponteiroProximo.anterior = noTemp
                else
                  ponteiroFim = noTemp						
            
                noTemp.proximo = ponteiroProximo
                noTemp.anterior = ponteiroAnterior						
              }
              
              quantidade = quantidade++
            } else {
              println("Indice Inválido!")
            }
          } else {
            println("Lista Cheia!")
          }
        }

  override fun imprimir(): String{
     var resultado = "["
   var ponteiroAux = ponteiroInicio
     for(i in 0 until quantidade){
      resultado += ponteiroAux?.dado
      if( i != quantidade-1)
      resultado += ","

      ponteiroAux = ponteiroAux?.proximo

     }
     return "$resultado]"
      
  }
}
