package AtiviadesJavaOne;

import java.util.Scanner;

public class Atividade1While1 {

	public static void main(String[] args) {
		
			Scanner mySc = new Scanner(System.in);
	
			//variaveis
			
			int age=0;
			int count21=0; 
			int count50=0;
			

			//continhas
			
			while(age >=0) {
				
				System.out.print("Digite a idade de uma pessoa: ");
				age = mySc.nextInt();

				if (age >0 && age <=21) {
					count21++;
				
				}
				
				else if(age>50 && age <=99) {
					count50++;
				}
				
				else if(age == -99)  {
					System.out.printf("Fim do programa..");
				
					break;
				}
			}
			
			//saidas
			
			System.out.print("\n");
			System.out.printf("Total de pessoas com < 21 anos "+ count21);
			System.out.printf("\nTotal de pessoas com > 50 anos "+ count50);
		
	}

}
