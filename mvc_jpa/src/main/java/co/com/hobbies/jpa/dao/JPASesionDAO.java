package co.com.hobbies.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.hobbies.jpa.entities.Sesion;
import co.com.hobbies.jpa.model.SesionDTO;

@Repository
public class JPASesionDAO implements SesionDAO {
  
  @PersistenceContext
  private EntityManager em = null;
  
  public boolean insert(Sesion sesion) {
    return false;
  }

  public Sesion findSesionById(int sesionId) {
    return null;
  }

  @Transactional
  public List<Sesion> getSesionList() {
    List<Sesion> sesionList = em.createQuery("SELECT s FROM Sesion s ORDER BY s.id").getResultList(); 
    return sesionList;
  }

  public List<SesionDTO> getSesionDTOList() {
    List<SesionDTO> sesionDTOList = null;
    sesionDTOList = em.createQuery(queryBuilder("s.titulo", "s.imagen")).getResultList(); 
    return sesionDTOList;
  }

  public List<SesionDTO> getTitulosSesionDTOList() {
    List<SesionDTO> sesionDTOList = null;
    sesionDTOList = em.createQuery(queryBuilder("s.titulo")).getResultList();
    return sesionDTOList;
  }
  
  private String queryBuilder(String... parametros){
    String query = "";
    StringBuilder sb = new StringBuilder("SELECT new co.com.hobbies.jpa.model.SesionDTO(");
    for (String parametro : parametros) {
      sb.append(parametro);
      sb.append(", ");
    }
    sb = new StringBuilder(sb.substring(0, sb.length() - 2));
    sb.append(") FROM Sesion s ORDER BY s.id");
    query = sb.toString();
    return query;
  }
  
}
