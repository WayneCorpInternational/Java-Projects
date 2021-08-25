programa
{	
	funcao inicio()
	{
		inteiro entradaDias
		inteiro qtdAnos
		inteiro qtdMeses
		inteiro qtdDias		
		inteiro idade

		escreva ("Qual a sua idade ( dias ) \n")
		leia (entradaDias)
		
		qtdAnos = entradaDias / 365
		entradaDias -= qtdAnos * 365

		se (entradaDias <= 31)
		{
			qtdMeses = 0
			qtdDias = entradaDias
		}
		senao
		{
			qtdMeses = entradaDias / 30
			entradaDias -= qtdMeses * 30
			qtdDias = entradaDias
		}
		
		escreva ("Calculando \n\n")
		escreva ("Idade (anos) : " + qtdAnos)
		escreva ("\nIdade (meses) : " + qtdMeses)
		escreva ("\nIdade (dias) : " + qtdDias)			 
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 578; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */