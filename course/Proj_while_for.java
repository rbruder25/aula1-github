package course;

import java.util.Scanner;

public class Proj_while_for {

	public static void main(String[] args) {
	   
		
		  Scanner sc = new Scanner(System.in);
		     
			 int  valor1  = 0;
			 int  valor2  = 0;
			 int  valor3  = 0; 
 			 System.out.println("Enter Nr.");
			 int nr = sc.nextInt();
			 
		      if (nr < 0 ) {
		    	while  (nr <= 0) { 
			        System.out.println("N must be positive Try again :");
		        	nr = sc.nextInt();
		       }
		      }
		     
	 		 
			 for (int i = 1 ; i <= nr; i++ ) {
				 
				 System.out.print("Value #");
				 int x = sc.nextInt();
				 valor1 = x;
		 		 if (valor1  > valor2 )
				 {
					 valor3 = valor1;
                     valor2 = x;
				 }

			 }
		     System.out.println("Valor Maior  é :" + valor3);
	     	  sc.close(); 
	      }
}
	
