package common;

public class Contacto {

	String nombre;
	String numero;
	String direccion;
	String correo;
	public Contacto() {
		
	}
	public Contacto(String nombre, String numero, String direccion, String correo) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.direccion = direccion;
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", numero=" + numero + ", direccion=" + direccion + ", correo=" + correo
				+ "]";
	}
	
	
}
