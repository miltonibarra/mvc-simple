package co.com.hobbies.servicios;

import java.util.ArrayList;
import java.util.List;

import co.com.hobbies.modelo.SesionDTO;

/**
 * Recuperar la informacion de los objetos sesion que se muestran en la pantalla
 * @author Milton
 */
public class SesionServicesImplLocal implements SesionServicesInterface {

	public List<SesionDTO> getSesiones() {
		
		/** Crear la lista */
		List<SesionDTO> sesionList = new ArrayList<SesionDTO>();
		
		/** Creando un objeto de la lista de tipo sesionDTO */
		SesionDTO sesion = new SesionDTO();
		sesion.setTitulo("Entretenimiento");
		sesion.setImagen("resources/img/portfolio/entretenimiento.jpg");
		
		/** Adicionando el objeto a la lista */
		sesionList.add(sesion);
		
		/** Creando un objeto de la lista de tipo sesionDTO */
		SesionDTO sesion2 = new SesionDTO();
		sesion2.setTitulo("Cursos");
		sesion2.setImagen("resources/img/portfolio/cursos.jpg");
		
		/** Adicionando el objeto a la lista */
		sesionList.add(sesion2);
		
		return sesionList;
	}
}
