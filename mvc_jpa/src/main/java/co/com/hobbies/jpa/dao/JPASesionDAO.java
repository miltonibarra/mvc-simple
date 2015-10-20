package co.com.hobbies.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.hobbies.jpa.entities.Sesion;

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

}