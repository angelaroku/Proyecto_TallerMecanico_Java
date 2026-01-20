package proyecto_taller.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class AltaMecanicosVista  extends JPanel {
	private JTextField textFieldNombreMecanico;
	private JTextField textFieldCodigoMecanico;
	public AltaMecanicosVista() {
		setLayout(null);
		
		JLabel lblAltaMecanicos = new JLabel("Alta Mecanicos");
		lblAltaMecanicos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAltaMecanicos.setBounds(282, 62, 140, 14);
		add(lblAltaMecanicos);
		
		JLabel lblNombreMecanico = new JLabel("Nombre: ");
		lblNombreMecanico.setBounds(142, 139, 92, 14);
		add(lblNombreMecanico);
		
		textFieldNombreMecanico = new JTextField();
		textFieldNombreMecanico.setBounds(209, 136, 189, 20);
		add(textFieldNombreMecanico);
		textFieldNombreMecanico.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Introduzca los datos del nuevo mecánico: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel.setBounds(102, 102, 363, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabelEspecialidadMecanico = new JLabel("Especialidad: ");
		lblNewLabelEspecialidadMecanico.setBounds(142, 226, 92, 14);
		add(lblNewLabelEspecialidadMecanico);
		
		JLabel lblNewLabelCodigoMecanico = new JLabel("Codigo: ");
		lblNewLabelCodigoMecanico.setBounds(142, 178, 46, 14);
		add(lblNewLabelCodigoMecanico);
		
		textFieldCodigoMecanico = new JTextField();
		textFieldCodigoMecanico.setBounds(209, 176, 189, 20);
		add(textFieldCodigoMecanico);
		textFieldCodigoMecanico.setColumns(10);
		
		JButton btnNewButtonAltaMecanico = new JButton("Dar de alta al mecanico");
		btnNewButtonAltaMecanico.setBounds(145, 422, 214, 23);
		add(btnNewButtonAltaMecanico);
		
		JRadioButton rdbtnEspecialistaEnCoches = new JRadioButton("Especialista en coches");
		rdbtnEspecialistaEnCoches.setBounds(142, 247, 149, 23);
		add(rdbtnEspecialistaEnCoches);
		
		JRadioButton rdbtnEspecialistaEnMotos = new JRadioButton("Especialista en motos");
		rdbtnEspecialistaEnMotos.setBounds(309, 247, 149, 23);
		add(rdbtnEspecialistaEnMotos);
	}
}
