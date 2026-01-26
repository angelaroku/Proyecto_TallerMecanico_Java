package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Vehiculo;
import proyecto_taller.vista.AltaVehiculoVista;

public class AltaVehiculosControlador implements ActionListener{
	private AltaVehiculoVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	private Vehiculo vehiculoNew;
	
	public AltaVehiculosControlador(AltaVehiculoVista vistaControlador) {
		this.vistaControlador = vistaControlador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}	
}
