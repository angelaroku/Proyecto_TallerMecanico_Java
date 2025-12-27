package proyecto_taller.modelo;

import java.util.ArrayList;


public class MenuTallerMecanico {

	//atributos array de cada elementto que vemos en el menu principal de taller
	//VEHI, MECA, AVERI.... FICHERO ficheros, GESTION gestiones
	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<Mecanico> mecanicos;
	private ArrayList<Averia> averias;
	private  ArrayList<Fichero> ficheros;
	private ArrayList<Gestion> gestiones;
	
	
	//constructor de  biblioteca con  cada elemento:
	public MenuTallerMecanico() {
		vehiculos = new ArrayList<>();
		mecanicos = new ArrayList<>();
		averias = new ArrayList<>();
		
		ficheros = new ArrayList<>();
		gestiones = new ArrayList<>();
	}
	
	// metodos CRUD para: VEHICULOS, MECANICOS , AVERIAS
	
	//metodos  IMPORTAR , EXPORTAR para vista ficheros
	
	//metodos RECEPCION, FINALIZAION, ENTREGA para gestiones


}
