package proyecto_taller.modelo;

public class Fichero {
	public String nombreFichero;
	public TipoFichero tipoFichero;
	
	public Fichero(String nombreFichero, TipoFichero tipoFichero) {
		super();
		this.nombreFichero = nombreFichero;
		this.tipoFichero = tipoFichero;
	}

	public String getNombreFichero() {
		return nombreFichero;
	}

	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}

	public TipoFichero getTipoFichero() {
		return tipoFichero;
	}

	public void setTipoFichero(TipoFichero tipoFichero) {
		this.tipoFichero = tipoFichero;
	}

}
