class PilhaInvertida : EmpilhavelInvertida {
    // variáveis de instância
    private var ponteiroTopo: Int // utliliza-se var pois é mutável
    private var dados: Array<Any?> // o Any é como se fosse objetos, a interrogação permite os nulos
    //construtores são públicos, quando é privado usamos em banco de dados Singletan
    constructor () : this(10)
    
    constructor (tamanho:Int){
        ponteiroTopo = tamanho
        dados = arrayOfNulls(tamanho)   
    }
    //métodos auxiliares
    override fun estaCheia(): Boolean {
        return (ponteiroTopo == 0)
    }

    override fun estaVazia(): Boolean {
        return (ponteiroTopo == dados.size)
    }

    //métodos principais
    override fun empilhar (dado: Any?){
        //decrementa por ser invertida
        if(!estaCheia()){
            ponteiroTopo--
            dados[ponteiroTopo] = dado
        } else {
            println ("A pilha está cheia!")
        }
    }

    override fun desempilhar(): Any?{
        var retorno: Any? = null
        if(!estaVazia()){
            retorno = dados[ponteiroTopo]
            ponteiroTopo++
            //incrementa por ser invertida
        } else{
            println("A pilha está vazia!")
        }
        return retorno
    }

    override fun atualizar(dado: Any?) {
		if (!estaVazia())
			dados[ponteiroTopo] = dado
		else
			println("A pilha está vazia!")
	}
		
    override fun topo(): Any?{
        var retorno: Any? = null
        if (!estaVazia()){
            retorno = dados[ponteiroTopo]
         } else{
            println("A pilha está vazia!")
         }
            return retorno       
    }

    override fun imprimir(): String {
        var result = "["
        //vamos iterar a pilha e no final retornar os elementos
        for (i in ponteiroTopo .. dados.size - 1){
            if (i == dados.size -1)
                result += "${dados[i]}" // o if aloca a vírgula entre os elementos do array
            else
                result += "${dados[i]},"
        } 
        return "$result]"
    }
}