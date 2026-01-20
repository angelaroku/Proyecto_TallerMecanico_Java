package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.vista.AltaMecanicosVista;

public class AltaMecanicosControlador implements ActionListener{
	private AltaMecanicosVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	
	
	public AltaMecanicosControlador(AltaMecanicosVista vistaControlador, DAO_TallerMecanico daoControlador) {
		this.vistaControlador = vistaControlador;
		this.daoControlador = daoControlador;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
