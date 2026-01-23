package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Mecanico;
import proyecto_taller.vista.BajaMecanicoVista;

public class BajaMecanicosControlador implements ActionListener{
	private BajaMecanicoVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	private Mecanico mecanicoNew;

	
	public BajaMecanicosControlador(BajaMecanicoVista vistaControlador, DAO_TallerMecanico daoControlador) {
		this.vistaControlador = vistaControlador;
		this.daoControlador = daoControlador;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
