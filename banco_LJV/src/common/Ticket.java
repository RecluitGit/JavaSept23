package common;

public class Ticket {

	String direccion;
	int folio;
	double monto;
	String tipoOperacion;
	public Ticket() {
		super();
	}
	public Ticket(String direccion, int folio, double monto, String tipoOperacion) {
		super();
		this.direccion = direccion;
		this.folio = folio;
		this.monto = monto;
		this.tipoOperacion = tipoOperacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}
	public String getTipoOperacion() {
		return tipoOperacion;
	}
	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}
	@Override
	public String toString() {
		return "Ticket [direccion=" + direccion + ", folio=" + folio + ", monto=" + monto + ", tipoOperacion="
				+ tipoOperacion + "]";
	}
	
	
	
	// Operaciones
	/*
	 * retiro
	 * deposito
	 * transferencia
	 * 
	 * 
	 * 0010
	 * Debito
	 * sD- 7000
	 * sMx- 20000
	 * sMn- 1500
	 * */
	
	
}
