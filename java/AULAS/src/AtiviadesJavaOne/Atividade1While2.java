package AtiviadesJavaOne;

import java.util.Scanner;

public class Atividade1While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					
					Scanner mySc = new Scanner(System.in);
					
					//variaveis
					
					int age;
					int sex;

					int pessoasCalmas=0;
					int mas=0;
					int out=0;
					
					//Pesquisa
					
					int numeroPessoasCalmas=0;
					int numeroMulheresNervosas=0;
					int numeroHomensAgressivos=0;
					int numeroOutrosCalmas=0;
					int numeroPessoasNervosas40=0;
					int numeroPessoasCalmas18=0;
					int pesquisa=0;	
					int contador=0;
					final int PESSOAS=3;
					
					//continhas
					
					
					while(contador <PESSOAS) {
						contador++;
						System.out.printf("Digite a idade: "+contador+" ");
						age = mySc.nextInt();
						
						System.out.printf("Digite o sexo: \n(1-feminino / 2-masculino / 3-Outros)");
						sex = mySc.nextInt();
						
						System.out.printf("\n");
						
						System.out.printf("Responda a pesquisa de comportamento: \n");
						System.out.printf("1 - calma\n");
						System.out.printf("2- nervosa\n");
						System.out.printf("3 - agressiva\n");
						
						pesquisa = mySc.nextInt();
						
						// Pesquisa2
						
						if(pesquisa == 1) {
							pessoasCalmas++;
						}
						if(pesquisa == 2 && sex ==1){
							numeroMulheresNervosas++;
						}
						
						
						if(pesquisa == 2 & age >40){
							numeroPessoasNervosas40++;
						}
						if(pesquisa == 1 & age <18){
							numeroPessoasCalmas18++;
						}
						if(pesquisa == 1 && sex == 2){
							numeroHomensAgressivos++;
						}
				
					}
					
					//saidas
					
					//o n�mero de pessoas calmas;pessoasCalmas
					System.out.printf("\nN�mero de pessoa calmas: "+pessoasCalmas);
					
					//o n�mero de mulheres nervosas;
					System.out.printf("\nN�mero de mulheres nervosas "+numeroMulheresNervosas);
					
					//o n�mero de homens agressivos;numeroHomensAgressivos
					System.out.printf("\nN�mero de homens agressivos "+numeroHomensAgressivos);
					
					//o n�mero de outros calmos;
					System.out.printf("\nN�mero de outros calmos",out);
					
					//o n�mero de pessoas nervosas com mais de 40 anos;
					System.out.printf("\nN�mero de pessoas com mais de 40 anos "+numeroPessoasNervosas40);
					
					//o n�mero de pessoas calmas com menos de 18 anos.*/
					System.out.printf("\nN�mero pessoas calmas com menos de 18 anos "+numeroPessoasCalmas18);
						
	}

}
