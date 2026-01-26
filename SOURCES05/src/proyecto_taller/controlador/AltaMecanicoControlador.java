package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Mecanico;
import proyecto_taller.vista.AltaMecanicoVista;

public class AltaMecanicoControlador implements ActionListener{
	private AltaMecanicoVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	private Mecanico mecanicoNew;
	
	
	public AltaMecanicoControlador(AltaMecanicoVista vistaControlador) {
		this.vistaControlador = vistaControlador;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
