package AtividadeVetioresMatrix;

import java.util.Random;
import java.util.Scanner;

public class Atividade1Matrix {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Random gerador = new Random();
		
		//variaveis
		
		int[][] Matriz = new int[3][3];
		int somaMatriz = 0, somaDiagonal = 0;
		
		//continhas
		
		for (int linha = 0; linha < 3; linha++) {

			for (int coluna = 0; coluna < 3; coluna++) {
				
				Matriz[linha][coluna] = gerador.nextInt(50);
				somaMatriz = somaMatriz + Matriz[linha][coluna];
				
				
				if (linha == coluna) {
					somaDiagonal = somaDiagonal + Matriz[linha][coluna];
				}
			}
		}
		
		//saidas
		
		System.out.println("A soma da matriz :" + somaMatriz);
		System.out.println("A soma da diagonal :" + somaDiagonal);
		leia.close();	
	}
}
