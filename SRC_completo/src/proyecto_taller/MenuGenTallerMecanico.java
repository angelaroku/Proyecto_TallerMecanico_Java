package proyecto_taller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import proyecto_taller.vista.AltaAveriasVista;
import proyecto_taller.vista.AltaMecanicosVista;
import proyecto_taller.vista.AltaVehiculosVista;
import proyecto_taller.vista.BajaAveriasVista;
import proyecto_taller.vista.BajaMecanicosVista;
import proyecto_taller.vista.BajaVehiculosVista;
import proyecto_taller.vista.ConsultarAveriasVista;
import proyecto_taller.vista.ConsultarMecanicosVista;
import proyecto_taller.vista.ConsultarVehiculosVista;
import proyecto_taller.vista.ModificarAveriasVista;
import proyecto_taller.vista.ModificarMecanicosVista;
import proyecto_taller.vista.ModificarVehiculosVista;

public class MenuGenTallerMecanico extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JMenuItem mntmNewMenuItemAltaVehiculos;
	private JMenuItem mntmNewMenuItemBajaVehiculos;
	private JMenuItem mntmNewMenuItemConsultaVehiculos;
	private JMenuItem mntmModificarVehiculos;
	
	private JMenuItem mntmNewMenuItemAltaMecanicos;
	private JMenuItem mntmNewMenuItemBajaMecanicos;
	private JMenuItem mntmNewMenuItemConsultaMecanicos;
	private JMenuItem mntmNewMenuItemModificarMecanicos;

	private JMenuItem mntmNewMenuItemAltaAverias;
	private JMenuItem mntmNewMenuItemBajaAverias;
	private JMenuItem mntmConsultarAverias;
	private JMenuItem mntmModificarAverias;
	
	private JMenuItem mntmMenuItemImportar;
	private JMenuItem mntmMenuItemExportar;
	
	private JMenuItem mntmMenuItemG1RecibirVehiculo;
	private JMenuItem mntmMenuItemG2FinalizarReparacion;
	private JMenuItem mntmMenuItemG3EntregarVehiculosReparados;
	
	
	public MenuGenTallerMecanico() {
		setTitle("Taller Mecanico");
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 22, 583, 23);
		getContentPane().add(menuBar);
		
		JMenu mnNewMenuVehiculos = new JMenu("Vehículos");
		menuBar.add(mnNewMenuVehiculos);
		
		mntmNewMenuItemAltaVehiculos = new JMenuItem("Dar de alta un nuevo vehículo");
		mnNewMenuVehiculos.add(mntmNewMenuItemAltaVehiculos);
		mntmNewMenuItemAltaVehiculos.addActionListener(this);
		mntmNewMenuItemBajaVehiculos = new JMenuItem("Dar de baja un vehículo");
		mnNewMenuVehiculos.add(mntmNewMenuItemBajaVehiculos);
		mntmNewMenuItemBajaVehiculos.addActionListener(this);
		mntmNewMenuItemConsultaVehiculos = new JMenuItem("Consultar un vehículo");
		mnNewMenuVehiculos.add(mntmNewMenuItemConsultaVehiculos);
		mntmNewMenuItemConsultaVehiculos.addActionListener(this);
		mntmModificarVehiculos = new JMenuItem("Modificar un vehículo");
		mnNewMenuVehiculos.add(mntmModificarVehiculos);
		mntmModificarVehiculos.addActionListener(this);
		
		JMenu mnNewMenuMecanicos = new JMenu("Mecánicos");
		menuBar.add(mnNewMenuMecanicos);
		
		mntmNewMenuItemAltaMecanicos = new JMenuItem("Dar de alta un nuevo mecánico");
		mnNewMenuMecanicos.add(mntmNewMenuItemAltaMecanicos);
		mntmNewMenuItemAltaMecanicos.addActionListener(this);
		mntmNewMenuItemBajaMecanicos = new JMenuItem("Dar de baja un mecánico");
		mnNewMenuMecanicos.add(mntmNewMenuItemBajaMecanicos);
		mntmNewMenuItemBajaMecanicos.addActionListener(this);
		
		mntmNewMenuItemConsultaMecanicos = new JMenuItem("Consultar mecánico");
		mnNewMenuMecanicos.add(mntmNewMenuItemConsultaMecanicos);
		mntmNewMenuItemConsultaMecanicos.addActionListener(this);
		
		mntmNewMenuItemModificarMecanicos = new JMenuItem("Modificar mecánico");
		mnNewMenuMecanicos.add(mntmNewMenuItemModificarMecanicos);
		mntmNewMenuItemModificarMecanicos.addActionListener(this);
		
		JMenu mnNewMenuAverias;mnNewMenuAverias = new JMenu("Averías");
		menuBar.add(mnNewMenuAverias);
		
		mntmNewMenuItemAltaAverias = new JMenuItem("Dar de alta una nueva avería");
		mnNewMenuAverias.add(mntmNewMenuItemAltaAverias);
		mntmNewMenuItemAltaAverias.addActionListener(this);
		
		mntmNewMenuItemBajaAverias = new JMenuItem("Dar de baja una avería");
		mnNewMenuAverias.add(mntmNewMenuItemBajaAverias);
		mntmNewMenuItemBajaAverias.addActionListener(this);
		
		mntmConsultarAverias = new JMenuItem("Consultar averías");
		mnNewMenuAverias.add(mntmConsultarAverias);
		mntmConsultarAverias.addActionListener(this);
		
		mntmModificarAverias = new JMenuItem("Modificar averías");
		mnNewMenuAverias.add(mntmModificarAverias);
		
		JMenu mnFicheros = new JMenu("Ficheros");
		menuBar.add(mnFicheros);
		
		mntmMenuItemImportar = new JMenuItem("Importar información");
		mnFicheros.add(mntmMenuItemImportar);
		mntmMenuItemImportar.addActionListener(this);
		
		mntmMenuItemExportar = new JMenuItem("Exportar información");
		mnFicheros.add(mntmMenuItemExportar);
		mntmMenuItemExportar.addActionListener(this);
		
		JMenu mnNewMenuGestiones = new JMenu("Gestiones");
		menuBar.add(mnNewMenuGestiones);
		
		mntmMenuItemG1RecibirVehiculo = new JMenuItem("Recepción de vehículo");
		mnNewMenuGestiones.add(mntmMenuItemG1RecibirVehiculo);
		mntmMenuItemG1RecibirVehiculo.addActionListener(this);
		
		mntmMenuItemG2FinalizarReparacion = new JMenuItem("Finalización de una reparación");
		mnNewMenuGestiones.add(mntmMenuItemG2FinalizarReparacion);
		mntmMenuItemG2FinalizarReparacion.addActionListener(this);
		
		mntmMenuItemG3EntregarVehiculosReparados = new JMenuItem("Entrega de vehículos reparados");
		mnNewMenuGestiones.add(mntmMenuItemG3EntregarVehiculosReparados);
		mntmMenuItemG3EntregarVehiculosReparados.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	 //CRUD VEHICULOS aviso por consola + conexion con Vista
		
		if (e.getSource()==mntmNewMenuItemAltaVehiculos) {
			System.out.println("Pantalla  Alta Vehículos");
			this.setContentPane(new AltaVehiculosVista());
			setVisible(true);
		} else if (e.getSource()==mntmNewMenuItemBajaVehiculos) {
			System.out.println("Pantalla Baja Vehículos");
			this.setContentPane(new BajaVehiculosVista());
			setVisible(true);
			
		} else if (e.getSource()==mntmNewMenuItemConsultaVehiculos) {
			System.out.println("Pantalla Consulta Vehículos");
			this.setContentPane(new ConsultarVehiculosVista());
			setVisible(true);
			
		} else if (e.getSource()==mntmModificarVehiculos) {
			System.out.println("Pantalla Modificar Vehiculos");
			this.setContentPane(new ModificarVehiculosVista());
			setVisible(true);
			
		}
		
		//CRUD MECANICOS aviso por consola + conexion con Vista
		
		if (e.getSource()==mntmNewMenuItemAltaMecanicos) {
			System.out.println("Pantalla  Alta Mecanicos");
			this.setContentPane(new AltaMecanicosVista());
			setVisible(true);
			
		} else if (e.getSource()==mntmNewMenuItemBajaMecanicos) {
			System.out.println("Pantalla Baja Mecanicos");
			this.setContentPane(new BajaMecanicosVista());
			setVisible(true);
			
		} else if (e.getSource()==mntmNewMenuItemConsultaMecanicos) {
			System.out.println("Pantalla Consulta Mecanicos");
			this.setContentPane(new ConsultarMecanicosVista());
			setVisible(true);
			
		} else if (e.getSource()==mntmNewMenuItemModificarMecanicos) {
			System.out.println("Pantalla Modificar Mecanicos");
			this.setContentPane(new ModificarMecanicosVista());
			setVisible(true);
		}
		
		//CRUD AVERIAS aviso por consola + conexion con Vista
		
		if (e.getSource()==mntmNewMenuItemAltaAverias) {
			System.out.println("Pantalla  Alta Averías");
			this.setContentPane(new AltaAveriasVista());
			setVisible(true);
			
		} else if (e.getSource()==mntmNewMenuItemBajaAverias) {
			
			System.out.println("Pantalla Baja Averías");
			this.setContentPane(new BajaAveriasVista());
			setVisible(true);
			
		} else if (e.getSource()==mntmConsultarAverias) {
			System.out.println("Pantalla Consulta Averías");
			this.setContentPane(new ConsultarAveriasVista());
			setVisible(true);
			
		} else if (e.getSource()==mntmModificarAverias) {
			System.out.println("Pantalla Modificar Averías");
			this.setContentPane(new ModificarAveriasVista());
			setVisible(true);
		}
		

		//Ficheros: IMPORTAR | EXPORTAR - aviso por consola + conexion con Vista
		
		if (e.getSource()==mntmMenuItemImportar) {
			System.out.println("Pantalla Importar Ficheros");
			
		} else if (e.getSource()==mntmMenuItemExportar) {
			System.out.println("Pantalla Exportar Ficheros");
			
		} 
		
		//Gestiones: RECEPCION | FINALIZAION | ENTREGA - aviso por consola + conexion con Vista
		
		if (e.getSource()==mntmMenuItemG1RecibirVehiculo) {
			System.out.println("Pantalla  Gestion 1 - Recibir Vehículo");
			
		} else if (e.getSource()==mntmMenuItemG2FinalizarReparacion) {
			System.out.println("Pantalla  Gestion 2 - Finalizar Reparación");
			
		} else if (e.getSource()==mntmMenuItemG3EntregarVehiculosReparados) {
			System.out.println("Pantalla  Gestion 3 - Entregar Vehículos Reparados");
			
		}
		
	}
}
