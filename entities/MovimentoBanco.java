package entities;

public class MovimentoBanco {

	private int  conta ;
	private String nome;
	private double  valor = 0;

	
	public MovimentoBanco(int conta, String nome, double  depositoInicial) {
		this.conta = conta;
		this.nome = nome;
		this.deposito(depositoInicial);
	}
	
	public MovimentoBanco(int conta, String nome) {
		super();
		this.conta = conta;
		this.nome = nome;
	}
		
	public int  getConta() {
		return conta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getvalor() {
		return valor ;
	}
	
	
   public void deposito(double montante) {
	   valor += montante;
   }

   public void withdraw(double montante) {
	   valor -= montante + 5.0;
   }

	public String toString() {
		
	  	return  "Account : "+conta
				+", Holder :" +nome
				+", Balance : $ "+String.format("%.2f", valor);
	}
}
