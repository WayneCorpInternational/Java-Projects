programa
{
	
	funcao inicio()
	{
		
	inteiro idadeNadador
	linha()
	escreva(" Ola nadador :) \n")
	linha()
	escreva(" Digite - 1 - Se voce tem 5, 6 ou 7 anos\n")
	linha()
	escreva(" Digite - 2 - Se voce tem 8, 9, 10 ou 11 anos \n")
	linha()
	escreva(" Digite - 3 - Se voce tem 12 ou 13 anos \n")
	linha()
	escreva(" Digite - 4 - Se voce tem 14, 15, 16 ou 17 anos \n")
	linha()
	escreva(" Digite - 5 - Se voce tem 18 ou acima \n")
	linha()
	
	leia (idadeNadador)

	escolha (idadeNadador){
	
	caso 1: 
	escreva( "bem vindo ao grupo A - infantil ")
	pare

	caso 2:
	escreva( "bem vindo ao grupo B - infantil ")
	pare

	caso 3:
	escreva( "bem vindo ao grupo A - infantil ")
	pare

	caso 4:
	escreva( "bem vindo ao grupo B - infantil ")
	pare

	caso 5:
	escreva( "bem vindo ao grupo dos adultos  ")
	pare

	caso 0:
	escreva(" Por favor digite novamente")
	
	}
 	}
funcao linha(){
	escreva("-----------------------------------------------\n")
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 442; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */