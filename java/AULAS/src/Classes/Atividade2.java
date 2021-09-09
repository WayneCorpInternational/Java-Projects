package Classes;

import Classes.Atividade2Cliente;

public class Atividade2 {
	
	public static void main(String[] args){
	
		Atividade2Cliente aero1 = new Atividade2Cliente();
	
	aero1.Preenchimento();
	
	System.out.println("Modelo: \t" + aero1.modelo);
	System.out.println("Codigo de identificação: \t" + aero1.codId);
	System.out.println("Ano: \t" + aero1.ano);
	System.out.println("Capacidade: \t" + aero1.capacidade);
	System.out.println("Assentos ocupados: \t" + aero1.assentosOcupados);
}
}
