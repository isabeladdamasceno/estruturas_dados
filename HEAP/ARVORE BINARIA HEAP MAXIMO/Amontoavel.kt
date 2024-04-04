interface Amontoavel{
    fun inserir(dado: Int)
    fun extrair(): Int?
    fun obter(): Int?
    fun atualizar(dado: Int)

    fun estaVazia():Boolean
    fun estaCheia():Boolean
    fun imprimir(): String

    //tem outros métodos q n estão ai pq não são diretamente acessados
}