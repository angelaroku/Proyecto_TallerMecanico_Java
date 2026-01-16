package proyecto_taller.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BajaVehiculosVista extends JPanel{
	private JTextField textFieldMatriculaBajaVehiculos;
	// controlador
	
	
	public BajaVehiculosVista() {
		setLayout(null);
		//thiis controlador
		
		JLabel lblBajaVehiculos = new JLabel("Baja Vehiculos");
		lblBajaVehiculos.setBounds(228, 41, 142, 17);
		add(lblBajaVehiculos);
		
		JLabel lblNewLabelMatriculaBajaVehiculos = new JLabel("Matricula del vehiculo: ");
		lblNewLabelMatriculaBajaVehiculos.setBounds(90, 96, 209, 17);
		add(lblNewLabelMatriculaBajaVehiculos);
		
		textFieldMatriculaBajaVehiculos = new JTextField();
		textFieldMatriculaBajaVehiculos.setBounds(262, 94, 248, 21);
		add(textFieldMatriculaBajaVehiculos);
		textFieldMatriculaBajaVehiculos.setColumns(10);
		
		JButton btnNewButtonBajaVehiculo = new JButton("Dar de baja");
		btnNewButtonBajaVehiculo.setBounds(228, 307, 105, 27);
		add(btnNewButtonBajaVehiculo);
	}
}