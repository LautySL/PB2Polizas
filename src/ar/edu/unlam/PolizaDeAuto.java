package ar.edu.unlam;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {
	
	private Auto autoDeLaPoliza;
	private Boolean fueRobado = false;	
	
	
	public PolizaDeAuto(Integer numeroDeLaPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDeLaPoliza, asegurado, sumaAsegurada, prima);
	}

	@Override
	public void agregarBienAsegurado(Auto auto) {
		this.autoDeLaPoliza = auto;
		
	}

	@Override
	public void agregarBienAsegurado(Vivienda vivienda) {
		// TODO Auto-generated method stub
		
	}

	public Auto getAutoDeLaPoliza() {
		return autoDeLaPoliza;
	}

	public void setAutoDeLaPoliza(Auto autoDeLaPoliza) {
		this.autoDeLaPoliza = autoDeLaPoliza;
	}

	public Boolean getFueRobado() {
		return fueRobado;
	}

	public void setFueRobado(Boolean fueRobado) {
		this.fueRobado = fueRobado;
	}

}
