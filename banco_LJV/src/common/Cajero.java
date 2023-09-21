package common;

public class Cajero {
	String  direccion;
	int id;
	double saldo;
	int folio= 0;
	public void Cajero() {
		
	}

	public Cajero(String direccion, int id, double saldo) {
		super();
		this.direccion = direccion;
		this.id = id;
		this.saldo = saldo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cajero [direccion=" + direccion + ", id=" + id + "]";
	}
	
	
public Ticket retirar(Cuenta cuenta, double monto) {
		
		Ticket ticket = null;
		/*
		 * 1 - monto < saldo (cajero)
		 * 2 - monto < saldoDisponible
		 * 3 - saldoDisponible  - monto < saldoMin
		 * */
		if(monto > this.saldo) {
			System.out.println("Saldo insufisiente en el cajero");
			
		}else if(cuenta.getSaldoDisponible()<monto) {
			System.out.println("Fondos isuficientes en la cuenta");
			
		}else if((cuenta.getSaldoDisponible()-monto)<cuenta.getSaldoMin()) {
			System.out.println("El retiro dejaria por debajo de del minimo de la cuenta ");
			
		}else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()-monto);
			
			ticket = new Ticket(this.direccion, ++folio, monto, "Retiro");
			
		}
		return ticket;
	}

public Ticket depositar(Cuenta cuenta, double monto) {
	
	Ticket ticket = null;
	/*
	 * 2 - monto > saldoMax
	 * 3 - saldoDisponible  + monto > saldoMax
	 * */
	if((monto > cuenta.getSaldoMax() )) {
		System.out.println("EL monto a depositar supera el saldo maximo permitido en la cuenta");
		
	}else if((cuenta.getSaldoDisponible()+monto)> cuenta.getSaldoMax()) {
		System.out.println("El monto a depositar  sumado a tu saldo actual supera el maximo permitido en la cuenta");
		
	} else {
		cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()+monto);
		
		ticket = new Ticket(this.direccion, ++folio, monto, "Deposito");
		
	}
	return ticket;
}


public Ticket transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto) {
	
	Ticket ticket = null;
	  
	/*CuentaOrigen
	 * 2 - monto < saldoDisponible
	 * 3 - saldoDisponible  - monto < saldoMin
	 * 
	 * CuentaDestino
	 * 2 - monto > saldoMax
	 * 3 - saldoDisponible  + monto > saldoMax
	 * */
	if(monto > cuentaOrigen.getSaldoDisponible() ) {
		System.out.println("EL monto a transferir supera el saldo disponible en la cuenta");
		
	}else if((cuentaOrigen.getSaldoDisponible()-monto) < cuentaOrigen.getSaldoMin()) {
		System.out.println("El monto a tranferir dejaria su saldo por debajo del minimo permitido");
		
	} else if(monto > cuentaDestino.saldoMax){
		
		System.out.println("El monto a tranferir supera el saldo maximo permitido de la cuenta destino");
		
	}else if((cuentaDestino.getSaldoDisponible()+monto > cuentaDestino.saldoMax)){
		
		System.out.println("El monto a transferir  sumado al saldo actual de la cuenta destino supera el saldo maximo de la cuenta destino ");
	}else {
		cuentaOrigen.setSaldoDisponible(cuentaOrigen.saldoDisponible - monto);
		cuentaDestino.setSaldoDisponible(cuentaDestino.saldoDisponible + monto);
		ticket = new Ticket(this.direccion, ++folio, monto, "Transferencia");
		
	}
	
	return ticket;
}


}
