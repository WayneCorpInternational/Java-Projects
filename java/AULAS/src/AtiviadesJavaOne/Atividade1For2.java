package AtiviadesJavaOne;

import java.util.Scanner;

public class Atividade1For2 {

	
		public static void main(String[] args) {
			
			Scanner mySc = new Scanner(System.in);
		
			//variaveis
			
			int n,x,countPar=0,countImpar = 0;
			
			
			//continhas
			for (x=0; x<10; x++) {
				
				System.out.printf("Entre com algum valor númerico: ");
				n = mySc.nextInt();
				
				if((n%2)==0) {
					countPar = countPar + 1;
				}
				
				else if((n%2)==1) {
					countImpar = countPar + 1;
				}
				
				else {
					System.out.println("Você deve digitar um número!\n");
				}
				}
			
			//saidas
			
			System.out.println("\n");
			System.out.print("Quantidade de números Pares é "+countPar);
			System.out.print("\nQuantidade de números Impares é "+countImpar);
			
	}
}
