package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import proyecto_taller.MenuGenTallerMecanico;
import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.vista.AltaVehiculosVista;

public class AltaVehiculosControlador implements ActionListener{
	
	private AltaVehiculosVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	
	
	public AltaVehiculosControlador(AltaVehiculosVista vistaControlador) {
		this.vistaControlador = vistaControlador;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}	
}
