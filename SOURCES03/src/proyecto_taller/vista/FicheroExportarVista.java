package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FicheroExportarVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JButton btnNewButtonExportarFicheros;

	public FicheroExportarVista() {
		setLayout(null);
		
		btnNewButtonExportarFicheros = new JButton("Exportar");
		btnNewButtonExportarFicheros.setBounds(172, 196, 105, 27);
		add(btnNewButtonExportarFicheros);
		//conexion de boton con controlador
		//btnNewButtonConsultarFicha.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista

}
