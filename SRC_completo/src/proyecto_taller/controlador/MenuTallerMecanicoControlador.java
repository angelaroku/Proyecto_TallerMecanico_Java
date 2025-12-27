package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.MenuGenTallerMecanico;
import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.vista.AltaVehiculosVista;

//CONTROLADOR DE MENU --> util para el boton comun de "< atras"

public class MenuTallerMecanicoControlador implements ActionListener{
	
	//vistas Vehiculos
	private AltaVehiculosVista altaVehiculosVista;
	//vistas mecanicos
	private MenuGenTallerMecanico tallerMecanicoVista;
	//vistas averías
	
	//vistas ficheros: IMPORTAR , EXPORTAR
	
	//vistas gestiones: RECEPCION, FINALIZAION, ENTREGA
	
	
	private DAO_TallerMecanico daoControlador;

	
	public MenuTallerMecanicoControlador(MenuGenTallerMecanico tallerMecanicoVista) {
		this.tallerMecanicoVista=tallerMecanicoVista;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*
		if (e.getSource()==btnNewButtonVolverInicio) {
			System.out.println("Volviendo a pantalla principal");
			altaVehiculosVista.volverInicioVehiculoVista();
		}
		*/

	}
	
}


/*
 
public class MenuTallerMecanicoControlador implements ActionListener{
	private MenuGenTallerMecanico tallerMecanicoVista;
	private AltaVehiculosVista altaVehiculosVista;
	private DAO_TallerMecanico daoControlador;

	
	public MenuTallerMecanicoControlador(MenuGenTallerMecanico tallerMecanicoVista) {
		this.tallerMecanicoVista=tallerMecanicoVista;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//if (e.getSource()==btnNewButtonVolverInicio) {
		//	System.out.println("Volviendo a pantalla principal");
		//	altaVehiculosVista.volverInicioVehiculoVista();
		//}

	}
	
}
 
 
 
 * */
