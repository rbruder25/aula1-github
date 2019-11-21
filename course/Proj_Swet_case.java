package course;

import java.util.Scanner;

public class Proj_Swet_case {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
				int x = sc.nextInt();
		        String day;
		        
		        switch (x) {
		        	case 1:
		        		day = "Sunday";
		        		break;
		        	case 2:
		        		day = "Monday";
		        		break;
		        	default :
		        		day = "Invalid day";
		        		break;
		        }
		        System.out.println(day);
        		sc.close();        		
		        	
		        
		

	}

}
