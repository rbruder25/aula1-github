package course;

import java.util.Locale;
import java.util.Scanner;

import entities.MovimentoBanco;

public class ContaBancaria {
	
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    MovimentoBanco movimento;
	    
	    System.out.print("Enter account number : ");
	    int numeroconta = sc.nextInt();
	    System.out.print("Enter account holder : ");
	    sc.nextLine();
	    String holder = sc.nextLine();
	    System.out.print("Is there na initial deposit (y/n): ");
	    String  confirma = sc.nextLine();
	  if (confirma.equals("y"))  {	
  	    System.out.print("Enter initial deposit value : ");
	     double initialdeposit = sc.nextDouble();
		 movimento = new MovimentoBanco(numeroconta,holder,initialdeposit);
	  }else
		 movimento = new MovimentoBanco(numeroconta, holder);	
    	    

	    
	    System.out.println("Accout data : ");
	    System.out.println(movimento);
	        
	    
	    System.out.println();
	    System.out.print("Enter a deposit value:");
	    double depositvalue  = sc.nextDouble();
	    movimento.deposito(depositvalue);
	    System.out.println("Update account value data : ");
	    System.out.println(movimento);
	    
	    System.out.println();
	    System.out.print("Enter a withdraw value:");
	    double withdrawvalue  = sc.nextDouble();
	    movimento.withdraw(withdrawvalue);
	    System.out.println("Update account value data : ");
	    System.out.println(movimento);
	/*    
	    System.out.print("Enter a deposit value : "+movimento.getDeposito());
	    System.out.println("Update account data");
	    deposito = sc.nextDouble();
	    movimento.setDeposito(deposito);
	    System.out.println(movimento);	 
	    
	    System.out.println("Enter a whithdraw values : "+movimento.getRetira());
	    retira =  sc.nextDouble();
	    movimento.setRetira(retira);
	    System.out.println("Account : "+conta
				+", Holder :" +nome
				+", Balance : $ "+String.format("%.2f", movimento.getRetira()));
	 	    */
	    sc.close();
	  }
	}
	


