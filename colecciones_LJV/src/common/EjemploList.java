package common;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {
	public EjemploList() {
		
	}
	
	
	public void listasEjemplo() {
	List<String> lista = new ArrayList<>();
	
	// lista de objeto definido
	List<Pais> paises = new ArrayList<>();
	
	// lista  qu epermite cualquier tipo de dato 
	List<Object> general = new ArrayList<>();
	
	Pais pais1 = new Pais("Alemania", 3768363, 5425425, "Aleman");
	paises.add(new Pais("Noruega",763726, 238628,"nor"));
	
	paises.add(pais1);
	
	lista.add("uno");
	lista.add("dos");
	lista.add("tres");
	lista.add("cuatro");
	lista.add("cinco");
	lista.add("cuatro");
	lista.add("cinco");
	
	// imprime el tamaño de la lista
	System.out.println(lista.size());
	
	
	// devuelve un boolean para buscar un objeto	
	System.out.println(lista.contains("cinco"));
	
	// devuelve el valor del indice otorgado
	System.out.println(lista.get(2));
	
	// devuelve  el indice en que se encuentra  el valor  asignado
	System.out.println(lista.indexOf("cinco"));

	// devuelve  el ultimo(si esta repetido )  indice en que se encuentra  el valor  asignado
    System.out.println(lista.lastIndexOf("cinco"));
    
	System.out.println(lista);
    // remueve el valor en el indice dado del indice 
    lista.remove(2);
    
    // remueve  el valor de  asignado pasandole el valor
    lista.remove("cinco");
    
 // implime los elementos de la lista
 		System.out.println(lista);
 		
 		
 //se  remplasa un valor en la lista  pasandole el index y el valor  nuevo
 		lista.set(3, "nuevo");
		System.out.println(lista);
		
		
		
    System.out.println(paises+"\n");

}
}