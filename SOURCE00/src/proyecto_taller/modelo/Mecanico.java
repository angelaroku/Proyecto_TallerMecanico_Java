package proyecto_taller.modelo;

import java.util.ArrayList;

public class Mecanico {
	
	private int codigoMecanico;
	private String nombreMecanico;
	private EspecialidadMecanico especialidadMecanico;
	private boolean estadoLibreMecanico; 
	
	
	public Mecanico(int codigoMecanico, String nombreMecanico, 
			EspecialidadMecanico especialidadMecanico, boolean estadoLibreMecanico) {
		this.codigoMecanico = codigoMecanico;
		this.nombreMecanico = nombreMecanico;
		this.especialidadMecanico = especialidadMecanico;
		this.estadoLibreMecanico = estadoLibreMecanico;
		
	}
	
	//Metodos:
		// asignarVehiculi(v:Vehiculo) | cambiarEstado()
			
	public boolean asignarVehiculo(Vehiculo vehiculoAsignado) {
		TallerMecanico taller = new TallerMecanico();
		ArrayList<Vehiculo> vehiculos = taller.getVehiculos();
		
		for (Vehiculo vehiculoBuscado : vehiculos ) {
			if (vehiculoBuscado.getMatricula()==vehiculoAsignado.getMatricula()) {
				//Un mecánico que esté ocupado solo puede trabajar en la reparación 
				//de un único vehículo
			}
			
		}
		return false;
	}
	
	public void cambiarEstado(String Matricula) {
		//Vehiculo vehiculo
		
	}
	
	//GETTER Y SETTERS
	public int getCodigoMecanico() {
		return codigoMecanico;
	}

	public void setCodigoMecanico(int codigoMecanico) {
		this.codigoMecanico = codigoMecanico;
	}

	public String getNombreMecanico() {
		return nombreMecanico;
	}

	public void setNombreMecanico(String nombreMecanico) {
		this.nombreMecanico = nombreMecanico;
	}


	public EspecialidadMecanico getEspecialidadMecanico() {
		return especialidadMecanico;
	}


	public void setEspecialidadMecanico(EspecialidadMecanico especialidadMecanico) {
		this.especialidadMecanico = especialidadMecanico;
	}


	public boolean isEstadoLibreMecanico() {
		return estadoLibreMecanico;
	}


	public void setEstadoLibreMecanico(boolean estadoLibreMecanico) {
		this.estadoLibreMecanico = estadoLibreMecanico;
	}


	
	
}
