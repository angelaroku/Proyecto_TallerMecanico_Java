package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Averia;
import proyecto_taller.vista.ModificacionAveriaVista;

public class ModificacionAveriaControlador implements ActionListener{
	private ModificacionAveriaVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	private Averia averiaNew;
	
	public ModificacionAveriaControlador(ModificacionAveriaVista vistaControlador) {
		this.vistaControlador=vistaControlador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
