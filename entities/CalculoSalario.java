package entities;

public class CalculoSalario {
	
	public String name;
	public Double glosssalary;
	public Double tax;
	
     public double NetSalary() {
		return glosssalary - tax;
    	 
     }
	
	public void  IncreaseSalary (double percentage ) {
		this.glosssalary += glosssalary*percentage/100.0;
	}
	
	public String toString() {
		return name+", $"
		+String.format("%.2f", NetSalary());
	}
	
	
			
			
}
