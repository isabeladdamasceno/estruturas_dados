class ArvoreBinariaHeapMinimo(tamanho : Int = 10) : Amontoavel{

    // arvore binaria heap (monte) = arvore completa a esquerda e pode ter até dois filhos, possui dois tipos: máximo e mínimo
    // mínimo: menor valor, maior prioridade(menor do que o pai troca), o menor valor vai ser colocado na raiz
    // mínimo no array: ponteiro fim aponta para onde acaba
    
        private var dados = IntArray(tamanho){0}
        private var ponteiroFim = -1

        override fun obter(): Int? {
            var raiz: Int? = null
             //tipo o método frente, só retorna oq ta na raiz
             if(!estaVazia())
                raiz = dados[0]
             else
                 print("Heap vazia")
                 return raiz
         }
     
       override fun inserir(dado: Int){
            if(!estaCheia()){
                ponteiroFim++
                //pode usar .inc() para incrementar
                //ponterioFim = ponteiroFim.inc()
                dados[ponteiroFim] = dado
                //fazer as verificacoes 
                ajustarAcima(ponteiroFim)
            }else{
                print ("Heap está cheio!")
            }
        }
    
        private fun ajustarAcima(indice: Int){
                //variavel para alterar dentro do método
                var indiceAux = indice
                while (indice!=0) {
                    //pra saber se precisa trocar
                    //dessa forma é mais semantico
                    var pai = indicePai(indiceAux)
                    var filho = indiceAux
                    if(dados[pai] > dados[filho]){
                        trocar(pai, filho)
                         indiceAux = pai
    
                    }else{
                        break
    
                    }
    
                }
            }
    
        override fun extrair(): Int{
            var raiz = 0
            if (!estaVazia()){
                raiz = dados[0]
                dados[0] = dados[ponteiroFim]
                ponteiroFim --
                ajustarAbaixo(0)
    
            }else{
                print("Heap vazia!")
                //retorno oq esta na raiz
                //ultimo dado inserido q ta em ponteiroFim é colocado na raiz
                //ajustar abaixo(de cima para baixo)
            }
            return raiz
        }
    
        private fun ajustarAbaixo(pai: Int){
            var filhoEsquerdo = indiceFilhoEsquerdo(pai)
            var filhoDireito = indiceFilhoDireito(pai)
            var menor = pai //indice
    
            //verifica se existe o filho esquerdo
            if(filhoEsquerdo <= ponteiroFim)
            if(dados[pai] > dados[filhoEsquerdo]){
                menor = filhoEsquerdo
            }
            //verifica se existe o filho direito
            if(filhoDireito <= ponteiroFim)
            if(dados[menor] > dados[filhoDireito]){
                menor =  filhoDireito
            }
    
            if (menor != pai){
                //se o menor é diferente de pai continua rodando
                trocar(menor, pai)
                ajustarAbaixo(menor)
            }
        }
    
        override fun atualizar(dado: Int){
            //pega o dado passado como parametro, substitui(coloca) na raiz e chama ajustar abaixo para continuar como heap
           if(!estaVazia()){
            dados[0] = dado
            //caso tenha deixado de ser uma heap, chama o ajustarAbaixo
            ajustarAbaixo(0)
           }else{
            print ("Heap Vazia!!")
           }
        }
    
        override fun estaVazia():Boolean{
            return ponteiroFim == -1
        }
    
        override fun estaCheia():Boolean{
            return ponteiroFim == dados.size - 1
        }
    
        private fun trocar(i: Int, j: Int) {
        // Não há necessidade de "override" aqui, pois não se trata de uma implementação de interface.
        val temp = dados[i]
        dados[i] = dados[j]
        dados[j] = temp
    }
    
    
        private fun indicePai(indiceFilho:Int): Int{
            return (indiceFilho - 1)/2
        }
    
        private fun indiceFilhoEsquerdo(indicePai:Int): Int{
            return indicePai * 2 + 1
        }
    
        private fun indiceFilhoDireito(indicePai:Int): Int{
            return indicePai * 2 + 2
        }
    
       override fun imprimir(): String{
            var resultado = "["
            for(i in 0..ponteiroFim){
            resultado += "${dados[i]}"
            if (i != ponteiroFim)
            resultado += ","
    
        }
    
        return "$resultado]"
      }
    }
    