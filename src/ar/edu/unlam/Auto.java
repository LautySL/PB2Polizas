package ar.edu.unlam;

public class Auto {
	
	private String marca;
	private String modelo;
	private Integer a�o;
	private Double sumaAsegurada;
	
	public Auto(String marca, String modelo, Integer a�o, Double sumaAsegurada) {
		this.marca=marca;
		this.modelo=modelo;
		this.a�o=a�o;
		this.sumaAsegurada = sumaAsegurada;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Integer getA�o() {
		return a�o;
	}
	
	public void setA�o(Integer a�o) {
		this.a�o = a�o;
	}
	
	public Double getsUMA_ASEGURADA() {
		return sumaAsegurada;
	}
	
	public void setsUMA_ASEGURADA(Double sUMA_ASEGURADA) {
		this.sumaAsegurada = sUMA_ASEGURADA;
	}

}
