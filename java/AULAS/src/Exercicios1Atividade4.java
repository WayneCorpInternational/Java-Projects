import java.util.Scanner;

public class Exercicios1Atividade4 {
	
public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in); //instanciamento
		
		//variaveis
		
		double A;
		double B;
		double C;
		double D;
		double R;
		double S;

		//entradas
		
		System.out.println(" N�mero A: \n ");
		A=myInput.nextDouble();
		System.out.println(" N�mero B: \n ");
		B=myInput.nextDouble();
		System.out.println(" N�mero C: \n ");
		C=myInput.nextDouble();
		
		//continhas
		
		R = Math.pow((A + B),2.0);		
		S = Math.pow((B + C),2.0);
		D = (R + S) / 2;

		
		
		//saidas
		System.out.println(" O resultado �: ");
		
		System.out.println(" R = " +R);
		System.out.println(" R = " +D);
		System.out.println(" R = " +S);
	
}
}