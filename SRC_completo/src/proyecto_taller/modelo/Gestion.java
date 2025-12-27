package proyecto_taller.modelo;

public class Gestion {
	private TipoGestion tipogestion;

	public Gestion(TipoGestion tipogestion) {
		super();
		this.tipogestion = tipogestion;
	}

	public TipoGestion getTipogestion() {
		return tipogestion;
	}

	public void setTipogestion(TipoGestion tipogestion) {
		this.tipogestion = tipogestion;
	}
	
}
