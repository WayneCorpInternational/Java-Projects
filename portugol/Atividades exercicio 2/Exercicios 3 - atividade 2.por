programa
{

    inclua biblioteca Matematica --> mat
    funcao inicio()
    {
    
        real q1,q2,q3,h3,q4

        h3 = 0.0

        escreva ("Valor do quadrado a:")
        leia (q1)

        escreva ("Valor do quadrado b:")
        leia (q2)

        escreva ("Valor do  quadrado c:")
        leia (q3)

        escreva ("Valor do quadrado d:")
        leia (q4)

        escreva ("\n")
        h3 = mat.potencia(q3,2.0) 
        se (h3 >= 1000) 
        {
            escreva ("O valor do n3 é: " + h3 + " vc montou o cubo magico!!")
        }
        senao 
        {
            escreva ("Valor do n1 é: " + q1 + ", seu quadrado é: " + mat.potencia(q1, 2.0))
            escreva ("\nValor do n2 é: " + q2 + ", seu quadrado é: " + mat.potencia(q2, 2.0))
            escreva ("\nValor do n3 é: " + q3 + ", seu quadrado é: " + mat.potencia(q3, 2.0))
            escreva ("\nValor do n4 é: " + q4 + ", seu quadrado é: " + mat.potencia(q4, 2.0))
        }
        escreva ("\n\n")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 538; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */