package co.com.hobbies.jpa.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.hobbies.dao.SesionDAO;
import co.com.hobbies.model.SesionDTO;

public class JPASesionDAOTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testInsert() {
    fail("Not yet implemented");
  }

  @Test
  public void testFindSesionById() {
    fail("Not yet implemented");
  }

  @Test
  public void testGetSesionList() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    SesionDAO sesionDAO = context.getBean(SesionDAO.class);
    
    List<SesionDTO> sesionList = sesionDAO.getSesionList();
    for (SesionDTO sesion : sesionList) {
      System.out.println(sesion.getTitulo() + " " + sesion.getImagen());
    }
    
    context.close();
  }
  
  @Test
  public void testGetSesionDTOList() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    SesionDAO sesionDAO = context.getBean(SesionDAO.class);
    
    List<SesionDTO> sesionDTOList = sesionDAO.getSesionDTOList();
    for (SesionDTO sesionDTO : sesionDTOList) {
      System.out.println(sesionDTO.getTitulo() + " " + sesionDTO.getImagen());
    }
    
    context.close();
  }
}
