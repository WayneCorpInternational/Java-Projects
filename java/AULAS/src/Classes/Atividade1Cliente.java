
package Classes;

import  Classes.Atividade1;

public class Atividade1Cliente {
	public static void main (String[] args) {
		Atividade1 cliente1 = new Atividade1();
		
		cliente1.Preenchimento();
		
		System.out.println("\nNome: \t" + cliente1.nome);
		System.out.println("E-mail: \t" + cliente1.email);
		System.out.println("Pronome: \t" + cliente1.pronome);
		System.out.println("CPF: \t" + cliente1.CPF);
		System.out.println("Ano de Nascimento: \t" + cliente1.anoNascimento);
		
	}	
	}


