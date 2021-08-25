//- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
//a) média do salário da população; 
//b) média do número de filhos; 
//c) maior salário; 
//d) percentual de pessoas com salário até R$100,00.  




programa
{

	//1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
	//a) média do salário da população; 
	//b) média do número de filhos; 
	//c) maior salário; 
	//d) percentual de pessoas com salário até R$100,00

	//variaveis
	
	
	funcao inicio()
	{
	
	//variaveis
	const inteiro HABITANTES=3
	real salario=0.00
	inteiro numeroFilhos=0
	real mediaSalario=0.00
	real totalSalarios=0.00
	real mediaNfilhos=0.00
	real totalFilhos=0.00
	real maiorSalario=0.00
	real percentualPessoasSalario100
	real pessoasAte100=0.00
	
	//entradas porcessamento
	para(inteiro x=1; x<=HABITANTES; x++){
		
	
	escreva("digite o salario")
	leia(salario)
	escreva (" Digite a quantidade de filhos ")
	leia(numeroFilhos)
	totalSalarios= totalSalarios + salario

	se (salario > maiorSalario){
		maiorSalario = salario
		
	}

	se (salario <=100.00){
		pessoasAte100 = pessoasAte100 + 1
		
	}
	
	}
	
	
	mediaSalario = totalSalarios / HABITANTES
	mediaNfilhos = totalFilhos / HABITANTES
	pessoasAte100 = pessoasAte100 / HABITANTES * 100.00
	//saidas
	escreva("\n total de salarios :" +totalSalarios)
	escreva("/n media salario: " +mediaSalario)
	escreva("/n maior salario: " +maiorSalario)
	escreva("/n toral de filhos: " +mediaNfilhos)
	escreva("/n media filhos: " +totalFilhos )
	escreva("/n percentual ate 100:"  +pessoasAte100 + "%" )
	

	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 308; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */