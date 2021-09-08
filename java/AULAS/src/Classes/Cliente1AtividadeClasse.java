package Classes;

public class Cliente1AtividadeClasse {

	//atributos
	public String cpf;
	public String nome;
	public int anoNascimento;
	public boolean ativo;
	public char pronome;
	
	//construtor
	
	
	//encapsulamento
	
	
	//metodos
	
	public  int calculeIdade() {
		
		return 2021-this.anoNascimento;
	}
	
	
	public  int calculeIdade(int anoAtual) {
		
		return (anoAtual-this.anoNascimento);
	}	
	
	public void ativarCliente() {
		
		ativo = true;
	}
	
	
	public void desativarativarCliente() {
		
		ativo = false;
	}
	
	public String tratamento(char codigo) {
		String  resposta="";
		if (codigo=='1') {
			resposta = "senhor";
			}
		
		else if (codigo=='2') {
			resposta = "senhora";
			}
		
		else if (codigo=='2') {
			resposta = "senhore";
			}
		
		else {
			resposta="senho";
		}
		return resposta;		
	}
}
