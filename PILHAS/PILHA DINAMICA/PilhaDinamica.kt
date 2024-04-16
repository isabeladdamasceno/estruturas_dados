class PilhaDinamica(var tamanho: Int = 10): Empilhavel{
    //dinâmicas são baseadas em objetos
    //são mais complexas, ganha em espaço e perde em velocidade
    //são estruturas de dados encadeadas/ligadas
    //podem ser duplamente encadeadas = pode ir pra frente e voltar, nul antes e nul depois tem o encadeamento dos dados
    //simplesmente encadeadas = referencia para o proximo dado ou pode ter referencia do dado anterior(da pra fazer qualquer coisa lista, fila e pilha)
    //a lista tem como ir pro meio da lista, aqui não, só vai para o que está imediatamente antes ou depois
    //um objeto que tem 3 objetos dentro: o anterior, o dado e o proximo(na verdade são endereços de memória)
    
        //a variável tamanho tem o funcionamento como tamanho máximo, para dar limite, pois só irá alocar até aí
        var ponteiroTopo: NoDuplo? = null //ele guarda o objeto NoDuplo
        var quantidade = 0 //se incrementa, quantidade++, e se retira, quantidade--
    
        override fun estaVazia(): Boolean{
            return quantidade == 0
        }
    
        override fun estaCheio(): Boolean{
            return quantidade == tamanho
        }
    
        override fun desempilhar(): Any? {
            var dadoTopo: Any? = null //var para ter seu valor alterado
            if(!estaVazia()){
                dadoTopo = ponteiroTopo?.dado 
                //voltar ponteiroTopo para o anterior
                ponteiroTopo = ponteiroTopo?.anterior
                if (ponteiroTopo != null)
                //faz a quebra 
                    ponteiroTopo?.proximo = null
                quantidade = quantidade.dec()
             }else{
                 println("Pilha Vazia")
             }
           return dadoTopo
         } 
    
         override fun empilhar(dado: Any?){
            if(!estaCheio()){
            //o noDuplo(faz referencia ao antes e depois) tem as 3 variaveis de instancia do tipo: dado = Any, ant e prox são do tipo noDuplo
            //novoNo = tail, tail recebe novo nodo (variável, chama o objeto)
            // cria novo No, passando o dado
            //altera dois ponteiros
            var novoNo = NoDuplo(dado)
            novoNo.anterior = ponteiroTopo//set
            //se a estrutura estiver vazia ponteiroTopo tá nulo e não pode chamar
            if(!estaVazia())
              ponteiroTopo?.proximo = novoNo
            ponteiroTopo = novoNo
            quantidade = quantidade.inc() //incrementa
            }else{
                println("Pilha cheia!")
            }
         }
        
        override fun espiar(): Any?{
            var dadoTopo: Any? = null
            if(!estaVazia()){
               dadoTopo = ponteiroTopo?.dado 
            }else{
                println("Pilha Vazia")
            }
          return dadoTopo
        } 
    
        override fun atualizar(dado: Any?){
            if(!estaVazia()){
               ponteiroTopo?.dado = dado
            }else{
                println("Pilha Vazia")
            }
        } 
    
        override fun imprimir(): String{
            var ponteiroAuxiliar = ponteiroTopo
            var resultado = "["
            for(i in 0 until quantidade){
                resultado += ponteiroAuxiliar?.dado 
                if(i != quantidade-1)
                resultado += ","
             ponteiroAuxiliar = ponteiroAuxiliar?.anterior
            }
            return "$resultado]"
        }
        
    }







