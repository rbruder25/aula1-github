package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Proj_estoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter producto data :");
		System.out.print("Name : ");
		String name = sc.nextLine();
		System.out.print("Price : ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock : ");
		int quantity = sc.nextInt(); 

		Product product = new Product(name, price, quantity); //tres argumentos
		
 //    Product product = new Product(name,price); // dois argumentos.

		
		product.setName("Computer");
		System.out.println("Update Name : "+product.getName());
		product.setPrice(129.000);
		System.out.println("Update Price :"+product.getPrice());
	    System.out.println("Update Quantity"+product.getQuantity());
		
		
		System.out.println();
		System.out.println("Product Data : " + product);


		System.out.println();
		System.out.print("Enter the number of products to be added in Stock : ");
		 quantity = sc.nextInt();
		product.addProdutcts(quantity);

		System.out.println();
		System.out.println("Updated  Data : " + product);

		System.out.println();
		System.out.print("Enter the number of products to be remove in Stock : ");
/*		quantity = sc.nextInt();
		product.removeProducts(quantity); */

		System.out.println();
		System.out.println("Updated  Data : " + product);

		sc.close();

	}

}
