package ar.edu.unlam;

public class Vivienda {
	
	private String direccion, localidad, ciudad, provincia;

	public Vivienda (String direccion, String localidad, String ciudad, String provincia) {
		this.direccion = direccion;
		this.localidad = localidad;
		this.ciudad = ciudad;
		this.provincia = provincia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	

}
