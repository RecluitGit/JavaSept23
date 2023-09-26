package common;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Cajero cajero = new Cajero("Direccion 1", 1, 50000);
		 Cuenta cuenta1 = new Cuenta("123", "debito", 80000.0, 90000.0, 1500.0);
		 Cuenta cuenta2 = new Cuenta("1234", "debito", 10000.0, 100000.0, 1500.0);
		 Cuenta cuenta3 = new Cuenta("12345", "debito", 20000.0, 75000.0, 1500.0);

		 
		 
		 /*Ticket ticket = cajero.retirar(cuenta1, 7000.00);
		
		 System.out.println(cuenta1+ "\n"+  ticket);
		 
		 
		 Ticket ticket2 = cajero.depositar(cuenta2, 91000);
			
		 System.out.println(cuenta2+ "\n"+  ticket2);*/
		 
		 Ticket ticket3 = cajero.transferencia(cuenta1, cuenta3, 76000);
			
		 System.out.println("cuenta destino "+ cuenta3+ "\n"+  ticket3 + "\n"+"cuenta  origen : "+ cuenta1 );
		 
		
	}

}
