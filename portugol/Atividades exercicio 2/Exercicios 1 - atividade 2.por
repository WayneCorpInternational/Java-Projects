programa
{
	
	funcao inicio()
	{

	
	real peso, excesso, multa 


	excesso = 0.0 //caso fique acima do peso
	multa = 0.0 // 4 reais em cima de cada 1kg de tomate
	
	escreva (" Qual é o peso dos tomates ? ")
	leia(peso)


	se(peso>50) {
	excesso = (peso - 50)	
	}
	
	senao {
	excesso = 0.0	
	
	}
	
	multa = (excesso * 4.0)
	escreva ("Seu excesso é de " + excesso + "Kg\n")
	escreva ("E sua multa é de " + multa +" reais\n" )	
	
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 439; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */