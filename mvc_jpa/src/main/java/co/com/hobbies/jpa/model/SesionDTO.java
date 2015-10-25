package co.com.hobbies.jpa.model;

import java.io.Serializable;

/**
 * Clase que contiene la informaci�n de las sesiones de la portada
 * @author Milton
 *
 */
public class SesionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 292407813194348828L;

	/**
	 * Titulo de la sesion
	 */
	private String titulo;
	
	/**
	 * Imagena asociada a la sesion
	 */
	private String imagen;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public SesionDTO(String titulo, String imagen) {
	  this.titulo = titulo;
	  this.imagen = imagen;
	}

	 public SesionDTO(String titulo) {
	    this.titulo = titulo;
	 }
}