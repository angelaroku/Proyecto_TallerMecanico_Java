package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Vehiculo;
import proyecto_taller.vista.ModificacionVehiculoVista;

public class ModificacionVehiculosControlador implements ActionListener {
	private ModificacionVehiculoVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	private Vehiculo vehiculoNew;

	public ModificacionVehiculosControlador( ModificacionVehiculoVista vistaControlador) {
		this.vistaControlador=vistaControlador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
