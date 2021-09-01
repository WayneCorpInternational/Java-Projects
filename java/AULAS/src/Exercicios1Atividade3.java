import java.util.Scanner;

public class Exercicios1Atividade3 {
		
	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in); //instanciamento
		
		//variaveis
		double tempoEmsegundos;
		double horas;
		double minutos;
		double segundos;

		System.out.println(" Quantos segundos voce deseja? ");
		tempoEmsegundos=myInput.nextDouble();

		//continhas
		horas = (tempoEmsegundos / 3600);
		minutos = ((tempoEmsegundos % 3600)/60);
		segundos =  ((tempoEmsegundos % 3600)%60);
		
		//saidas
		
	    System.out.println("horas : "+ horas );
		System.out.println("minutos: "+ minutos );
		System.out.println("segundos: "+ segundos );
		
}
}