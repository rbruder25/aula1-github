package course;

import java.util.Scanner;

public class Proj_while2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a numbere");
		int nr = sc.nextInt();
		
		while (nr != 2002) {
			System.err.printf("Senha incorreta %n");
			System.out.println("Digite outra Senha");
			nr = sc.nextInt();
		}
		System.out.println("Password correct");
		
	}
	


}
