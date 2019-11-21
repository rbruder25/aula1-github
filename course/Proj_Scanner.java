package course;

import java.util.Scanner;

public class Proj_Scanner {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 String x,y,z;
		 String sentence = sc.nextLine(); 
		 x = sc.next();
		 y = sc.next();
		 z = sc.next();
		 
	    System.out.println(sentence);
	    System.out.println(x);
	    System.out.println(y);
	    System.out.println(z);
	    
		 x = sc.next();
		 y = sc.next();
		 z = sc.next();
		
		 System.out.println(x);
	     System.out.println(y);
		 System.out.println(z);
	 sc.close();	 

	}

}
