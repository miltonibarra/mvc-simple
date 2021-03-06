package co.com.hobbies.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import co.com.hobbies.jdbc.entities.Sesion;

/**
 * Clase que implementa los servicios de la entidad Sesion
 * 
 * @author Milton
 */
public class JDBCSesionDAO implements SesionDAO {

	/** Datasource con la conexion a la base de datos */
	private DataSource dataSource;

	/**
	 * Establece la conexion a la base de datos a partir del Datasource
	 * 
	 * @param dataSource
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public boolean insert(Sesion sesion) {
		String sql = "INSERT INTO sesion (id, titulo, imagen) VALUES (?,?,?)";
		Connection connection = null;
		PreparedStatement pStatement = null;
		boolean result = false;

		try {
			// Se obtiene la conexion a la base de datos
			connection = dataSource.getConnection();

			// Preparando la sentencia que se ejecutara en la base de datos
			pStatement = connection.prepareStatement(sql);
			pStatement.setInt(1, sesion.getId());
			pStatement.setString(2, sesion.getTitulo());
			pStatement.setString(3, sesion.getImagen());

			// Ejecuta la sentencia
			result = pStatement.execute();

			// Liberar el recurso
			pStatement.close();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	public Sesion findSesionById(int sesionId) {

		Sesion sesion = new Sesion();

		// Sentencia de base de datos
		String sql = "SELECT * FROM sesion WHERE id = ?";

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// Se obtiene la conexion a la base de datos desde el datasource
			conn = dataSource.getConnection();

			ps = conn.prepareStatement(sql);
			ps.setInt(1, sesionId);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				sesion.setId(rs.getInt("id"));
				sesion.setTitulo(rs.getString("titulo"));
				sesion.setImagen(rs.getString("imagen"));
			}
			rs.close();
			ps.close();
			return sesion;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

	}

	public List<Sesion> getSesionList() {
		
		List<Sesion> sesionList = new ArrayList<Sesion>();

		// Sentencia de base de datos
		String sql = "SELECT * FROM sesion";

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// Se obtiene la conexion a la base de datos desde el datasource
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Sesion sesion = new Sesion();
				sesion.setId(rs.getInt("id"));
				sesion.setTitulo(rs.getString("titulo"));
				sesion.setImagen(rs.getString("imagen"));
				sesionList.add(sesion);
			}
			rs.close();
			ps.close();
			return sesionList;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}
}
