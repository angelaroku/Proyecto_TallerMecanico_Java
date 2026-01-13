package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConsultaVehiculosVista extends JPanel{
	private JTextField textFieldConsultarVehiculos;
	// controlador
	
	public ConsultaVehiculosVista() {
		setLayout(null);
		//thiis controlador
		
		JLabel lblConsultarVehiculos = new JLabel("Consultar Vehiculos");
		lblConsultarVehiculos.setBounds(228, 41, 142, 17);
		add(lblConsultarVehiculos);
		
		JLabel lblNewLabelMatriculaConsultarVehiculos = new JLabel("Matricula del vehiculo: ");
		lblNewLabelMatriculaConsultarVehiculos.setBounds(90, 96, 209, 17);
		add(lblNewLabelMatriculaConsultarVehiculos);
		
		textFieldConsultarVehiculos = new JTextField();
		textFieldConsultarVehiculos.setBounds(262, 94, 248, 21);
		add(textFieldConsultarVehiculos);
		textFieldConsultarVehiculos.setColumns(10);
		
		JButton btnNewButtonConsultarVehiculos = new JButton("Consultar datos");
		btnNewButtonConsultarVehiculos.setBounds(228, 307, 217, 27);
		add(btnNewButtonConsultarVehiculos);
		
		
	}

}