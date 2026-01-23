package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ModificacionMecanicoVista  extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton btnNewButtonModificacionMecanicos;

	
	public ModificacionMecanicoVista() {
		setLayout(null);
		
		btnNewButtonModificacionMecanicos = new JButton("Modificar mecánico");
		btnNewButtonModificacionMecanicos.setBounds(209, 310, 105, 27);
		add(btnNewButtonModificacionMecanicos);
		//conexion de boton con controlador
		//btnNewButtonBajaMecanicos.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista


}
