data class NoDuplo (var dado: Any? = null) {
	//a classe data bin ou bojo, serve para criar internamente um get e set
	//fica mais enchuto, menos verboso
		var anterior: NoDuplo? = null
		var proximo: NoDuplo? = null
	}