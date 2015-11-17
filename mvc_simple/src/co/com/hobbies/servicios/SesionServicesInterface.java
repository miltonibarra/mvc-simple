package co.com.hobbies.servicios;

import java.util.List;

import co.com.hobbies.model.SesionDTO;


/**
 * Interface en donde se definen los serivicios disponibles para recuperar los objetos sesion
 * @author Milton
 *
 */
public interface SesionServicesInterface {

  /** Obtiene la informacion de las sesiones. */
  public List<SesionDTO> getSesiones();
}
