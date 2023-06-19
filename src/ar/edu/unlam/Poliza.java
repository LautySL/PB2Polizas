package ar.edu.unlam;

import java.util.Objects;

public class Poliza {
	
	private Integer numero;
	private Persona asegurado;
	private Double sumaAsegurada, prima, premio;
	
	public Poliza (Integer numeroDeLaPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		this.numero = numeroDeLaPoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		this.premio = this.prima + ((prima*20)/100);
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	public Double getPrima() {
		return prima;
	}

	public void setPrima(Double prima) {
		this.prima = prima;
	}

	public Double getPremio() {
		return premio;
	}

	public void setPremio(Double premio) {
		this.premio = premio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Poliza other = (Poliza) obj;
		return Objects.equals(numero, other.numero);
	}
	
}
