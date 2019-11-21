package course;

public class Primitivo {

	public static void main(String[] args) {
//Primitivo
	  boolean completed = 	false;
	  char gender = 'F';
	  char letter = '\u0041'; //ucode
	  byte n1 = 126;
	  int  n2 = 1000;
	  int  n3 = 2147483647;
	  long n4 = 2147483648L;
	  float n5 = 4.5f;
	  double n6 = 4.5;
	  //não é primitivo
	  String name = "Maria Green";
	  Object obj1 = "Alex Brown";
	  Object obj2 = 4.5f;
	  //Casting
	    double a;
	    float  b;
	    a = 5.0;
	    b = (float)a;
	    
	    int c;
	    double result;
	    String s = "33";
	    
	    c = Integer.parseInt(s);
	    result = Double.parseDouble(s);
	    
	    

	    		
	  
System.out.println("---------primitivo------------");  
	  System.out.println(completed);
	  System.out.println(gender);
	  System.out.println(letter);
	  System.out.println(n1);
	  System.out.println(n2);
	  System.out.println(n3);
	  System.out.println(n4);
	  System.out.println(n5);
	  System.out.println(n6);
System.out.println("---------não é primitivo------------");
	  
 	  System.out.println(name);
	  System.out.println(obj1);
	  System.out.println(obj2);
  System.out.println("---------casting------------");
	  
	    System.out.println(b);
	    
	    System.out.println(c);
	    System.out.println(result);
	}

}
