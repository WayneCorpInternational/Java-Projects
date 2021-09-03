package AtiviadesJavaOne;

import java.util.Scanner;

public class Atividade1DoWhile2 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner mySc = new Scanner(System.in);
			
			//variaveis
			
			int numero=0;
			int contador=0;
			double media=0.00;
			double total=0.00;
			
			//continhas
			
			do {
				System.out.print("Digite um numero : ");
				numero = mySc.nextInt();
				if(numero>0 && (numero%3)==0){
					//Contador
					numero++;
					//Totalizador
					total += numero;
				
				}
				
			}while(numero >0);
			
			if(contador > 0) {
				media = total/contador;
			}
			
			//saidas
			
			System.out.printf("Total de numero %.0f\nTotal de números digitaldos multiplos de 3 %d\nE a mé média %.2f",total,contador,media);
			
	}

}
