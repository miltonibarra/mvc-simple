package co.com.hobbies.jdbc.dao;

import java.util.List;

import co.com.hobbies.jdbc.entities.Sesion;

/**
 * Se definen los servicios para acceder a la base de datos
 * @author Milton
 */
public interface SesionDAO {

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
}
