package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ModificacionAveriaVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JButton btnNewButtonModificacionAveria;


	public ModificacionAveriaVista() {
		setLayout(null);
		
		btnNewButtonModificacionAveria = new JButton("Modificar avería");
		btnNewButtonModificacionAveria.setBounds(172, 196, 105, 27);
		add(btnNewButtonModificacionAveria);
		//conexion de boton con controlador
		//btnNewButtonModificacionAveria.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista

	

}
