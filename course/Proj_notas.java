package course;

import java.util.Locale;
import java.util.Scanner;
import entities.CalculaNota;

 class Proj_notas {

	public static void main(String[] args) {
	       
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 CalculaNota calc = new CalculaNota();
		 
		 System.out.println("Digite o Nome do Aluno : ");
		 calc.nome = sc.next();
		 System.out.println("Digite Primeira Nota ");
		 calc.nota1 = sc.nextDouble();
	     System.out.println("Digite Segunda Nota ");
		 calc.nota2 = sc.nextDouble();		 
		 System.out.println("Digite a Terceira nota");
		 calc.nota3 = sc.nextDouble();		 
		 
		 System.out.printf("Final grade = %.2f%n",calc.ResultadoNota());
		 
	 
		 if (calc.ResultadoNota() < 60) 
		 {
			    System.out.println("FAILED");
			    System.out.printf("Missing %.2f POINTS%n",calc.missingPoints());
    
		 } else  {
			 System.out.println("PASS");
		 }
		 
/*		
		 if ( resultado2 >= 60) {
			 System.out.println("PASS");
        	}
		 else  
		 {
			 System.out.println("FAIL");
	     	 System.out.print("Missing "+falta+" POINTS");
		 }

		     */
		     

		 
		 sc.close();
	  	

	}

}
