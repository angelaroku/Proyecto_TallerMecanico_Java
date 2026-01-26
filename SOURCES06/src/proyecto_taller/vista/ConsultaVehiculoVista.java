package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import proyecto_taller.controlador.ConsultaVehiculosControlador;

public class ConsultaVehiculoVista extends JPanel{
	private static final long serialVersionUID = 1L;

	private JTextField textFieldConsultarVehiculos;
	
	private JButton btnNewButtonConsultarVehiculos;
	private ConsultaVehiculosControlador controlador;
	
	public ConsultaVehiculoVista() {
		setLayout(null);
		controlador=new ConsultaVehiculosControlador(this);

		
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
		
		btnNewButtonConsultarVehiculos = new JButton("Consultar datos");
		btnNewButtonConsultarVehiculos.setBounds(228, 307, 217, 27);
		add(btnNewButtonConsultarVehiculos);
		//conexion de boton con controlador
		btnNewButtonConsultarVehiculos.addActionListener(controlador);
		
	}
	//Metodos que recogen datos relacionados con más clases que la vista


}