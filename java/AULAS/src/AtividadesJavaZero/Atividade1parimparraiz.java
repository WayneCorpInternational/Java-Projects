package AtividadesJavaZero;

import java.util.Scanner;

public class Atividade1parimparraiz {

public static void main(String[] args) {
		
		//4- Faça um programa em que permita a entrada 
		//de um número qualquer e exiba se este número é 
		//par ou ímpar. Se for par exiba também a raiz 
		//quadrada do mesmo; se for ímpar exiba o número 
		//elevado ao quadrado.
	
		@SuppressWarnings("resource")
		Scanner mySc = new Scanner(System.in);
		
		//variaveis
		int x;
		
		//entradas
		System.out.println("Digite uma número: ");
		x = mySc.nextInt();
		
		
		//saidas
		
		if((x%2)==0){
			System.out.printf("Você digitou "+x);
			System.out.printf("\nRaiz quadrade é "+Math.sqrt(x));
			
		}
		
		else {
			System.out.printf("Você digitou "+x);
			System.out.printf("\n","Seu número elevado ao quadrado "+Math.pow(x,2));
		}

	}

}
