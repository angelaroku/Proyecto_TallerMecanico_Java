package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.vista.ModificacionMecanicosVista;

public class ModificarMecanicosControlador implements ActionListener{
	private ModificacionMecanicosVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	
	
	public ModificarMecanicosControlador(ModificacionMecanicosVista vistaControlador, DAO_TallerMecanico daoControlador) {
		this.vistaControlador = vistaControlador;
		this.daoControlador = daoControlador;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
