package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.vista.ConsultaMecanicosVista;

public class ConsultarMecanicosControlador implements ActionListener{
	private ConsultaMecanicosVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	
	
	public ConsultarMecanicosControlador(ConsultaMecanicosVista vistaControlador, DAO_TallerMecanico daoControlador) {
		super();
		this.vistaControlador = vistaControlador;
		this.daoControlador = daoControlador;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
