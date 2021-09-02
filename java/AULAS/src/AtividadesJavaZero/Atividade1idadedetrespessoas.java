package AtividadesJavaZero;

import java.util.Scanner;

public class Atividade1idadedetrespessoas {

public static void main(String[] args) {
		
		Scanner mySc = new Scanner(System.in);
		
		//variaveis
		
		int age;

		//3 - Faça um programa que receba a idade de uma pessoa 
		//e mostre na saída em qual categoria ela se encontra:
		
		
		//entradas
		
		
		System.out.println("Digite a sua idade: ");
		age = mySc.nextInt();
		
		
		
		//saidas
		
		if(age>0 && age <=14){
			System.out.println("A sua categoria é infantil. ");
		}
		
		else if(age >14 && age <=17) {
			System.out.println("A sua categoria é juvenil. ");
		}
		
		else if(age > 17 && age <=25) {
			System.out.println("A sua categoria é adulto. ");
		}
		
		else if(age>25){
			System.out.println("A categoria para a sua idade ainda não foi cadastrada.\nVolte em outro momento. ");
		}
		
		else {
			System.out.println("Digite um valor de idade válido.");
		
		
		}
	}
	
}
