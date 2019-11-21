package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Triagle;

public class Proj_Calciula_triagulo {

	public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         Triagle x,y;
         
         x = new Triagle();
         y = new Triagle();
         
         System.out.println("Enter the measures of triangle X:");
         x.a = sc.nextDouble();
         x.b = sc.nextDouble();
         x.c = sc.nextDouble();
         
         System.out.println("Enter the measures of triangle y:");
         y.a = sc.nextDouble();
         y.b = sc.nextDouble();
         y.c = sc.nextDouble();
         
         double areax  = x.area();
         
    
         double areay  = y.area();
        
         System.out.printf("Triangule X area :%f%n",areax);
         System.out.printf("Triangule Y area :%f%n",areay);
         
         if (areax > areay) {
             System.out.println("Larger area is : X");
    
         } else System.out.println("Larger area is : Y");
         
         
      sc.close(); 		 
         
         
         
         
	}

}
