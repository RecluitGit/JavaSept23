package common;

public class Pais {
	String nombre;
	int poblacion;
	int extensionGeografica;
	String lenguaje;
	public Pais() {
	}
	public Pais(String nombre, int poblacion, int extensionGeografica, String lenguaje) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.extensionGeografica = extensionGeografica;
		this.lenguaje = lenguaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public int getExtensionGeografica() {
		return extensionGeografica;
	}
	public void setExtensionGeografica(int extensionGeografica) {
		this.extensionGeografica = extensionGeografica;
	}
	public String getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", poblacion=" + poblacion + ", extensionGeografica=" + extensionGeografica
				+ ", lenguaje=" + lenguaje + "]";
	}
	

}
