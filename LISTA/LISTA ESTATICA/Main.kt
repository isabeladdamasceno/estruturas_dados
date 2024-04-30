fun main() {
    var lista = ListaEstaticaCircular()
    lista.anexar("Azul")
    lista.anexar("Verde")
    lista.inserir(2, "Branco")
    println("${lista.imprimir()}")
    lista.anexar("Marrom")
    lista.apagar(0)
    lista.inserir(0, "Coral")
    lista.inserir(2, "Amarelo");
    println("${lista.imprimir()}")
    println("${lista.selecionar(1)}")
    lista.atualizar(1, "Lilás")
    println("${lista.imprimir()}")
}