package proyecto_taller.dao;

import proyecto_taller.modelo.TallerMecanico;

public class DAO_TallerMecanico {
	
	private static DAO_TallerMecanico instancia=null;
	private TallerMecanico tallerMecanico; 
	
	private DAO_TallerMecanico() {
		tallerMecanico=new TallerMecanico() ;
	}

	public static DAO_TallerMecanico getInstancia() {
		if (instancia == null) {
			instancia = new DAO_TallerMecanico();
		}
		return instancia;
	}
	//METODOS CRUD enlazados con modelo "MenuTallerMecanico"
	
	
}
