package course;

import java.util.Scanner;

public class Proj_If_Else {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
/*		System.out.println("What time it ?");
		int time = sc.nextInt();
		
		if (time < 12 ) {
			  System.out.println("Good morning");
		}
		else if (time < 18) {
			 System.out.println("Good afternoon");
		}
		else if (time > 18) {
			 System.out.println("Good evening");
		}
		
	*/	
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
				
				
		 if (num > num2 ) {
			 System.out.println(num);
		 }
		 else if (num2 > num  && num2 > num3 )
		     System.out.println(num2);
		 else if (num3 > num2 && num3 < num   )
			 System.out.println(num3);
		 else if (num == num2 && num2 == num3 )
			 System.out.println(num3);
		sc.close();
	}

}
