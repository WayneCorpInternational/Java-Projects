import java.util.Scanner;

public class cleciusparafarenh {
	
	public static void main(String[] args) {
	
		//variaveis
		Scanner leia= new Scanner(System.in); //instanciamento
		String nome;
		double celsius;
		
		
		//entradas
		System.out.println("Digite o nome: ");
		
		//leia(nome)
		nome = leia.next();
		System.out.println("Digite sua temperatura em celsius: ");
		celsius = leia.nextDouble();
		
		celsius = ( 9 * celsius + 160 ) / 5;
		
		//saida de info
		System.out.println(nome.toUpperCase()+ " sua idade temperatura é "+ celsius +" fahrenheit.");
				
	}
		
}