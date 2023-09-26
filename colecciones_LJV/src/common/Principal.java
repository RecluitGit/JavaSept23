package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		String nombre ;
		int poblacion;
		int extensionGeografica;
		String lenguaje;
		int seleccion;
		
		Scanner sc = new Scanner(System.in);
	    
	    List<Pais> general = new ArrayList<Pais>();
	    
	    do {
			System.out.println("\nMenu---------------------");
			System.out.println("1 Agregar");
			System.out.println("2 Buscar");
			System.out.println("3 Editar");
			System.out.println("4 Eliminar");
			System.out.println("5 Buscar por idioma");
			System.out.println("6 Ver todos los paises");
			seleccion =leerEntero("Selecciona una opcion");
			
			switch (seleccion) {
           // agregar   un elemento a la lista
			case 1:
				
				 System.out.println("\nIngresa el nombre del País: \n");
				  nombre = sc.next();
				  
				  poblacion= leerEntero("ingresa el  numero de poblacion de "+ nombre+": ");
		            
		            extensionGeografica= leerEntero("ingresa el  numero de extencion geografica de "+nombre +": ");

				   System.out.println("Ingresa el lenguaje del País: \n");
				    lenguaje = sc.next();

				
				    general.add(new Pais(nombre, poblacion, extensionGeografica, lenguaje));
				    System.out.println("Paises  añadidos: "+general.size());
				 
				    
			    break;
			//  busqueda de pais por nombre
			case 2:
			    System.out.println("\nEscribe el nombre del País que buscas:");
			   
			    nombre = sc.nextLine();
			    for (Pais pais1 : general) {
			        if (pais1.getNombre().equals(nombre)) {
			            System.out.println("\nPaís encontrado:");
			            System.out.println("Indice :"+general.indexOf(pais1));
			            System.out.println("Nombre: " + pais1.getNombre());
			            System.out.println("Población: " + pais1.getPoblacion());
			            System.out.println("Extencion Geografica: " + pais1.getExtensionGeografica());
			            System.out.println("Lenguaje: " + pais1.getLenguaje());
			            
			        }
			    }
			    break;
			    
			    // Editar pais
			case 3:
				 System.out.println("\nEscribe el nombre del País que deseas editar:");
				    
				    nombre = sc.nextLine();
				    for (Pais pais1 : general) {
				        if (pais1.getNombre().equals(nombre)) {
				            System.out.println("\nPaís encontrado:");
				            System.out.println("Indice :"+general.indexOf(pais1));
				            System.out.println("Nombre: " + pais1.getNombre());
				            System.out.println("Población: " + pais1.getPoblacion());
				            System.out.println("Extencion Geografica: " + pais1.getExtensionGeografica());
				            System.out.println("Lenguaje: " + pais1.getLenguaje());
				            
				            System.out.println("\nIngresa el nuevo nombre del pais: ");
				            
				            pais1.setNombre(sc.next());
				            
				            pais1.setPoblacion(leerEntero("\nIngresa el nuevo numero de poblacion de "+ pais1.getNombre()+": "));
				            
				            pais1.setExtensionGeografica(leerEntero("ingresa el nuevo numero de extencion geografica de "+ pais1.getNombre()+": "));
				            
				            System.out.println("Ingresa el nuevo lenguaje de "+ pais1.getNombre()+": ");
				            pais1.setLenguaje(sc.next());
				        
				            
				            
				            
				            break; 
				        }
				    }
				break;
				
				// Eliminar pais
			case 4:
				 System.out.println("\nEscribe el nombre del País que deseas eliminar:");
				 
				    nombre = sc.nextLine();
				    for (Pais pais1 : general) {
				        if (pais1.getNombre().equals(nombre)) {
				            System.out.println("\nPaís encontrado y eliminado:");
				            general.remove(pais1);
				           
				            break; 
				        }else {
				        	System.out.println("\nEl Pais que buscas no se encontro en la lista\n");
				        }
				    }

				break;
				
				
			case 5:
			
				 System.out.println("\nEscribe el idioma  que deseas buscar");
				    lenguaje = sc.nextLine();
				    for (Pais pais1 : general) {
				        if (pais1.getLenguaje().equals(lenguaje)) {
				            System.out.println("\nPaís encontrado con lenguaje "+ lenguaje+": ");
				            System.out.println("Indice :"+general.indexOf(pais1));
				            System.out.println("Nombre: " + pais1.getNombre());
				            System.out.println("Población: " + pais1.getPoblacion());
				            System.out.println("Extencion Geografica: " + pais1.getExtensionGeografica());
				            System.out.println("Lenguaje: " + pais1.getLenguaje());
				            
				          
				        }
				    }
				   
				
				break;
			case 6:
				 System.out.println("\nLista de países agregados:");
				    for (Pais pais1 : general) {
				    	System.out.println("Indice :"+general.indexOf(pais1));
				        System.out.println("Nombre: " + pais1.getNombre());
				        System.out.println("Población: " + pais1.getPoblacion());
				        System.out.println("Extensión geográfica: " + pais1.getExtensionGeografica());
				        System.out.println("Lenguaje: " + pais1.getLenguaje());
				        System.out.println("-------------------");
				        				       
				    }
				break;

			}
		} while (seleccion >0 && seleccion <= 6);
	
	   

}
	 private static int leerEntero(String mensaje) {
     Scanner sc = new Scanner(System.in);
		    
	        while (true) {
	            try {
	                System.out.println(mensaje);
	                return Integer.parseInt(sc.nextLine());
	            } catch (NumberFormatException e) {
	                System.out.println("\nError: Debes ingresar un número entero válido.");
	            }
	        }
	    }
	}	
