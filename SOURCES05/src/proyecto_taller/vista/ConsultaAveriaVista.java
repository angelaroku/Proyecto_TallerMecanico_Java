package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import proyecto_taller.controlador.ConsultaAveriaControlador;

public class ConsultaAveriaVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JButton btnNewButtonConsultaAveria;
	private ConsultaAveriaControlador controlador;

	public ConsultaAveriaVista() {
		setLayout(null);
		controlador=new ConsultaAveriaControlador(this);

		
		btnNewButtonConsultaAveria = new JButton("Consultar avería");
		btnNewButtonConsultaAveria.setBounds(172, 196, 105, 27);
		add(btnNewButtonConsultaAveria);
		//conexion de boton con controlador
		btnNewButtonConsultaAveria.addActionListener(controlador);
		
	}

	//Metodos que recogen datos relacionados con más clases que la vista


}
