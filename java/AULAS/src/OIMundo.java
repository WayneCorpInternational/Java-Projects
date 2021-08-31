import java.util.Scanner;

public class OIMundo{
	
	public static void main(String[] args) {
	
		//variaveis
		Scanner leia= new Scanner(System.in); //instanciamento
		String nome;
		int anoNascimento;
		int anoAtual=2021;
		
		//entradas
		System.out.println("Digite o nome: ");
		
		//leia(nome)
		nome = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		//saida de info
		System.out.println(nome.toUpperCase()+ " sua idade é "+(anoAtual-anoNascimento)+" anos.");
				
	}
		
}
