package course;

public class Proj_ternario {

	public static void main(String[] args) {
		
      double preco = 34.5;
      double descont = (preco <20.0) ? preco * 1 : preco * 0.05;
      
      System.out.println(descont);

	}

}
