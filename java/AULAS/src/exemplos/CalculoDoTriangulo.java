package exemplos;

import java.util.Scanner;

public class CalculoDoTriangulo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		
		//variaveis
		
		double base1, base2, altura2, area2=0, altura1, area1=0, resultado;
		
		System.out.println("Digite o valor da base: ");
		base1 = leia.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		altura1 = leia.nextDouble();
		
		
		
		
		System.out.println("Digite o valor da base: ");
		base2 = leia.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		altura2 = leia.nextDouble();
		
		
		System.out.println("O valor da área desse triângulo 1 é de: "+ ((base1*altura1)/2));
		System.out.println("O valor da área desse triângulo 2 é de: "+ ((base2*altura2)/2));
		
		if (area1 == area2 ) {
			System.out.println(" Triangulo iquais ");
			
		}
		
		else if() {
		System.out.println(" Triangulo 2 é maior que triangulo 1 ");

	}
	}
}
