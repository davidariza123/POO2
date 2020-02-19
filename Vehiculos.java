package Vehiculos;

import Atributos.Propietario;
import Atributos.TipoServicio;

public abstract class Vehiculos {
	
	

	private Integer Placa;
	private Propietario propietario;
	private TipoServicio tiposervicio ;
	

	
	
	public Vehiculos(Integer Placa, Propietario propietario, TipoServicio tiposervicio) {
		
		this.Placa = Placa;
		this.propietario = propietario;
		this.tiposervicio = tiposervicio;
	}

	
	public Integer getPlaca() {
		return Placa;
	}

	public void setPlaca(Integer Placa) {
		this.Placa = Placa;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public TipoServicio getTiposervicio() {
		return tiposervicio;
	}

	public void setTiposervicio(TipoServicio tiposervicio) {
		this.tiposervicio = tiposervicio;
	}
	
	public abstract void Consultar();
	

}
