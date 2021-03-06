package co.com.hobbies.jpa.dao;

import java.util.List;

import co.com.hobbies.jpa.entities.Sesion;
import co.com.hobbies.model.SesionDTO;

/**
 * Se definen los servicios para acceder a la base de datos
 * @author Milton
 */
public interface SesionDAOold {

	/**
	 * Inserta un registro nuevo en la base de datos
	 * @param sesion
	 * @return
	 */
	public boolean insert(Sesion sesion);
	
	/**
	 * Obtiene un registro de la base ded atos asociado al identificador
	 * @param sesionId
	 * @return
	 */
	public Sesion findSesionById(int sesionId);
	
	/**
	 * Obtiene todas las sesiones que se mostraran
	 * @return
	 */
	public List<Sesion> getSesionList();
	
	 /**
   * Obtiene todas las sesiones que se mostraran
   * @return
   */
  public List<SesionDTO> getSesionDTOList();
  
  /**
  * Obtiene todas las sesiones que se mostraran
  * @return
  */
 public List<SesionDTO> getTitulosSesionDTOList();

}
