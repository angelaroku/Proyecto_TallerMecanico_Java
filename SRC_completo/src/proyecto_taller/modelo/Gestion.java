package proyecto_taller.modelo;

public class Gestion {
	private TipoGestion tipogestion;

	public Gestion(TipoGestion tipogestion) {
		this.tipogestion = tipogestion;
	}
	
	//GETTER Y SETTER
	public TipoGestion getTipogestion() {
		return tipogestion;
	}

	public void setTipogestion(TipoGestion tipogestion) {
		this.tipogestion = tipogestion;
	}
}
