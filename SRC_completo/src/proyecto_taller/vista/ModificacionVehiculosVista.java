package proyecto_taller.vista;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;

public class ModificacionVehiculosVista extends JPanel{
	private JTextField textFieldModificarVehiculos;
	private JRadioButton rdbtnNewRadioButtonModificarEstadoEnReparacion ;
	private JRadioButton rdbtnNewRadioButtonModificarEstadoEnEspera;
	private JRadioButton rdbtnNewRadioButtonModificarEstadoReparado;
	
	private JRadioButton rdbtnNewRadioButtonModificarTipoCoche;
	private JRadioButton rdbtnNewRadioButtonModificarTipoMoto;
 
	// controlador
	public ModificacionVehiculosVista() {
		setLayout(null);
		//thiis controlador
		
		JLabel lblModificarVehiculos = new JLabel("Modificar Vehiculos");
		lblModificarVehiculos.setBounds(228, 41, 142, 17);
		add(lblModificarVehiculos);
		
		JLabel lblNewLabelMatriculaModificarVehiculos = new JLabel("Matricula del vehiculo: ");
		lblNewLabelMatriculaModificarVehiculos.setBounds(90, 96, 209, 17);
		add(lblNewLabelMatriculaModificarVehiculos);
		
		textFieldModificarVehiculos = new JTextField();
		textFieldModificarVehiculos.setBounds(262, 94, 248, 21);
		add(textFieldModificarVehiculos);
		textFieldModificarVehiculos.setColumns(10);
		
		
		
		JLabel lblEstado = new JLabel("Estado: ");
		lblEstado.setBounds(90, 125, 60, 17);
		add(lblEstado);
		
		rdbtnNewRadioButtonModificarEstadoEnReparacion = new JRadioButton("En reparación");
		rdbtnNewRadioButtonModificarEstadoEnReparacion.setBounds(117, 150, 130, 25);
		add(rdbtnNewRadioButtonModificarEstadoEnReparacion);
		
		rdbtnNewRadioButtonModificarEstadoEnEspera = new JRadioButton("En espera");
		rdbtnNewRadioButtonModificarEstadoEnEspera.setBounds(262, 150, 130, 25);
		add(rdbtnNewRadioButtonModificarEstadoEnEspera);
		
		rdbtnNewRadioButtonModificarEstadoReparado = new JRadioButton("Reparado");
		rdbtnNewRadioButtonModificarEstadoReparado.setBounds(396, 150, 130, 25);
		add(rdbtnNewRadioButtonModificarEstadoReparado);
		
		
		JLabel lblTipo = new JLabel("Tipo: ");
		lblTipo.setBounds(90, 183, 60, 17);
		add(lblTipo);
		
		rdbtnNewRadioButtonModificarTipoCoche = new JRadioButton("Coche");
		rdbtnNewRadioButtonModificarTipoCoche.setBounds(204, 208, 130, 25);
		add(rdbtnNewRadioButtonModificarTipoCoche);
		
		rdbtnNewRadioButtonModificarTipoMoto = new JRadioButton("Moto");
		rdbtnNewRadioButtonModificarTipoMoto.setBounds(353, 208, 130, 25);
		add(rdbtnNewRadioButtonModificarTipoMoto);
		
		JLabel lblNewLabelModificarVehiculosAverias = new JLabel("Averias: ");
		lblNewLabelModificarVehiculosAverias.setBounds(90, 248, 73, 17);
		add(lblNewLabelModificarVehiculosAverias);
		
		

		JButton btnNewButtonModificarVehiculos = new JButton("Modificar datos");
		btnNewButtonModificarVehiculos.setBounds(228, 307, 217, 27);
		add(btnNewButtonModificarVehiculos);
		
	}
}
