package co.com.hobbies.jdbc.entities;

/**
 * Entidad encargada de tener la informacion de los hobbies
 * @author Milton
 */
public class Sesion {
	
	/**
	 * Identificador de la fila dentro de la tabla
	 */
	private int id;
	
	/**
	 * Titulo de la sesion
	 */
	private String titulo;
	
	/**
	 * Imagena asociada a la sesion
	 */
	private String imagen;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}	
}
