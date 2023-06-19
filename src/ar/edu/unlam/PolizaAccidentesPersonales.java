package ar.edu.unlam;

import java.util.*;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida {
	
	private ArrayList <Persona> beneficiarios;
	private Boolean tuvoAlgunAccidente;
	
	public PolizaAccidentesPersonales(Integer numeroDeLaPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDeLaPoliza, asegurado, sumaAsegurada, prima);
		this.beneficiarios = new ArrayList<>();
	}

	public ArrayList<Persona> getBeneficiarios() {
		return beneficiarios;
	}

	public void setBeneficiarios(ArrayList<Persona> beneficiarios) {
		this.beneficiarios = beneficiarios;
	}

	public Boolean getTuvoAlgunAccidente() {
		return tuvoAlgunAccidente;
	}

	public void setTuvoAlgunAccidente(Boolean tuvoAlgunAccidente) {
		this.tuvoAlgunAccidente = tuvoAlgunAccidente;
	}

	@Override
	public void agregarBeneficiario(Persona Persona, TipoDeBeneficiario tipo) {
		Persona.setTipo(tipo);
		beneficiarios.add(Persona);
	}

	@Override
	public Integer getCantidadDeBeneficiarios() {
		return beneficiarios.size();
	}
	
}
