package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import proyecto_taller.controlador.ModificacionAveriaControlador;

public class ModificacionAveriaVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JButton btnNewButtonModificacionAveria;
	private ModificacionAveriaControlador controlador;

	public ModificacionAveriaVista() {
		setLayout(null);
		controlador=new ModificacionAveriaControlador(this);

		
		btnNewButtonModificacionAveria = new JButton("Modificar avería");
		btnNewButtonModificacionAveria.setBounds(172, 196, 105, 27);
		add(btnNewButtonModificacionAveria);
		//conexion de boton con controlador
		btnNewButtonModificacionAveria.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista

	

}
