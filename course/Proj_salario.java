package course;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculoSalario;

public class Proj_salario {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner  sc  = new Scanner(System.in);
        
        CalculoSalario  emp = new CalculoSalario(); 
        
        
        
        System.out.println("Name :");
        emp.name = sc.nextLine();
        System.out.println("Gloss salary");
        emp.glosssalary = sc.nextDouble();
        System.out.println("Tax : ");
        emp.tax = sc.nextDouble();
        
        System.out.println("Employe :"+emp);
         
       System.out.println("Which percentage to increase salary ? ");
       double percentege = sc.nextDouble();
       emp.IncreaseSalary(percentege);
       
       System.out.println();
       System.out.println("Update data "+emp);
       sc.close();
 
	}

}
