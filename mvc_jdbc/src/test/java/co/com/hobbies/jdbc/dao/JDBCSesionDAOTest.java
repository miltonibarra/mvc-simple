/**
 * 
 */
package co.com.hobbies.jdbc.dao;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.hobbies.jdbc.entities.Sesion;

/**
 * @author Milton
 *
 */
public class JDBCSesionDAOTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link co.com.udem.hobbies.jdbc.dao.JDBCSesionDAO#insert(co.com.udem.hobbies.jdbc.entities.Sesion)}.
	 */
	@Test
	public void testInsert() {
		// Se obtiene el contexto de la aplicacion 
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
    	// Se obtiene el servicio que implementa los servicios de la base de datos
    	SesionDAO sesionDAO = (SesionDAO) context.getBean("sesionDAO");
        
        // Se realiza el insert
        Sesion sesion = new Sesion();
        sesion.setId(2);
        sesion.setTitulo("Titulo 2");
        sesion.setImagen("Imagen 2");
        sesionDAO.insert(sesion);
	}

	/**
	 * Test method for {@link co.com.udem.hobbies.jdbc.dao.JDBCSesionDAO#findSesionById(int)}.
	 */
	@Test
	public void testFindSesionById() {
		// Se obtiene el contexto de la aplicacion 
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
    	// Se obtiene el servicio que implementa los servicios de la base de datos
    	SesionDAO sesionDAO = (SesionDAO) context.getBean("sesionDAO");
        
        // Se hace la consulta
        Sesion sesion = sesionDAO.findSesionById(2);
        System.out.println(sesion.getId() + " " + sesion.getTitulo() + " " + sesion.getImagen());
	}
	
	@Test
	public void testFindSesionList() {
		// Se obtiene el contexto de la aplicacion 
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
    	// Se obtiene el servicio que implementa los servicios de la base de datos
    	SesionDAO sesionDAO = (SesionDAO) context.getBean("sesionDAO");
        
        // Se hace la consulta
    	List<Sesion> sesionList = sesionDAO.getSesionList();
    	for (Sesion sesion1 : sesionList) {
    		Sesion sesion = sesion1; 
    		System.out.println(sesion.getId() + " " + sesion.getTitulo() + " " + sesion.getImagen());
		}
	}

}
