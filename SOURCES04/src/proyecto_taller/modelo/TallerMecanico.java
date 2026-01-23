package proyecto_taller.modelo;

import java.util.ArrayList;
import java.util.Iterator;


public class TallerMecanico {

	//atributos array de cada elemento del menu principal 
	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<Mecanico> mecanicos;
	private ArrayList<Averia> averias;
	private  ArrayList<Fichero> ficheros;
	private ArrayList<Gestion> gestiones;
	
	
	//constructor de TALLER
	public TallerMecanico() {
		vehiculos = new ArrayList<>();
		mecanicos = new ArrayList<>();
		averias = new ArrayList<>();
		ficheros = new ArrayList<>();
		gestiones = new ArrayList<>();
	}
	
	
	// metodos CRUD para: VEHICULOS, MECANICOS , AVERIAS (ALTA/BAJA/CONSULT/MOD)
	public void altaVehiculos(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}
	
	public void altaMecanicos(Mecanico mecanico) {
		mecanicos.add(mecanico);
	}
	
	public void altaAverias(Averia averia) {
		averias.add(averia);
	}
	
	public boolean bajaVehiculos(String matricula) {
		Iterator <Vehiculo> it = vehiculos.iterator();
		while(it.hasNext()) {
			if (it.next().getMatricula()==matricula) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	public boolean bajaMecanicos(int codigoMecanico) {
		Iterator <Mecanico> it = mecanicos.iterator();
		while(it.hasNext()) {
			if (it.next().getCodigoMecanico()==codigoMecanico) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	public boolean bajaAverias(int codigoAveria) {
		Iterator <Averia> it = averias.iterator();
		while(it.hasNext()) {
			if (it.next().getCodigoAveria()==codigoAveria) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	public Vehiculo consultaVehiculos(String matricula) {
		for (Vehiculo vehiculoEncontrado:vehiculos) {
			if(vehiculoEncontrado.getMatricula()==matricula) {
				return vehiculoEncontrado;
			}
		}
		return null;
	}
	
	public Mecanico consultaMecanicos(int codigoMecanico) {
		for (Mecanico mecanicoEncontrado:mecanicos) {
			if (mecanicoEncontrado.getCodigoMecanico()==codigoMecanico) {
				return mecanicoEncontrado;
			}
		}
		return null;
	}
	
	public Averia consultaAverias(int codigoAverias) {
		for (Averia averiaEncontrada:averias) {
			if(averiaEncontrada.getCodigoAveria()==codigoAverias) {
				return averiaEncontrada;
			}
		}
		return null;
	}
	
	public boolean modificarVehiculo(Vehiculo vehiculo) {
		for (Vehiculo vehiculoModif: vehiculos) {
			if(vehiculoModif.getMatricula()==vehiculo.getMatricula()) {
				vehiculoModif.setAveriasVehiculo(vehiculo.getAveriasVehiculo());
				vehiculoModif.setEstadoVehiculo(vehiculo.getEstadoVehiculo());
				vehiculoModif.setTipoVehiculo(vehiculo.getTipoVehiculo());
				return true;
			}
		}
		return false;
	}
	
	public boolean modificarMecanico(Mecanico mecanico) {
		for (Mecanico mecanicoModif: mecanicos) {
			if (mecanicoModif.getCodigoMecanico()==mecanico.getCodigoMecanico()) {
				mecanicoModif.setEspecialidadMecanico(mecanico.getEspecialidadMecanico());
				mecanicoModif.setEstadoLibreMecanico(mecanico.isEstadoLibreMecanico());
				mecanicoModif.setNombreMecanico(mecanico.getNombreMecanico());
				return true;
			}
		}
		return false;
	}
	
	public boolean modificarAveria(Averia averia) {
		for (Averia averiaModif: averias) {
			if (averiaModif.getCodigoAveria()==averia.getCodigoAveria()) {
				averiaModif.setCosteAveria(averia.getCosteAveria());
				averiaModif.setDescripcionAveria(averia.getDescripcionAveria());
				return true;
			}
		}
		return false;
	}
	
	//metodos llamando a CLASE fichero:
		//IMPORTAR , EXPORTAR
	
	
	
	//METODOS llamando a CLASE Gestion: 
		//recepcionVehiculo(v:Vehiculo)| terminacionOperacion(codigoM:int) | entregaVehiculoReparado()


	
	
	//GETTER Y SETTERS

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public ArrayList<Mecanico> getMecanicos() {
		return mecanicos;
	}

	public void setMecanicos(ArrayList<Mecanico> mecanicos) {
		this.mecanicos = mecanicos;
	}

	public ArrayList<Averia> getAverias() {
		return averias;
	}

	public void setAverias(ArrayList<Averia> averias) {
		this.averias = averias;
	}

	public ArrayList<Fichero> getFicheros() {
		return ficheros;
	}

	public void setFicheros(ArrayList<Fichero> ficheros) {
		this.ficheros = ficheros;
	}

	public ArrayList<Gestion> getGestiones() {
		return gestiones;
	}

	public void setGestiones(ArrayList<Gestion> gestiones) {
		this.gestiones = gestiones;
	}
}
