fun main() {
	var fila: DuplamenteEnfileiravel = FilaDuplaTerminacao()
	fila.enfileirarInicio("1")
	println(fila.imprimir1()) 
	println(fila.espiarFim()) 
	println(fila.espiarInicio()) 
	fila.enfileirarInicio("2")
	fila.desenfileirarFim()
    fila.enfileirarFim("3")
	fila.atualizarFim("4")
	fila.desenfileirarInicio()
	fila.enfileirarInicio("5") 
	println(fila.imprimir1()) 
	fila.espiarInicio() 
	fila.desenfileirarFim()
	println(fila.espiarFim())  
	fila.enfileirarInicio("6")
	fila.atualizarInicio("7")    
	println(fila.imprimir1())
	fila.enfileirarFim("8")
	fila.desenfileirarInicio()
	fila.enfileirarFim("9")
	println(fila.espiarFim()) 
	fila.enfileirarInicio("10")
	fila.desenfileirarFim()
	fila.enfileirarFim("11")
	println(fila.imprimir1()) 
	fila.enfileirarInicio("12")
	fila.enfileirarFim("13")
	fila.enfileirarFim("14")
	println(fila.espiarInicio()) 
	fila.desenfileirarInicio()
	println(fila.imprimir1()) 
}