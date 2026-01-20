package proyecto_taller.modelo;

import java.util.ArrayList;

public class Vehiculo {
	
	private String matricula;
	private EstadoVehiculo estadoVehiculo;
	private TipoVehiculo tipoVehiculo;
	private ArrayList<Averia> averiasVehiculo;
	
	
	public Vehiculo(String matricula, EstadoVehiculo estadoVehiculo, TipoVehiculo tipoVehiculo,
			ArrayList<Averia> averiasVehiculo) {
		this.matricula = matricula;
		this.estadoVehiculo = estadoVehiculo;
		this.tipoVehiculo = tipoVehiculo;
		this.averiasVehiculo = averiasVehiculo;
	}

	//método costeReparación() que calculará el coste total de la reparación según las averías del vehículo
	
	
	//GETTER Y SETTER
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public EstadoVehiculo getEstadoVehiculo() {
		return estadoVehiculo;
	}

	public void setEstadoVehiculo(EstadoVehiculo estadoVehiculo) {
		this.estadoVehiculo = estadoVehiculo;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public ArrayList<Averia> getAveriasVehiculo() {
		return averiasVehiculo;
	}

	public void setAveriasVehiculo(ArrayList<Averia> averiasVehiculo) {
		this.averiasVehiculo = averiasVehiculo;
	}
}
