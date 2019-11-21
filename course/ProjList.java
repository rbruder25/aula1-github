package course;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ProjList {

	public static void main(String[] args) {
		
	 List<String>  list = new ArrayList<>();
   
	  list.add("Maria");
	  list.add("Alex");
	  list.add("Bob");
	  list.add("Anna");
	  list.add(2,"Marcos");
	  
	  System.out.println(list.size());	
	  for (String x : list) {     // Lista todos 
		  System.out.println(x);
		
	  }
	  System.out.println("---------------------------");
	  list.removeIf(x->x.charAt(0) == 'M'); //Remove todos os nomes que começam com M
	   for (String x : list)  {
		    System.out.println(x);
	   }    
      System.out.println("---------------------------");	
      System.out.println("Index of Bob : "+list.indexOf("Bob"));
      System.out.println("Index of Marcos : "+list.indexOf("Marcos")); // Posição na list
      System.out.println("---------------------------");
      List<String> result = list.stream().filter(y -> y.charAt(0) == 'A').collect(Collectors.toList());
      for (String y : result) {
    	    System.out.println(y); // Mostra todos os nomes que começam com M Igual o Like do oracle
      }      
      System.out.println("---------------------------");
      String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
      System.out.println(name);  // Procura todos os nomes que começam com a letra "J" caso não ache retorna null igual DECODE DO ORACLE
      
	 


	}

}
