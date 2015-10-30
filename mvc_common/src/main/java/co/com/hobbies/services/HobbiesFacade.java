package co.com.hobbies.services;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.hobbies.dao.SesionDAO;
import co.com.hobbies.model.SesionDTO;

/**
 * Clase en donde se exponen todos los servicios ofrecidos por el backend de hobbies
 * @author Milton
 *
 */
public class HobbiesFacade {
  
  public List<SesionDTO> getFirstSesionDTOFromIndex() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    SesionDAO sesionDAO = context.getBean(SesionDAO.class);
    return sesionDAO.getSesionDTOList();
  }

}
