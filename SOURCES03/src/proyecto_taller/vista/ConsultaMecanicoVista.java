package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ConsultaMecanicoVista  extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton btnNewButtonConsultaMecanicos;

	public ConsultaMecanicoVista() {
		setLayout(null);
		
		btnNewButtonConsultaMecanicos = new JButton("Consutar mecánico");
		btnNewButtonConsultaMecanicos.setBounds(209, 310, 105, 27);
		add(btnNewButtonConsultaMecanicos);
		//conexion de boton con controlador
		//btnNewButtonBajaMecanicos.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista


}
