programa
{	
	funcao inicio()
	{
		inteiro qtdAnos
		inteiro qtdMeses
		inteiro qtdDias		
		inteiro idade

		
		escreva ("Quantos anos voce tem ? \n")
		leia (qtdAnos)
		
		escreva ("Quantos Mêses voce tem ? \n")
		leia (qtdMeses)	
		
		escreva ("E quantos dias? \n")
		leia (qtdDias)				
		
		idade = (qtdAnos * 365) + (qtdMeses * 30) + qtdDias
		escreva ("Sua idade em dias é: " + idade)
					
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */