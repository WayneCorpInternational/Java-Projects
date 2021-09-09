package Classes;

import Classes.Atividade5;

public class Atividade5Cliente {


		public static void main (String[] args) {

			Atividade5 patinete1 = new Atividade5();
		
		patinete1.Sistema();
		
		System.out.println("Modelo: \t" + patinete1.modelo);
		System.out.println("Codigo de identificação: \t" + patinete1.codId);
		System.out.println("Ano: \t" + patinete1.ano);
		System.out.println("Valor: \tR$ " + patinete1.valor);
		System.out.println("Estoque: \t" + patinete1.estoque);
	}

	}
