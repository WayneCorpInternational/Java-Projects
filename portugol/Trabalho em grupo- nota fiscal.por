programa{
	
	
	funcao inicio(){
		
				
			cadeia codigoProduto[10]
			codigoProduto [0] = "G2-1"
			codigoProduto [1] = "G2-2"	
			codigoProduto [2] = "G2-3"
			codigoProduto [3] = "G2-4"
			codigoProduto [4] = "G2-5"
			codigoProduto [5] = "G2-6"
			codigoProduto [6] = "G2-7"
			codigoProduto [7] = "G2-8"
			codigoProduto [8] = "G2-9"
			codigoProduto [9] = "G2-10"
	
			cadeia carrinho[10]
			carrinho[0] = " "
			carrinho[1] = " "
			carrinho[2] = " "
			carrinho[3] = " "
			carrinho[4] = " "
			carrinho[5] = " "
			carrinho[6] = " "
			carrinho[7] = " "
			carrinho[8] = " "
			carrinho[9] = " "

			cadeia nomeProduto[10]
			nomeProduto[0] = "Tênis Nike        "
			nomeProduto[1] = "Tênis Adidas      "
			nomeProduto[2] = "Tênis Puma        "
			nomeProduto[3] = "Camisa Nike       "
			nomeProduto[4] = "Camisa Lacoste    "
			nomeProduto[5] = "Camisa Supreme    "
			nomeProduto[6] = "Meia Nike         "
			nomeProduto[7] = "Meia Adidas       "
			nomeProduto[8] = "Bola de futebol   "  
			nomeProduto[9] = "Blusa moleton Nike"
			
			inteiro qtaAdicionadoCarrinho[10]
			qtaAdicionadoCarrinho[0] = 0
			qtaAdicionadoCarrinho[1] = 0
			qtaAdicionadoCarrinho[2] = 0
			qtaAdicionadoCarrinho[3] = 0
			qtaAdicionadoCarrinho[4] = 0
			qtaAdicionadoCarrinho[5] = 0
			qtaAdicionadoCarrinho[6] = 0
			qtaAdicionadoCarrinho[7] = 0
			qtaAdicionadoCarrinho[8] = 0
			qtaAdicionadoCarrinho[9] = 0
			
			
			inteiro valorProduto[10] = {200, 150, 100, 50, 500, 1000, 30, 25, 40, 120 }



			
			carrinho[0]=codigoProduto[0]+"\t"+nomeProduto[0]+"R$ "+(valorProduto[0]*qtaAdicionadoCarrinho[0])+"\t   "+qtaAdicionadoCarrinho[0]+"\n"
			carrinho[1]=codigoProduto[1]+"\t"+nomeProduto[1]+"R$ "+(valorProduto[1]*qtaAdicionadoCarrinho[1])+"\t   "+qtaAdicionadoCarrinho[1]+"\n"	
			carrinho[2]=codigoProduto[2]+"\t"+nomeProduto[2]+"R$ "+(valorProduto[2]*qtaAdicionadoCarrinho[2])+"\t   "+qtaAdicionadoCarrinho[2]+"\n"
			carrinho[3]=codigoProduto[3]+"\t"+nomeProduto[3]+"R$ "+(valorProduto[3]*qtaAdicionadoCarrinho[3])+"\t   "+qtaAdicionadoCarrinho[3]+"\n"
			carrinho[4]=codigoProduto[4]+"\t"+nomeProduto[4]+"R$ "+(valorProduto[4]*qtaAdicionadoCarrinho[4])+"\t   "+qtaAdicionadoCarrinho[4]+"\n"
			carrinho[9]=codigoProduto[9]+"\t"+nomeProduto[9]+"R$ "+(valorProduto[9]*qtaAdicionadoCarrinho[9])+"\t   "+qtaAdicionadoCarrinho[9]+"\n"
			



			cadeia nomeLoja,slogan
			escreva("\n ")
			escreva("\n ")
			nomeLoja = "\t\t\t\tLoja DevShoes"
			slogan = "- CodeStyle é vida!"
			escreva(nomeLoja)
			escreva(" ")
			escreva(slogan)
		
			escreva("\n ")
				
			escreva("\t\t\t\t■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
			escreva("\n")	
			escreva("\t\t\t\t\t    NOTA FISCAL\n")
			escreva("\n")
			
			escreva("\t\t\t  COD     Produto               Valor    Qnt  \n")
			escreva("\t\t\t____________________________________________\n")
			escreva("\t\t\t|" +codigoProduto[1]+"  | "+nomeProduto[1]+"   | "+valorProduto[1]+"     |"+qtaAdicionadoCarrinho[0]+"|\n")
			escreva("\t\t\t|###########################################\n")
			escreva("\t\t\t|" +codigoProduto[3]+"  | "+nomeProduto[3]+"   | "+valorProduto[3]+"     |"+qtaAdicionadoCarrinho[3]+"|\n")
			escreva("\t\t\t|###########################################\n")
			escreva("\t\t\t|" +codigoProduto[9]+"  | "+nomeProduto[9]+"   | "+valorProduto[6]+"     |"+qtaAdicionadoCarrinho[2]+"|\n")
			escreva("\t\t\t|###########################################\n")
			escreva("\t\t\t|" +codigoProduto[9]+"  | "+nomeProduto[9]+"   | "+valorProduto[6]+"     |"+qtaAdicionadoCarrinho[3]+"|\n")
			escreva("\t\t\t|###########################################\n")
			escreva("\t\t\t|" +codigoProduto[9]+"  | "+nomeProduto[9]+"   | "+valorProduto[6]+"     |"+qtaAdicionadoCarrinho[4]+"|\n")
			escreva("\t\t\t|###########################################\n")
			escreva("\t\t\t|" +codigoProduto[9]+"  | "+nomeProduto[9]+"   | "+valorProduto[6]+"     |"+qtaAdicionadoCarrinho[5]+"|\n")
			escreva("\t\t\t|###########################################\n")
			escreva("\t\t\t|" +codigoProduto[9]+"  | "+nomeProduto[9]+"   | "+valorProduto[6]+"     |"+qtaAdicionadoCarrinho[6]+"|\n")
			escreva("\t\t\t|###########################################\n")
			escreva("\t\t\t|" +codigoProduto[9]+"  | "+nomeProduto[9]+"   | "+valorProduto[6]+"     |"+qtaAdicionadoCarrinho[7]+"|\n")
			escreva("\t\t\t|###########################################\n")
			escreva("\t\t\t|" +codigoProduto[9]+"  | "+nomeProduto[9]+"   | "+valorProduto[6]+"     |"+qtaAdicionadoCarrinho[8]+"|\n")
			escreva("\t\t\t|###########################################\n")
			escreva("\t\t\t|" +codigoProduto[9]+"  | "+nomeProduto[9]+"   | "+valorProduto[6]+"     |"+qtaAdicionadoCarrinho[9]+"|\n")
			
			
					
			
			}

}

		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 14; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */