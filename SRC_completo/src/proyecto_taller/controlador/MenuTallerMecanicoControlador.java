package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.MenuGenTallerMecanico;
import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.vista.AltaAveriasVista;
import proyecto_taller.vista.AltaMecanicosVista;
import proyecto_taller.vista.AltaVehiculosVista;
import proyecto_taller.vista.BajaAveriasVista;
import proyecto_taller.vista.BajaMecanicosVista;
import proyecto_taller.vista.BajaVehiculosVista;
import proyecto_taller.vista.ConsultaAveriasVista;
import proyecto_taller.vista.ConsultaMecanicosVista;
import proyecto_taller.vista.ConsultaVehiculosVista;
import proyecto_taller.vista.FicherosExportarVista;
import proyecto_taller.vista.FicherosImportarVista;
import proyecto_taller.vista.GestionEntregaVehiculosReparadosVista;
import proyecto_taller.vista.GestionFinalizacionReparacionVista;
import proyecto_taller.vista.GestionRecepcionVehiculoVista;
import proyecto_taller.vista.ModificacionAveriasVista;
import proyecto_taller.vista.ModificacionMecanicosVista;
import proyecto_taller.vista.ModificacionVehiculosVista;

//CONTROLADOR DE MENU --> util para el boton comun de "< atras"

public class MenuTallerMecanicoControlador implements ActionListener{
	
	//VISTA INICIO
	private MenuGenTallerMecanico tallerMecanicoVista;
	
	//EL RESTO DE VISTAS
		//vistas Vehiculos
	private AltaVehiculosVista altaVehiculosVista;
	private BajaVehiculosVista bajaVehiculosVista;
	private ConsultaVehiculosVista consultaVehiculosVista;
	private ModificacionVehiculosVista modificacionVehiculosVista;
	
		//vistas mecanicos
	private AltaMecanicosVista altamecanicosvista;
	private BajaMecanicosVista bajamecanicosvista;
	private ConsultaMecanicosVista consultaMecanicosvista;
	private ModificacionMecanicosVista modificacionMecanicosvista;
	
	
		//vistas averías
	private AltaAveriasVista altaAveriasVista;
	private BajaAveriasVista bajaAveriasVista;
	private ConsultaAveriasVista consultaAveriasVista;
	private ModificacionAveriasVista modificacionAveriasVista;
	
		//vistas ficheros: IMPORTAR , EXPORTAR
	private FicherosImportarVista ficherosImportarVista;
	private FicherosExportarVista ficherosExportarVista;
	
		//vistas gestiones: RECEPCION, FINALIZAION, ENTREGA
	private GestionEntregaVehiculosReparadosVista gestionEntregaVehiculosReparadosVista;
	private GestionRecepcionVehiculoVista gestionRecepcionVehiculoVista;
	private GestionFinalizacionReparacionVista gestionFinalizacionReparacionVista;

	
	private DAO_TallerMecanico daoControlador;

	/*
	public MenuTallerMecanicoControlador(MenuGenTallerMecanico tallerMecanicoVista) {
		this.tallerMecanicoVista=tallerMecanicoVista;
	}*/
	
	public MenuTallerMecanicoControlador(AltaVehiculosVista altaVehiculosVista){
		this.altaVehiculosVista=altaVehiculosVista;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.equals(e)==altaVehiculosVista.getButton()) {
			System.out.println("Volviendo a pantalla principal");
			if (altaVehiculosVista.getButton() != false) {
				//dao.volver a inicio
			}
			
		} else {
			
		}
		

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
