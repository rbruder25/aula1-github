package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Vetorrent;
import entities.Vetortotfunc;

public class Empregados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be registered ? ");
		Integer n = sc.nextInt();
		n = n+1;
		
	
			 List<Vetortotfunc>  list = new ArrayList<>();
		
		for (int i = 1 ; i < n; i++) {
			System.out.println("Employe # " + i + ": ");
				
			
			System.out.print("Id: ");
			int  id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: "); 
			double  salary = sc.nextDouble();
			list.add(new Vetortotfunc(id, name , salary));
		}
		     System.out.println();
		     System.out.println();
		    System.out.print("Enter the employee id that will have salary increase :");
		     int id = sc.nextInt();
		     Vetortotfunc emp = list.stream().filter(x -> x.getId()== id ).findFirst().orElse(null);
		     if (emp == null) {
		    	 System.out.println("this id does not exist !");
	   	 	 } else {
	   	 		 System.out.print("Enter the persentage");
	   	 		 double percentage = sc.nextDouble();
	   	 		 emp.increaseSalary(percentage);
	   	 		 	
	   	 	 }
		     
		     System.out.println();
		     System.out.println("List of employees : ");
		     for (Vetortotfunc obj : list) {
		    	    System.out.println(obj);
		     }
		sc.close();

	}

}
