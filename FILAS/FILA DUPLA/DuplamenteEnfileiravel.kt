interface DuplamenteEnfileiravel {
   
        fun enfileirarInicio(dado: Any?)
        fun enfileirarFim(ddao:Any?)
        fun desenfileirarInicio(): Any?
        fun desenfileirarFim(): Any?
        fun espiarInicio(): Any?
        fun espiarFim(): Any?
        fun atualizarInicio(novoDado: Any?)
        fun atualizarFim(novoDado: Any?)
        fun estaCheia(): Boolean
        fun estaVazia(): Boolean
        fun imprimir(): String
    }
    