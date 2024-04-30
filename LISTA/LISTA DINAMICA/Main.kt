fun main() {
    var lista: Listavel = ListaDinamica()
    lista.anexar("Rosa")  
    lista.anexar("Verde")   
    lista.inserir(2,"Amarelo")
    println("${lista.imprimir()}") 
    lista.anexar("Lilás")   
    lista.apagar(0) 
    lista.inserir(0,"Vermelho")   
    lista.inserir(2,"Laranja");	
    println("${lista.imprimir()}") 
    println("${lista.selecionar(1)}") 
    lista.atualizar(1,"Cobre")
    println("${lista.imprimir()}")   
}