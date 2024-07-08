public interface Espalhavel{

        fun adicionar(mapa: Mapa) 
        //armazena um par de objetos especificos
        fun remover(chave: Any): Any?
        //remove(), remove o  objeto com a chave especificada
        fun contemChave(chave: Any): Boolean
         //retorna o objeto da chave associada
        fun buscar(chave: Any): Any?
        //retorna o objeto associado a chave especificada
        fun estaVazia(): Boolean
        //verifica se esta vazia
    
        fun tamanho(): Int	
        //retorna a quantidade de elementos

        fun imprimir(): String
    }


