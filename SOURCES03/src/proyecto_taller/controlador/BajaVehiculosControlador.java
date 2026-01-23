package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Vehiculo;
import proyecto_taller.vista.BajaVehiculoVista;

public class BajaVehiculosControlador implements ActionListener{
	private BajaVehiculoVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	private Vehiculo vehiculoNew;

	public BajaVehiculosControlador( BajaVehiculoVista vistaControlador) {
		this.vistaControlador=vistaControlador;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
