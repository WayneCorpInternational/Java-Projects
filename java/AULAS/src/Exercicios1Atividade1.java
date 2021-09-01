import java.util.Scanner;

public class Exercicios1Atividade1 {

	public static void main(String[] args) {
	
	//Variaveis
		@SuppressWarnings("resource")
		Scanner myInput = new Scanner(System.in); //instanciamento
	
		int qtAnos;
		int qtMeses;
		int qtDias;
		int idade;
	
		
	//Entradas
		System.out.println(" Quantos anos voce tem ?: ");
		qtAnos = myInput.nextInt();
		System.out.println(" Quantos meses voce tem ?: ");
		qtMeses = myInput.nextInt();
		System.out.println(" Quantos dias voce tem ?: ");
		qtDias = myInput.nextInt();
	
		//leia(numeros)
		//qtAnos = myInput.nextInt();
		
		//qtMeses = myInput.nextInt();
		
		//qtDias = myInput.nextInt();
		
	//Conta
		idade = (qtAnos*365) + (qtMeses * 30) + qtDias;
		
	//Saidas = mostra resultado
		System.out.println(" Sua idade em dias é: " +idade);
		
			
	}
}
