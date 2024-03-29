import java.util.Locale;
import java.util.Scanner;

import util.Caculator;



public class Circuferencia_1 {
	


	public static void main(String[] args) {

	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    	    
	    System.out.println("Enter radius"); 
	    double radius = sc.nextDouble();
	    
	    double c =  Caculator.circuference(radius);
	    
	    double v = Caculator.volume(radius);
	    
	    System.out.printf("Circuference : %.2f%n ",c);
	    System.out.printf("Volume %.2f%n",v);
	    System.out.printf("PI value : %.2f%n",Caculator.PI);
        sc.close();
	}
	
	public static double circuference(double radius) {
		return 2.0 * PI * radius;
	}
     
	public static double volume(double radius)  {
		return 4.0 * PI * radius*radius*radius / 3.0;
	}
	
	
}
