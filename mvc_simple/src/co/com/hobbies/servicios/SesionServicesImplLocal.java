package co.com.hobbies.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.hobbies.jdbc.dao.SesionDAO;
import co.com.hobbies.jdbc.entities.Sesion;
import co.com.hobbies.jdbc.model.SesionDTO;

/**
 * Recuperar la informacion de los objetos sesion que se muestran en la pantalla
 * 
 * @author Milton
 */
public class SesionServicesImplLocal implements SesionServicesInterface {

	private ApplicationContext context;

	public List<SesionDTO> getSesiones() {

		context = new ClassPathXmlApplicationContext("Spring-Module.xml");

		// Se obtiene el servicio que implementa los servicios de la base de
		// datos
		SesionDAO sesionDAO = (SesionDAO) context.getBean("sesionDAO");

		// Crear la lista con los DTO
		List<SesionDTO> sesionList = new ArrayList<SesionDTO>();
		List<Sesion> sesions = sesionDAO.getSesionList();
		for (Sesion sesion : sesions) {
			// Creando un objeto de la lista de tipo sesionDTO
			SesionDTO sesionDTO = new SesionDTO();
			sesionDTO.setTitulo(sesion.getTitulo());
			sesionDTO.setImagen(sesion.getImagen());
			// Adicionando el objeto a la lista
			sesionList.add(sesionDTO);
		}
		return sesionList;
	}
}
