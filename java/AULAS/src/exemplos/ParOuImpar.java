package exemplos;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); //instanciamento
		
		//vari�veis
		int numero;

		//entrada
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		
					
		//sa�da
		if (numero == 0){
		System.out.println(numero+" � neutro");	
		
				} 
		
		else if (numero <= 0){
		System.out.println(numero+" N�o � permitido n�mero negativo");	
		} 
		
		else if(numero % 2 == 0){
		System.out.println(numero+" � par");

		}
		
		else {
		System.out.println(numero+" � �mpar");
		
		}
	}
}
