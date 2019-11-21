package util;

public class CurrencyConverter {
	


	public static double  price;
	public static double  dollar;
	

	public static double CalculaDollar(double price,double dollar) {
		return (price *  dollar) + (price *  dollar * 6 / 100.00) ;
	}
	
}
