package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import proyecto_taller.controlador.AltaAveriaControlador;

public class AltaAveriaVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JButton btnNewButtonAltaAveria;
	private AltaAveriaControlador controlador; 
	
	public AltaAveriaVista() {
		setLayout(null);
		controlador=new AltaAveriaControlador(this);
		
		btnNewButtonAltaAveria = new JButton("Dar de alta");
		btnNewButtonAltaAveria.setBounds(172, 196, 105, 27);
		add(btnNewButtonAltaAveria);
		//conexion de boton con controlador
		btnNewButtonAltaAveria.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista

}
