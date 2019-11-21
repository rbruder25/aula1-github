package course;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class CotacaoDolar {

	public static void main(String[] args) {

		   Locale.setDefault(Locale.US);
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("What is the dollar price ?");
		   double price = sc.nextDouble();
		   System.out.println("How many dollar will be bought");
		   double dolar = sc.nextDouble();
		   double v = CurrencyConverter.CalculaDollar(price,dolar);
		    System.out.printf("Amount to be paid in reais %.2f%n",v);
		    
		    		
		   
		   
		   sc.close();

	}

}
