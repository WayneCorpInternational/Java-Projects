package AtividadeVetioresMatrix;

import java.util.Scanner;

public class Atividade1Vetores {

	public static void main(String[] args) {
		
			Scanner leitor = new Scanner(System.in);
			
			//variaveis
			
			int valor[] = new int[5];
			int maiorNota = 0;

			//continhas
			
			for (int x = 0; x <= 4; x++) {
				System.out.print("Digite um valor: ");
				valor[x] = leitor.nextInt();

				if (valor[x] > maiorNota) {
					maiorNota = valor[x];

				}

			}

			System.out.println("--------------------------");
			System.out.print("Os números digitados foram: ");

			//saidas
			
			//continhas
			
			for (int y = 0; y <= 4; y++) {
				
				System.out.print(valor[y] + " ");

			}
			
			//saidas
			
			System.out.println("\nA maior nota é: " + maiorNota);
			System.out.println("------------------------------");

			leitor.close();
		}	
	}