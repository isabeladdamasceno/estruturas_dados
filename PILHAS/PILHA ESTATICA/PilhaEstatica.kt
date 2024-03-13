class PilhaEstatica : Empilhavel {
    // variáveis globais (de instância)
    var ponteiroTopo: Int //var pois é mutável
    private var dados: Array<Any?> // o Any como se fosse objetos, a interrogação permite os nulos
    //construtores são publicos para conseguir criar objetos, quando é privado usa-se em banco de dados Singletan
    constructor () : this(10)
    
    constructor (tamanho:Int){
        ponteiroTopo = -1
        dados = arrayOfNulls(tamanho)
        
    }
    //métodos auxiliares
    override fun estaCheia(): Boolean {
        return (ponteiroTopo == dados.size -1)
    }

    override fun estaVazia(): Boolean {
        return (ponteiroTopo == -1)
    }

    override fun imprimir(): String {
        var resultado = "[" //iterando a pilha e no final retornar os elementos
        for (i in ponteiroTopo downTo 0){ // colocando 'step to 2', os valores do array vão de 2 em 2
            if (i == 0)
                resultado += "${dados[i]}" // esse if é para colocar a vírgula entre os elementos do array
            else
                resultado += "${dados[i]},"
        } 
        return "$resultado]"
    } 
    //métodos principais
    override fun empilhar (dado: Any?){
        if(!estaCheia()){
            ponteiroTopo++
            dados[ponteiroTopo] = dado
        } else {
            println ("A pilha está cheia!")
        }
    }
    override fun desempilhar(): Any?{
        var retorno: Any? = null
        if(!estaVazia()){
            retorno = dados[ponteiroTopo]
            ponteiroTopo--
        } else{
            println("A pilha está vazia!")
        }
        return retorno
    }

    override fun topo(): Any?{
        var retorno: Any? = null
        if (!estaVazia()) {
            retorno = dados[ponteiroTopo]
    } else {
        println("A pilha está vazia")
    }
            return retorno
    
    }
}
