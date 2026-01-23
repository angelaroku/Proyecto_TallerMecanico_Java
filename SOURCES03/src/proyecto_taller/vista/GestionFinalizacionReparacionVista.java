package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GestionFinalizacionReparacionVista extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JButton btnNewButtonGestionFinalizacionReparacion;


	public GestionFinalizacionReparacionVista() {
		setLayout(null);
		
		btnNewButtonGestionFinalizacionReparacion = new JButton("Finalizar reparación");
		btnNewButtonGestionFinalizacionReparacion.setBounds(172, 196, 105, 27);
		add(btnNewButtonGestionFinalizacionReparacion);
		//conexion de boton con controlador
		//btnNewButtonGestionFinalizacionReparacion.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista

}
