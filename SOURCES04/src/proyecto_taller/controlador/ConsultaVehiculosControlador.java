package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Vehiculo;
import proyecto_taller.vista.ConsultaVehiculoVista;

public class ConsultaVehiculosControlador implements ActionListener{
	private ConsultaVehiculoVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	private Vehiculo vehiculoNew;
	
	public ConsultaVehiculosControlador( ConsultaVehiculoVista vistaControlador) {
		this.vistaControlador=vistaControlador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
