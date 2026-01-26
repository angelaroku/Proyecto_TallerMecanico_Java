package proyecto_taller.modelo;

import java.util.ArrayList;

public class Gestion {
	private TipoGestion tipoGestion;
	private ArrayList<Vehiculo> vehiculosTaller;
	private ArrayList<Mecanico> mecanicosTaller;

	public Gestion(TipoGestion tipogestipoGestiontion) {
		this.tipoGestion = tipoGestion;
	}
	
	//Metodos
	//recepcionVehiculo(v:Vehiculo)| terminacionOperacion(codigoM:int) | entregaVehiculoReparado()
	public void recepcionVehiculo(Vehiculo vehiculoNuevo) {
		
		Vehiculo vehiculo = 
				new Vehiculo(vehiculoNuevo.getMatricula(),vehiculoNuevo.getEstadoVehiculo(), vehiculoNuevo.getTipoVehiculo(),vehiculoNuevo.getAveriasVehiculo());
		EspecialidadMecanico ESPECIALIDADMECANICO_COCHE = null;
		EspecialidadMecanico ESPECIALIDADMECANICO_MOTO = null;
		TipoVehiculo COCHE = null;
		TipoVehiculo MOTO = null;
		EstadoVehiculo EN_REPARACION = null;
		EstadoVehiculo EN_ESPERA = null;
				
		
		for (Mecanico mecanicoDisponible: mecanicosTaller) {
			if (mecanicoDisponible.isEstadoLibreMecanico()==false) {
				System.out.println("El mecanico no está libre");
			} else {
				if (mecanicoDisponible.getEspecialidadMecanico()== ESPECIALIDADMECANICO_COCHE &&
						vehiculoNuevo.getTipoVehiculo()==COCHE) {
					
					mecanicoDisponible.asignarVehiculo(vehiculoNuevo);
					mecanicoDisponible.cambiarEstado();
					vehiculoNuevo.setEstadoVehiculo(EN_REPARACION);
					
				} else if (mecanicoDisponible.getEspecialidadMecanico()== ESPECIALIDADMECANICO_MOTO &&
						vehiculoNuevo.getTipoVehiculo()==MOTO){
					
					mecanicoDisponible.asignarVehiculo(vehiculoNuevo);
					mecanicoDisponible.cambiarEstado();
					vehiculoNuevo.setEstadoVehiculo(EN_REPARACION);
				} else {
					vehiculoNuevo.setEstadoVehiculo(EN_ESPERA);

				}
				
			}
		}
		
		/**
		 Se dará de alta un vehículo (indicando si es coche o moto), pidiendo
		sus datos por teclado. Se buscará un mecánico libre con la especialidad correspondiente
		(coche o moto). Si lo hay, se asignará dicho vehículo al mecánico y el estado del vehículo se
		pondrá “En reparación”; si no lo hay, se marcará su estado como “En espera”
		 */
	}
	public void terminacionOperacion(int codigoMecanicoAsignado, Vehiculo vehiculoEnReparacion) {
		
		EstadoVehiculo EN_REPARACION = null;
		EstadoVehiculo REPARADO = null;
		EstadoVehiculo EN_ESPERA = null;
		
		double total_reparacion = vehiculoEnReparacion.costeReparacion();
		vehiculoEnReparacion.setEstadoVehiculo(REPARADO);
		for (Mecanico mecanicoAsignado : mecanicosTaller) {
			if (mecanicoAsignado.getCodigoMecanico() == codigoMecanicoAsignado){
				
			}
			
		}
		for (Vehiculo vehiculosEnEspera : vehiculosTaller) {
			if (vehiculosEnEspera.getEstadoVehiculo()== EN_ESPERA) {
				
			}
		}
		
		/**
		  Se introducirá el código del mecánico y en el vehículo
		correspondiente se calculará el coste total de la reparación. El estado será ahora “Reparado”.
		Si hay vehículos en espera de la misma especialidad del mecánico, se asignará un nuevo
		vehículo al mecánico que acaba de terminar la reparación; en caso contrario, el mecánico se
		marcará como libre y el vehículoReparación asignado se pondrá a null.
		 * */
	}
	
	public void entregaVehiculoReparado() {
	/***
		 Se recorrerá toda la lista de vehículos imprimiendo y
		borrando los reparados
	 */
	}
	
	
	//GETTER Y SETTER
	public TipoGestion getTipogestion() {
		return tipoGestion;
	}

	public void setTipogestion(TipoGestion tipoGestion) {
		this.tipoGestion = tipoGestion;
	}
}
