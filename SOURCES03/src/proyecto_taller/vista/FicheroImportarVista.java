package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FicheroImportarVista extends JPanel{
	private static final long serialVersionUID = 1L;

	private JButton btnNewButtonImportarFicheros;

	public FicheroImportarVista() {
		setLayout(null);
		
		btnNewButtonImportarFicheros = new JButton("Importar");
		btnNewButtonImportarFicheros.setBounds(172, 196, 105, 27);
		add(btnNewButtonImportarFicheros);
		//conexion de boton con controlador
		//btnNewButtonImportarFicheros.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista


	
}
