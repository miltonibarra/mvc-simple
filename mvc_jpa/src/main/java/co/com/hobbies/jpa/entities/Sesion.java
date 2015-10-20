package co.com.hobbies.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad encargada de tener la informacion de los hobbies
 * @author Milton
 */
@Entity
@Table(name="sesion")
public class Sesion {
	
	/**
	 * Identificador de la fila dentro de la tabla
	 */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
	private int id;
	
	/**
	 * Titulo de la sesion
	 */
  @Column(name="titulo")
	private String titulo;
	
	/**
	 * Imagena asociada a la sesion
	 */
  @Column(name="imagen")
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
