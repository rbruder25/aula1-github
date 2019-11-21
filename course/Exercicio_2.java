package course;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       //Alex Green
	   System.out.print("Enter your Full name :");
	   String nome = sc.nextLine();
	   //
       System.out.print("How many bedrooms are there in your house ?");
       int n1 = sc.nextInt();
       //500.50
	   System.out.print("Enter product price");
	   double price = sc.nextDouble();
	   //Green 21 1.73
	   System.out.print("Enter your last name, age and height ");
	   //Green 21 1.73
	   String name2 = sc.next();
	   int age = sc.nextInt();
	   double height = sc.nextDouble();
			   
       
	   

	   System.out.println(nome);
	   System.out.println(n1);
	   System.out.println(price);
	   System.out.println(name2);
	   System.out.println(age);
	   System.out.println(height);
	   
	   sc.close();
	}

}
