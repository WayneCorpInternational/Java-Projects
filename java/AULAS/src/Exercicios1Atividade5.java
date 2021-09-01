import java.util.Scanner;
public class Exercicios1Atividade5 {

	public static void main(String[] args) {
	
		//variaveis
		
		@SuppressWarnings("resource")
		Scanner myInput = new Scanner(System.in); //instanciamento
		
		double aluno1;
		double aluno2;
		double aluno3;
		double media;
		
		//entradas
		
		System.out.println(" Aluno Matheus: \n ");
		
		aluno1=myInput.nextDouble();
		
		System.out.println(" Aluna Julia \n ");
		aluno2=myInput.nextDouble();
		
		
		System.out.println(" Aluno Carlos: \n ");
		aluno3=myInput.nextDouble();
		
		//saidas
		
		media = ((aluno1 * 2) + (aluno2 * 3) + (aluno3 * 5)) / 10;
		System.out.println("Media da sala é: " + media );
				
	}
	}
		


