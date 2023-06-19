package ar.edu.unlam;

import java.util.*;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosGenerales, SegurosDeVida {
	
	private Vivienda viviendaDeLaPoliza;
	private ArrayList <Persona> beneficiarios;
	
	public PolizaCombinadoFamiliar(Integer numeroDeLaPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDeLaPoliza, asegurado, sumaAsegurada, prima);
		this.beneficiarios = new ArrayList<>();
	}

	@Override
	public void agregarBeneficiario(Persona Persona, TipoDeBeneficiario tipo) {
		Persona.setTipo(tipo);
		this.beneficiarios.add(Persona);
	}

	@Override
	public Integer getCantidadDeBeneficiarios() {
		return this.beneficiarios.size();
	}

	@Override
	public void agregarBienAsegurado(Auto auto) {
		
	}

	@Override
	public void agregarBienAsegurado(Vivienda vivienda) {
		this.viviendaDeLaPoliza=vivienda;
	}

	public Vivienda getViviendaDeLaPoliza() {
		return viviendaDeLaPoliza;
	}

	public void setViviendaDeLaPoliza(Vivienda viviendaDeLaPoliza) {
		this.viviendaDeLaPoliza = viviendaDeLaPoliza;
	}

	public ArrayList<Persona> getBeneficiarios() {
		return beneficiarios;
	}

	public void setBeneficiarios(ArrayList<Persona> beneficiarios) {
		this.beneficiarios = beneficiarios;
	}

}
