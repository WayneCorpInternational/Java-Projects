package Classes;

public class Atividade1Classe {

	public static void main(String[] args) {
		Cliente1AtividadeClasse cli1 = new Cliente1AtividadeClasse();
		
		cli1.anoNascimento = 2000;
		cli1.nome = "marcos";
		cli1.pronome = '2';
		cli1.cpf = "111.111.11-11";
		
		cli1.ativarCliente();	
		System.out.println("idade do cliente é: "+cli1.calculeIdade(2021));		
		System.out.println("Bom dia %s %s",cli1.tratamento('2'),cli1.nome);
		
		//variaveis
		//entradas
		//continhas
		//saidas	
	}
}
