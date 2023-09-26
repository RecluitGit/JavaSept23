package common;

import java.util.HashMap;
import java.util.Map;

public class PruebaDeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Contacto> agenda = new HashMap<String, Contacto>();
		
		Contacto c1 = new Contacto("Susana","3423423","Susana@gmail.com", "Direccion 1");
		Contacto c2 = new Contacto("Daniela","3423423","Daniela@gmail.com", "Direccion 5");
		agenda.put("Susana", c1);
		agenda.put("Gerardo", new Contacto("Gerardo","3423423","gerardo@gmail.com", "Direccion 1"));
		agenda.put("Mariana", new Contacto("Mariana","3423423","Mariana@gmail.com", "Direccion 2"));
		agenda.put("Miguel", new Contacto("Juan","3423423","Juan@gmail.com", "Direccion 3"));
		
		agenda.put("Daniela", c2);
		agenda.put("Angelica", new Contacto("Angelica","3423423","Angelica@gmail.com", "Direccion 6"));
		agenda.put("Luis", new Contacto("Luis","3423423","Luis@gmail.com", "Direccion 1"));
	
    // debvuelve  la cantidad de elementos en el map
	System.out.println(agenda.size());
	
	// devuelve  boolean  si se encuentra  esta llave o no 
	System.out.println(agenda.containsKey("Jorge"));
	
	
	
	System.out.println(agenda);
	
	// elimina   comparando si la llave esta asociada al objeto 
	System.out.println(agenda.remove("Migel", c1));
	
	System.out.println(agenda);
	}
	
	

}
