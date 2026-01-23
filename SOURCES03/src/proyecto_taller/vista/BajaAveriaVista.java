package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BajaAveriaVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JButton btnNewButtonBajaAveria;


	public BajaAveriaVista() {
		setLayout(null);
		
		btnNewButtonBajaAveria = new JButton("Dar de baja");
		btnNewButtonBajaAveria.setBounds(172, 196, 105, 27);
		add(btnNewButtonBajaAveria);
		//conexion de boton con controlador
		//btnNewButtonBajaAveria.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista

}
