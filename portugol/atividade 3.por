//programa
programa
{

	funcao inicio()
	
	{

	
	inteiro tempoEmsegundos
	inteiro horas
	inteiro minutos
	inteiro segundos

	
	escreva(" Quantos segundos voce deseja? :")
	leia(tempoEmsegundos)

	
	horas = (tempoEmsegundos / 3600)
	minutos = ((tempoEmsegundos % 3600)/60)
	segundos =  ((tempoEmsegundos % 3600)%60)
	
	
	escreva("\nhoras  : "+horas)
	escreva("\nminutos : "+minutos)
	escreva("\nsegundos  : "+segundos)


	}
}
 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 425; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */