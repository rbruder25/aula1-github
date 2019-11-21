package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetorrent;
	
public class VetorQuarto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be retend ?");
		Integer n = sc.nextInt();

		Vetorrent[] vectrent = new Vetorrent[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + i);
			System.out.print("Name :");
			String name = sc.next();
			System.out.print("Email :");
			String email = sc.next();
			System.out.print("Room :");
			int room = sc.nextInt();
			System.out.println("");
			System.out.println("");
			vectrent[i] = new Vetorrent(name, email, room);

		}

		System.out.println("Busy rooms :");
		for (int y = 0; y < 10; y++) {
			for (int i = 0; i < n; i++) {
				if (y == vectrent[i].getRoom()) {
					System.out.println(
							vectrent[i].getRoom() + " :" + vectrent[i].getName() + "," + vectrent[i].getEmail());

				}
			}
		}
		sc.close();
	}

}

     
