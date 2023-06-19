package ar.edu.unlam;

import java.util.HashSet;

public class CompaniaDeSeguros {
	
	private String nombre;
	private HashSet <Poliza> polizasExistentes;
	
	public CompaniaDeSeguros (String nombre) {
		this.nombre = nombre;
		this.polizasExistentes = new HashSet <Poliza> ();
	}

	public Boolean agregarPoliza (Poliza polizaAAgregar) {
		return this.polizasExistentes.add(polizaAAgregar);
	}
	
	public Integer obtenerLaCantidadDePolizasEmitidas(){
		return polizasExistentes.size();
	}
	
	public Poliza getPolizaPorNumero (Integer nroPoliza){
		Poliza aBuscar = null;
		for (Poliza poliza : polizasExistentes) {
			if (poliza.getNumero().equals(nroPoliza)) {
				aBuscar = poliza;
			}
		}
		return aBuscar;
	}
	
	public void denunciarSiniestro(Integer nroPoliza) throws PolizaInexistente {
		Poliza polizaDelSiniestro = getPolizaPorNumero(nroPoliza);
		
		if (this.polizasExistentes.contains(polizaDelSiniestro)) {
			if (polizaDelSiniestro instanceof PolizaDeAuto) {
				((PolizaDeAuto) polizaDelSiniestro).setFueRobado(true);
			} else if (polizaDelSiniestro instanceof PolizaAccidentesPersonales) {
				((PolizaAccidentesPersonales) polizaDelSiniestro).setTuvoAlgunAccidente(true);
			}
		} else throw new PolizaInexistente();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
