package proyecto_taller.modelo;

public class Averia {
	
	private int codigoAveria;
	private String descripcionAveria;
	private float costeAveria;
	
	
	public Averia(int codigoAveria, String descripcionAveria, float costeAveria) {
		super();
		this.codigoAveria = codigoAveria;
		this.descripcionAveria = descripcionAveria;
		this.costeAveria = costeAveria;
	}

	
	public int getCodigoAveria() {
		return codigoAveria;
	}

	public void setCodigoAveria(int codigoAveria) {
		this.codigoAveria = codigoAveria;
	}

	public String getDescripcionAveria() {
		return descripcionAveria;
	}

	public void setDescripcionAveria(String descripcionAveria) {
		this.descripcionAveria = descripcionAveria;
	}

	public float getCosteAveria() {
		return costeAveria;
	}

	public void setCosteAveria(float costeAveria) {
		this.costeAveria = costeAveria;
	}
	
}
