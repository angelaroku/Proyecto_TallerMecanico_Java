package proyecto_taller.dao;

import proyecto_taller.modelo.MenuTallerMecanico;

public class DAO_TallerMecanico {
	
	private static DAO_TallerMecanico instancia=null;
	private MenuTallerMecanico tallerMecanico; 
	
	private DAO_TallerMecanico() {
		tallerMecanico=new MenuTallerMecanico() ;
	}

	public static DAO_TallerMecanico getInstancia() {
		if (instancia == null) {
			instancia = new DAO_TallerMecanico();
		}
		return instancia;
	}
	

}
