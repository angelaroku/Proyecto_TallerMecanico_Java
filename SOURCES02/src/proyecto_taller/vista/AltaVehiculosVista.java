package proyecto_taller.vista;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;

import proyecto_taller.MenuGenTallerMecanico;
import proyecto_taller.controlador.AltaVehiculosControlador;
import proyecto_taller.controlador.TallerMecanicoControlador;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AltaVehiculosVista extends JPanel {
	private JTextField textFieldMatriculaVehiculo;
	private JTextField textFieldCodigoVAveria;
	private JTextField textFieldDescripcionVAveria;
	private JTextField textFieldCosteVAveria;
	
	private AltaVehiculosControlador controlador;
	private JButton btnNewButtonAltaVehiculo;
	
	private TallerMecanicoControlador controladorMenuTaller;
	private JButton btnNewButtonVolverInicio;
	
	public  AltaVehiculosVista () {
		setLayout(null);
		controlador=new AltaVehiculosControlador(this);
		controladorMenuTaller=new TallerMecanicoControlador(this);

		
		btnNewButtonVolverInicio = new JButton("< Volver    ");
		btnNewButtonVolverInicio.setBounds(23, 11, 119, 23);
		add(btnNewButtonVolverInicio);
		//conexion de boton con controlador de pantalla inicio
		btnNewButtonVolverInicio.addActionListener(controladorMenuTaller);
		
		JLabel lblNewLabelTitleAltaVehiculo = new JLabel("Alta Vehiculos");
		lblNewLabelTitleAltaVehiculo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelTitleAltaVehiculo.setBounds(238, 47, 140, 14);
		add(lblNewLabelTitleAltaVehiculo);
		
		JLabel lblNewLabelMatriculaVehiculo = new JLabel("Matrícula: ");
		lblNewLabelMatriculaVehiculo.setBounds(97, 97, 74, 14);
		add(lblNewLabelMatriculaVehiculo);
		
		textFieldMatriculaVehiculo = new JTextField();
		textFieldMatriculaVehiculo.setBounds(174, 94, 180, 20);
		add(textFieldMatriculaVehiculo);
		textFieldMatriculaVehiculo.setColumns(10);
		
		JLabel lblNewLabelEstadoVehiculo = new JLabel("Estado: ");
		lblNewLabelEstadoVehiculo.setBounds(97, 149, 75, 14);
		add(lblNewLabelEstadoVehiculo);
		
		JRadioButton rdbtnNewRadioButtonEstadoVEnReparacion = new JRadioButton("En Reparacion");
		rdbtnNewRadioButtonEstadoVEnReparacion.setBounds(138, 170, 109, 23);
		add(rdbtnNewRadioButtonEstadoVEnReparacion);
		
		JRadioButton rdbtnNewRadioButtonEstadoVEnEspera = new JRadioButton("En Espera");
		rdbtnNewRadioButtonEstadoVEnEspera.setBounds(269, 170, 109, 23);
		add(rdbtnNewRadioButtonEstadoVEnEspera);
		
		JRadioButton rdbtnNewRadioButtonEstadoVReparando = new JRadioButton("Reparando");
		rdbtnNewRadioButtonEstadoVReparando.setBounds(382, 170, 109, 23);
		add(rdbtnNewRadioButtonEstadoVReparando);
		
		JLabel lblNewLabelTipoVehiculo = new JLabel("Tipo:");
		lblNewLabelTipoVehiculo.setBounds(97, 223, 52, 14);
		add(lblNewLabelTipoVehiculo);
		
		JRadioButton rdbtnNewRadioButtonTipoVChoche = new JRadioButton("Coche");
		rdbtnNewRadioButtonTipoVChoche.setBounds(138, 244, 109, 23);
		add(rdbtnNewRadioButtonTipoVChoche);
		
		JRadioButton rdbtnNewRadioButtonTipoVMoto = new JRadioButton("Moto");
		rdbtnNewRadioButtonTipoVMoto.setBounds(269, 244, 109, 23);
		add(rdbtnNewRadioButtonTipoVMoto);
		
		textFieldCodigoVAveria = new JTextField();
		textFieldCodigoVAveria.setBounds(215, 332, 152, 20);
		add(textFieldCodigoVAveria);
		textFieldCodigoVAveria.setColumns(10);
		
		JLabel lblNewLabelAveriasVehiculo = new JLabel("Datos Averías: ");
		lblNewLabelAveriasVehiculo.setBounds(97, 303, 101, 14);
		add(lblNewLabelAveriasVehiculo);
		
		JLabel lblNewLabelCodigoAveria = new JLabel("Código: ");
		lblNewLabelCodigoAveria.setBounds(138, 335, 122, 14);
		add(lblNewLabelCodigoAveria);
		
		JLabel lblNewLabelDescripcionAveria = new JLabel("Descripción: ");
		lblNewLabelDescripcionAveria.setBounds(138, 371, 94, 14);
		add(lblNewLabelDescripcionAveria);
		
		textFieldDescripcionVAveria = new JTextField();
		textFieldDescripcionVAveria.setBounds(215, 368, 151, 20);
		add(textFieldDescripcionVAveria);
		textFieldDescripcionVAveria.setColumns(10);
		
		JLabel lblNewLabelCosteAveria = new JLabel("Coste:  ");
		lblNewLabelCosteAveria.setBounds(138, 403, 83, 14);
		add(lblNewLabelCosteAveria);
		
		textFieldCosteVAveria = new JTextField();
		textFieldCosteVAveria.setBounds(215, 400, 152, 20);
		add(textFieldCosteVAveria);
		textFieldCosteVAveria.setColumns(10);
		
		JButton btnNewButtonAddAveria = new JButton("Agregar avería");
		btnNewButtonAddAveria.setBounds(392, 399, 142, 23);
		add(btnNewButtonAddAveria);
		
		
		
		btnNewButtonAltaVehiculo = new JButton("Dar de alta al vehiculo");
		btnNewButtonAltaVehiculo.setBounds(97, 484, 191, 23);
		add(btnNewButtonAltaVehiculo);
		btnNewButtonAltaVehiculo.addActionListener(controlador);
		
	}
	
	/*
	 * 	private JTextField textFieldMatriculaVehiculo;
		private JTextField textFieldCodigoVAveria;
		private JTextField textFieldDescripcionVAveris;
		private JTextField textFieldCosteVAveria;
		
		private AltaVehiculosControlador controlador;
		private JButton btnNewButtonAltaVehiculo;
		
		private AltaVehiculosControlador controladorTaller;
		private JButton btnNewButtonVolverInicio;
	 * 
	 * */
	public String getMatriculaAltaVehiculoVista() {
		return textFieldMatriculaVehiculo.getText();
	}
	
	public boolean getButton() {
		return btnNewButtonVolverInicio.getAutoscrolls();
	}
}




