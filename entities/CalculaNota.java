package entities;

public class CalculaNota {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double ResultadoNota() {
		return nota1+nota2+nota3;
	}
	
	public double missingPoints() {
		  if (ResultadoNota() < 60.0) {
			    return 60.0 - ResultadoNota();
		  } 
	       else {
			  return 0.0; 
		  }
  }
	

	
	
}	


	
	