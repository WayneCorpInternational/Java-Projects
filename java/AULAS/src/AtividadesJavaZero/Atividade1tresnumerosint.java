package AtividadesJavaZero;

import java.util.Scanner;

public class Atividade1tresnumerosint {
	
		public static void main(String[] args) {
		
		//variaveis	
		int a,b,c;
		
		//1 - Faça um programa que receba três 
		//inteiros e diga qual deles é o maior.
		
		
		Scanner mySc = new Scanner(System.in);
		
		
		//entradas
		System.out.println("Valor de A");
		a = mySc.nextInt();
		
		System.out.println("Valor de B");
		b = mySc.nextInt();
		
		System.out.println("Valor de C");
		c = mySc.nextInt();
		
		//saidas
		
		if(a==b && b==c) {
			System.out.printf("%d, %d, %d",a,b,c);
		}
		
		else if(a<=b && b<=c) {
			System.out.printf("%d, %d, %d",a,b,c);
		}
		
		else if(a<=c && c<=b) {
			System.out.printf("%d, %d, %d",a,c,b);
		}
		
		else if(b<=a && b<=c && a<=c) {
			System.out.printf("%d, %d, %d",b,a,c);
		}
		
		else if(c<=a && c<=b && b<=a){
			System.out.printf("%d, %d, %d",c,b,a);
		}
		
		else {
			System.out.printf("%d, %d, %d",c,a,b);
		}
	}
}
	
