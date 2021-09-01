import java.util.Scanner;

public class Exercicios1Atividade2 {

	public static void main(String[] args) {
	
		//Variaveis
		@SuppressWarnings("resource")
		Scanner myInput = new Scanner(System.in); //instanciamento
		
		double entradaDias;
		double qtdAnos;
		double qtdMeses;
		double qtdDias;
		

		
		//Entradas
		System.out.println(" Qual a sua idade ( dias ) \n ");
		entradaDias = myInput.nextDouble();
		
		//continhas
		qtdAnos = (entradaDias / 365);
		entradaDias -= (qtdAnos * 365);

		if (entradaDias <= 31){
			qtdMeses = 0;
			qtdDias = entradaDias;
		
		}
		
		else{
		
			qtdMeses = entradaDias/30;
			entradaDias -= qtdMeses*30;
			qtdDias = entradaDias;
		}
		
		//saidas
		
		System.out.println(" Idade (anos) :" + qtdAnos );
		System.out.println(" Idade (meses) : " + qtdMeses);
		System.out.println(" Idade (dias) : " + qtdDias);
			
	
	}
}
