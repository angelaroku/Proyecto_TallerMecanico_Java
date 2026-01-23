package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BajaMecanicoVista  extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JButton btnNewButtonBajaMecanicos;

	public BajaMecanicoVista() {
		setLayout(null);
		
		btnNewButtonBajaMecanicos = new JButton("Dar de baja");
		btnNewButtonBajaMecanicos.setBounds(209, 310, 105, 27);
		add(btnNewButtonBajaMecanicos);
		//conexion de boton con controlador
		//btnNewButtonBajaMecanicos.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista


}
