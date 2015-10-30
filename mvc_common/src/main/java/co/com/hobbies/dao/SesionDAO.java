package co.com.hobbies.dao;

import java.util.List;

import co.com.hobbies.model.SesionDTO;

/**
 * Se definen los servicios para acceder a la base de datos
 * @author Milton
 */
public interface SesionDAO {

	/**
	 * Obtiene un registro de la base ded atos asociado al identificador
	 * @param sesionId
	 * @return
	 */
	public SesionDTO findSesionById(int sesionId);
	
	/**
	 * Obtiene todas las sesiones que se mostraran
	 * @return
	 */
	public List<SesionDTO> getSesionList();
	
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
