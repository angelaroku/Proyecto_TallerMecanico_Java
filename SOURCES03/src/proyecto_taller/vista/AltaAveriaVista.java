package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AltaAveriaVista extends JPanel{
	private static final long serialVersionUID = 1L;
	private JButton btnNewButtonAltaAveria;

	
	public AltaAveriaVista() {
		setLayout(null);
		btnNewButtonAltaAveria = new JButton("Dar de alta");
		btnNewButtonAltaAveria.setBounds(172, 196, 105, 27);
		add(btnNewButtonAltaAveria);
		//conexion de boton con controlador
		//btnNewButtonConsultarFicha.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista

}
