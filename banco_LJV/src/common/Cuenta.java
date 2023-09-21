package common;

public class Cuenta {
String numCuenta;
String tipo;
double saldoDisponible;
double saldoMax;
double saldoMin;

public Cuenta() {
	
}

public Cuenta(String numCuenta, String tipo, double saldoDisponible, double saldoMax, double saldoMin) {
	super();
	this.numCuenta = numCuenta;
	this.tipo = tipo;
	this.saldoDisponible = saldoDisponible;
	this.saldoMax = saldoMax;
	this.saldoMin = saldoMin;
}

public String getNumCuenta() {
	return numCuenta;
}

public void setNumCuenta(String numCuenta) {
	this.numCuenta = numCuenta;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public double getSaldoDisponible() {
	return saldoDisponible;
}

public void setSaldoDisponible(double saldoDisponible) {
	this.saldoDisponible = saldoDisponible;
}

public double getSaldoMax() {
	return saldoMax;
}

public void setSaldoMax(double saldoMax) {
	this.saldoMax = saldoMax;
}

public double getSaldoMin() {
	return saldoMin;
}

public void setSaldoMin(double saldoMin) {
	this.saldoMin = saldoMin;
}

@Override
public String toString() {
	return "Cuenta [numCuenta=" + numCuenta + ", tipo=" + tipo + ", saldoDisponible=" + saldoDisponible + ", saldoMax="
			+ saldoMax + ", saldoMin=" + saldoMin + "]";
}


}
