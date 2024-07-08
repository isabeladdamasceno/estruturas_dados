fun main() {
	val c1 = Cliente("Pedro Antonio", 10)
	val c2 = Cliente("Verônica", 5)
	val c3 = Cliente("Felipe", 70)
	val c4 = Cliente("Fernando", 18)
	val c5 = Cliente("Helena", 24)
	val c6 = Cliente("Marcelo André", 19)
		
	var hashmap: Espalhavel = MapaEspalhamento(26)
	hashmap.adicionar(Mapa("tom", c1))
	hashmap.adicionar(Mapa("vero", c2))
	hashmap.adicionar(Mapa("lipe", c3))
	hashmap.adicionar(Mapa("nando", c4))
	hashmap.adicionar(Mapa("lena", c5))
	hashmap.adicionar(Mapa("celo", c6))
	
	//chave para testes
	var chave = "tom";	
	val clienteTemp = hashmap.buscar(chave) as Cliente
	println("a idade de $chave é: ${clienteTemp.idade}")
		
	chave = "vero"	
	if (hashmap.contemChave(chave))
		println("contem a chave $chave,\nreferenciando o objeto ${hashmap.buscar(chave)}")
	else
		println("não tem a chave $chave")

	chave = "matheus"	
	if (hashmap.contemChave(chave))
		println("contem a chave $chave,\nreferenciando o objeto ${hashmap.buscar(chave)}")
	else
		println("não tem a chave $chave")
		
	hashmap.remover("vero")

	chave = "vero"	
	if (hashmap.contemChave(chave))
		println("contem a chave $chave,\nreferenciando o objeto ${hashmap.buscar(chave)}")
	else
		println("não tem a chave $chave")
	
} 