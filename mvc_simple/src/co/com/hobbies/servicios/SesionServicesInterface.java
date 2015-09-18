package co.com.hobbies.servicios;

import java.util.List;

import co.com.hobbies.modelo.SesionDTO;

/**
 * Interface en donde se definen los serivicios disponibles para recuperar los objetos sesion
 * @author Milton
 *
 */
public interface SesionServicesInterface {

	public List<SesionDTO> getSesiones();
}
