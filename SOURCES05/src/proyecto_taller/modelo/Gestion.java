package proyecto_taller.modelo;

import java.util.ArrayList;

public class Gestion {
	private TipoGestion tipoGestion;

	public Gestion(TipoGestion tipogestipoGestiontion) {
		this.tipoGestion = tipoGestion;
	}
	
	//Metodos
	//recepcionVehiculo(v:Vehiculo)| terminacionOperacion(codigoM:int) | entregaVehiculoReparado()
	public void recepcionVehiculo(Vehiculo vehiculo) {
		//Vehiculo(String matricula, EstadoVehiculo estadoVehiculo, TipoVehiculo tipoVehiculo,
		//ArrayList<Averia> averiasVehiculo) 
		Vehiculo vehiculoNuevoDatos = 
				new Vehiculo(vehiculo.getMatricula(),vehiculo.getEstadoVehiculo(), vehiculo.getTipoVehiculo(),vehiculo.getAveriasVehiculo());

		
		/**
		 Se dará de alta un vehículo (indicando si es coche o moto), pidiendo
		sus datos por teclado. Se buscará un mecánico libre con la especialidad correspondiente
		(coche o moto). Si lo hay, se asignará dicho vehículo al mecánico y el estado del vehículo se
		pondrá “En reparación”; si no lo hay, se marcará su estado como “En espera”
		 */
	}
	public void terminacionOperacion(int codigoMecanico) {
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
